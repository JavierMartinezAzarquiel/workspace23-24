package ejercicios.examen2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import ejercicios.ejercicio2.Planta;


public class EjercicioExamen2 {

	private static File archivoCompras = new File(".\\src\\ejercicios\\examen2\\compras.obj");
	private static File archivoFusion = new File(".\\src\\ejercicios\\examen2\\fusion.obj");
	
	public static void main(String[] args) {
		//Obtener los objetos Compra
		ArrayList<Compra> listaCompras =getCompras();
		//Generar el archivo Fusión
		generarFusion(listaCompras);
	}

	public static ArrayList<Compra> getCompras(){
		//preparar una lista vacía para ir guardando los objetos que leamos
		ArrayList<Compra> lista = new ArrayList<Compra>();

		ObjectInputStream stream = null;

		try {
			stream = new ObjectInputStream(new FileInputStream(archivoCompras));

			while(true) {
				//recuperar todas las Compras
				Compra c = (Compra) stream.readObject();
				lista.add(c);
			}


		} catch (EOFException e) {
			//cuando salte esta excepción el archivo se ha acabado
			return lista;
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de lectura");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: El archivo no contiene objetos Compra");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		return null;
	}
	
	public static void generarFusion(ArrayList<Compra> listaCompras) {
		ObjectOutputStream stream = null;

		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivoFusion));

			ArrayList<Compra> listaResultado = new ArrayList<Compra>();
			
			for (Compra compra : listaCompras) {
				//buscamos si hay una compra de ese departamento en el resultado
				Compra compraBuscada = buscarCompra(listaResultado, compra);
				//si ya la hay, le añado la cantidad
				if (compraBuscada != null) {
					compraBuscada.setCantidad(compraBuscada.getCantidad()+compra.getCantidad());
				}else {
					//si no la hay, añado el objeto compra
					listaResultado.add(compra);
				}
				
			}
			
			//ahora escribo los objetos en el archivo
			for (Compra compra : listaResultado) {
				stream.writeObject(compra);
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de escritura");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}

	}
	
	//método para buscar una compra
	public static Compra buscarCompra(ArrayList<Compra> listaCompras, Compra c) {
		for (Compra compra : listaCompras) {
			if (compra.getDepartamento().equals(c.getDepartamento())) {
				return compra;
			}
		}
		return null;
	}
}



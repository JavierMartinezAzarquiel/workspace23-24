package ejercicios.ejercicio2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import pruebasConObjetos.Contacto;

public class Ejercicio2 {

	private static File archivo = new File(".\\src\\ejercicios\\ejercicio2\\Plantas.venta");

	public static void main(String[] args) {
		//obtener los objetos planta
		ArrayList<Planta> listaDePlantas = getPlantas();
		System.out.println(listaDePlantas);
		//actualizar el precio de las plantas
		actualizarPrecio(listaDePlantas);
		System.out.println(listaDePlantas);
		//guardar las plantas en el archivo
		savePlantas(listaDePlantas);
		System.out.println( getPlantas() );
	}

	public static ArrayList<Planta> getPlantas(){
		//preparar una lista vacía para ir guardando los objetos que leamos
		ArrayList<Planta> lista = new ArrayList<Planta>();

		ObjectInputStream stream = null;

		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));

			while(true) {
				//recuperar todas las plantas
				Planta p = (Planta) stream.readObject();
				lista.add(p);
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
			System.out.println("Error: El archivo no contiene objetos Planta");
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

	public static void actualizarPrecio(ArrayList<Planta> listaDePlantas) {
		for (Planta planta : listaDePlantas) {
			if(planta.getCantidad() < 10) {
				planta.setPrecio( planta.getPrecio() * 0.8 );
			}else if(planta.getCantidad() <= 50) {
				planta.setPrecio( planta.getPrecio() * 0.7 );
			}else {
				planta.setPrecio( planta.getPrecio() * 0.6 );
			}
		}
	}


	public static void savePlantas(ArrayList<Planta> listaDePlantas) {
		ObjectOutputStream stream = null;

		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivo));

			for (Planta planta : listaDePlantas) {
				stream.writeObject(planta);
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

}



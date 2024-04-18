package ejercicios.ejercicio4;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;

import ejercicios.ejercicio2.Planta;

public class Ejercicio4 {
	
	private static File archivoVehiculos = new File(".\\src\\ejercicios\\ejercicio4\\vehiculos.exp");

	public static void main(String[] args) {
		//obtener los objetos vehículo del archivo
		ArrayList<Vehiculo> listaVehiculos = getVehiculos();
		
		//actualizar los precios de los vehiculos que llevan mucho tiempo en exposición
		actualizarPrecios(listaVehiculos);
		
		//guardar los vehiculos ya modificados en el archivo
		guardarVehiculos(listaVehiculos);
	}

	public static void actualizarPrecios(ArrayList<Vehiculo> listaVehiculos) {
		//para cada vehículo, compruebo si ha estado mas de 5 dias
		for (Vehiculo vehiculo : listaVehiculos) {
			Period duracion = Period.between(vehiculo.getEntradaEnExposicion(), LocalDate.now());
			if(duracion.getDays() > 5) {
				vehiculo.setPrecio( vehiculo.getPrecio() * 0.85F);
			}
		}
	}
	
	
	public static ArrayList<Vehiculo> getVehiculos(){
		//preparar una lista vacía para ir guardando los objetos que leamos
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

		ObjectInputStream stream = null;

		try {
			stream = new ObjectInputStream(new FileInputStream(archivoVehiculos));

			while(true) {
				lista.add((Vehiculo) stream.readObject());
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
			System.out.println("Error: El archivo no contiene objetos vehiculo");
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
	
	public static void guardarVehiculos(ArrayList<Vehiculo> lista) {
		ObjectOutputStream stream = null;

		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivoVehiculos));

			for (Vehiculo vehiculo : lista) {
				stream.writeObject(vehiculo);
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

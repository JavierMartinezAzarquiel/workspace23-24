package ejercicios.ejercicio3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Ejercicio3 {

	private static File archivoPeonadas = new File(".\\src\\ejercicios\\ejercicio3\\Peonadas.txt");
	private static File archivoTrabajadores = new File(".\\src\\ejercicios\\ejercicio3\\Trabajadores.txt");
	private static File archivoTotalPeonadas = new File(".\\src\\ejercicios\\ejercicio3\\TotalPeonadas.txt");


	public static void main(String[] args) {
		//Leer el archivo Trabajadores.txt y generar un objeto por cada trabajador
		ArrayList<Trabajador> listaTrabajadores = getTrabajadores();

		//Leer el archivo Peonadas.txt y para cada Trabajador que aparezca, le añado una peonada
		calcularPeonadas(listaTrabajadores);

		//Crear el archivo TotalPeonadas.txt. Para cada objeto, añado una linea de texto con nombre:peonadas
		crearArchivoTotalPeonadas(listaTrabajadores);

	}


	public static ArrayList<Trabajador> getTrabajadores(){
		//preparamos una lista vacía para ir añadiendo los objetos trabajador
		ArrayList<Trabajador> lista = new ArrayList<Trabajador>();
		
		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivoTrabajadores) );

			String linea;
			while( (linea = stream.readLine()) != null) {
				//añado un objeto trabajador con el nombre que viene en la linea
				lista.add( new Trabajador(linea, 0) );
			}
		} catch (IOException e) {
			System.out.println("Error leyendo en el archivo");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el archivo");
			}
		}

		return lista;

	}


	public static void calcularPeonadas(ArrayList<Trabajador> listaTrabajadores) {
		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivoPeonadas) );

			String linea;
			while( (linea = stream.readLine()) != null) {
				//en cada linea aparecen vario trabajadores
				//recorro la lista de trabajadores y compruebo si ese trabajador aparece en la linea
				for (Trabajador trabajador : listaTrabajadores) {
					if(linea.indexOf(trabajador.getNombre()) != -1) {
						//si encuentro su nombre en la linea, le añado una peonada
						trabajador.setPeonadas(trabajador.getPeonadas()+1);
					}
				}
			}
		} catch (IOException e) {
			System.out.println("Error leyendo en el archivo");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el archivo");
			}
		}
	}
	
	
	public static void crearArchivoTotalPeonadas(ArrayList<Trabajador> listaTrabajadores) {
		//Stream
		BufferedWriter stream = null;
		
		try {
			//creamos el stream
			stream =new BufferedWriter( new FileWriter(archivoTotalPeonadas) );
			
			//Para cada trabajador tengo que imprimir una linea con  "nombre:peonadas"
			for (Trabajador trabajador : listaTrabajadores) {
				stream.write(trabajador.getNombre() + ":" + trabajador.getPeonadas());
				stream.newLine();
			}
			
		} catch (IOException e) {
			System.out.println("Error escribiendo en el archivo");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el archivo");
			}
		}
	}

}

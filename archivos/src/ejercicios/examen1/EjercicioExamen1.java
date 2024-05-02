package ejercicios.examen1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

import ejercicios.ejercicio3.Trabajador;
import ejercicios.ejercicio5.Jugador;
import ejercicios.ejercicio5.Seleccion;

public class EjercicioExamen1 {

	private static File archivoCombinaciones = new File(".\\src\\ejercicios\\examen1\\combinaciones.txt");
	private static File archivoCombiGanadora = new File(".\\src\\ejercicios\\examen1\\combiGanadora.txt");
	private static File archivoPremios = new File(".\\src\\ejercicios\\examen1\\premios.txt");
	
	
	public static void main(String[] args) {
		//Obtengo los objetos combinacion
		ArrayList<Combinacion> listaCombinaciones = getCombinaciones();
		//Obtener la combinacion ganadora
		Combinacion combinacionGanadora = getCombiGanadora();
		//Generar el archivo de premios
		generarArchivoPremios(listaCombinaciones, combinacionGanadora);
	}

	public static ArrayList<Combinacion> getCombinaciones(){
		//preparamos una lista vacía para ir añadiendo los objetos combinacion
		ArrayList<Combinacion> lista = new ArrayList<Combinacion>();
		
		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivoCombinaciones) );

			String linea;
			while( (linea = stream.readLine()) != null) {
				ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
				StringTokenizer st = new StringTokenizer(linea,",");
				while(st.hasMoreTokens()) {
					int numero = Integer.parseInt(st.nextToken());
					listaNumeros.add(numero);
				}
				Combinacion c = new Combinacion(listaNumeros);
				lista.add(c);
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
	
	public static Combinacion getCombiGanadora(){	
		Combinacion c = null; //variable donde guardar la combinación ganadora
		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivoCombiGanadora) );

			String linea = stream.readLine();
			
			ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
			StringTokenizer st = new StringTokenizer(linea,",");
			while(st.hasMoreTokens()) {
				int numero = Integer.parseInt(st.nextToken());
				listaNumeros.add(numero);
			}
			c = new Combinacion(listaNumeros);
			
			
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

		return c;

	}
	
	
	public static void generarArchivoPremios(ArrayList<Combinacion> listaCombinaciones, Combinacion combinacionGanadora) {
		
		BufferedWriter stream = null;
		
		try {
			stream =new BufferedWriter( new FileWriter(archivoPremios) );
			
			for (Combinacion combinacion : listaCombinaciones) {
				String linea = "";
				for (Integer numero : combinacion.getListaNumeros()) {
					linea += numero + ",";
				}
				linea = linea.substring(0, linea.length()-1); //quitar la última coma
				linea += " :";
				linea += combinacion.getAciertos(combinacionGanadora);
				linea += " aciertos";
				stream.write(linea);
				stream.newLine();
			}
			
						
		} catch (IOException e) {
			System.out.println("Error escribiendo el texto");
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








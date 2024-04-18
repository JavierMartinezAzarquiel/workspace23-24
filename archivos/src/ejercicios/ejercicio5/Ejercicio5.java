package ejercicios.ejercicio5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Ejercicio5 {

	private static File archivoJugadores = new File(".\\src\\ejercicios\\ejercicio5\\jugadores.txt");
	private static File archivoDemarcaciones = new File(".\\src\\ejercicios\\ejercicio5\\demarcaciones.txt");
	private static File archivoSelecciones = new File(".\\src\\ejercicios\\ejercicio5\\selecciones.txt");
	private static File archivoCombinacion = new File(".\\src\\ejercicios\\ejercicio5\\combinacion.txt");

	public static void main(String[] args) {
		//obtener todas las demarcaciones y genero objetos
		ArrayList<Demarcacion> listaDemarcaciones = getDemarcaciones();
		//obtener todas las selecciones y genero objetos
		ArrayList<Seleccion> listaSelecciones = getSelecciones();
		//obtener todos los jugadores y genero objetos
		ArrayList<Jugador> listaJugadores = getJugadores(listaDemarcaciones, listaSelecciones);
		//generar el archivo de combinación
		generarArchivoCombinacion(listaJugadores, listaDemarcaciones, listaSelecciones);
	}


	public static ArrayList<Demarcacion> getDemarcaciones(){
		ArrayList<Demarcacion> lista = new ArrayList<Demarcacion>(); //preparo una lista vacía

		BufferedReader stream = null;

		try {
			stream =new BufferedReader( new FileReader(archivoDemarcaciones) );

			//recuperar el texto
			String linea; 
			while( (linea = stream.readLine()) != null ) { 
				//creo una demarcacion con lo que viene en la linea
				StringTokenizer st = new StringTokenizer(linea, ":");
				lista.add( new Demarcacion(st.nextToken() , st.nextToken()) );
			}

		} catch (IOException e) {
			System.out.println("Error leyendo el texto");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		return lista;
	}

	public static ArrayList<Seleccion> getSelecciones(){
		ArrayList<Seleccion> lista = new ArrayList<Seleccion>(); //preparo una lista vacía

		BufferedReader stream = null;

		try {
			stream =new BufferedReader( new FileReader(archivoSelecciones) );

			//recuperar el texto
			String linea; 
			while( (linea = stream.readLine()) != null ) { 
				//creo una Seleccion con lo que viene en la linea
				StringTokenizer st = new StringTokenizer(linea, ":");
				lista.add( new Seleccion(st.nextToken() , st.nextToken()) );
			}

		} catch (IOException e) {
			System.out.println("Error leyendo el texto");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		return lista;
	}

	public static ArrayList<Jugador> getJugadores(ArrayList<Demarcacion> listaDemarcaciones, ArrayList<Seleccion> listaSelecciones){
		ArrayList<Jugador> lista = new ArrayList<Jugador>(); //preparo una lista vacía

		BufferedReader stream = null;

		try {
			stream =new BufferedReader( new FileReader(archivoJugadores) );

			//recuperar el texto
			String linea; 
			while( (linea = stream.readLine()) != null ) { 
				//creo una jugador con lo que viene en la linea
				StringTokenizer st = new StringTokenizer(linea, ":");
				String nombre = st.nextToken();
				String codigoDemarcacion = st.nextToken();
				String codigoSeleccion = st.nextToken();
				Demarcacion objetoDemarcacion = buscarDemarcacion(codigoDemarcacion, listaDemarcaciones);
				Seleccion objetoSeleccion = buscarSeleccion(codigoSeleccion, listaSelecciones);
				lista.add( new Jugador(nombre , objetoDemarcacion, objetoSeleccion) );
			}

		} catch (IOException e) {
			System.out.println("Error leyendo el texto");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		return lista;
	}

	//método que busca una Demarcación dado su codigo
	public static Demarcacion buscarDemarcacion(String codigoDemarcacion, ArrayList<Demarcacion> listaDemarcaciones){
		for (Demarcacion demarcacion : listaDemarcaciones) {
			if (demarcacion.getCodigo().equals(codigoDemarcacion)) {
				return demarcacion;
			}
		}
		return null;
	}

	//método que busca una Selección dado su codigo
	public static Seleccion buscarSeleccion(String codigoSeleccion, ArrayList<Seleccion> listaSelecciones){
		for (Seleccion seleccion : listaSelecciones) {
			if (seleccion.getCodigo().equals(codigoSeleccion)) {
				return seleccion;
			}
		}
		return null;
	}
	
	
	public static void generarArchivoCombinacion(ArrayList<Jugador> listaJugadores, 
											ArrayList<Demarcacion>	listaDemarcaciones, 
											ArrayList<Seleccion> listaSelecciones) {
		
		BufferedWriter stream = null;
		
		try {
			stream =new BufferedWriter( new FileWriter(archivoCombinacion) );
			
			for (Seleccion seleccion : listaSelecciones) {
				//para cada seleccion, pongo su nombre y luego sus jugadores
				stream.write(seleccion.getPais());
				stream.newLine();
				//ahora pongo los jugadores
				for (Jugador jugador : listaJugadores) {
					if (jugador.getSeleccion().getCodigo().equals(seleccion.getCodigo())) {
						stream.write(jugador.getNombre() + ":" + jugador.getDemarcacion().getPosicion());
						stream.newLine();
					}
				}
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






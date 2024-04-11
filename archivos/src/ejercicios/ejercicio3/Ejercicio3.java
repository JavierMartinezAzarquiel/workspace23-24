package ejercicios.ejercicio3;

import java.io.File;
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

}

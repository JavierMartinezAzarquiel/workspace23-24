package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que pida al usuario que escriba varias palabras. El
		programa debe contar cuantas vocales tiene cada palabra y dará como
		resultado la palabra que más vocales tenga. Se deben ir pidiendo palabras al
		usuario hasta que este escriba la palabra “FIN”.
				Ejemplo: El programa debe generar la siguiente salida
				Escribe una palabra: JUEGO
				Escribe una palabra: INVIERNO
				Escribe una palabra: AJEDREZ
				Escribe una palabra: FIN
				La palabra con más vocales es: INVIERNO
				Y tiene 4 vocales
		 */

		Scanner teclado = new Scanner(System.in);
		
		String palabra, palabraConMasVocales = "";
		int cantidadMasVocales = 0;
		
		
		do {
			System.out.print("Escribe una palabra: ");
			palabra = teclado.nextLine();
			
			//contar las vocales de la palabra
			String vocales = "aeiouAEIOUáéíóúüÁÉÍÓÚ";
			int contador = 0;
			for (int i = 0; i < palabra.length(); i++) {
				if( vocales.indexOf( palabra.charAt(i)) != -1) {
					contador++;
				}
			}
			
			 
			//si tiene mas vocales que la que tenía guardada, la cambio
			if( contador > cantidadMasVocales ) {
				palabraConMasVocales = palabra;
				cantidadMasVocales = contador;
			}
			
			
		}while( !palabra.equalsIgnoreCase("FIN") );  //mientras no tecleemos la palabra "FIN"
		
		System.out.println("La palabra con mas vocales es: " + palabraConMasVocales);
		System.out.println("y tiene " + cantidadMasVocales + " vocales");
	}

}

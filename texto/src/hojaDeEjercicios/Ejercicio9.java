package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
			aparece la primera en la segunda.
					Introduciendo: “la”
					“La calle de la plaza”
					Da como salida: 2
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra;
		int contador = 0;
			
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("Teclea la palabra a buscar: ");
		palabra = teclado.nextLine();
		
		//dividimos la frase en trozos
		StringTokenizer carnicero = new StringTokenizer(frase);
		
		//bucle para ir pidiendo trozos
		while (carnicero.hasMoreTokens()) {
			String trozo = carnicero.nextToken();
			//si el trozo es igual a la palabra que busco, la cuento
			if ( trozo.equalsIgnoreCase(palabra) ) {
				contador++;
			}
		}
				
		System.out.println("La palabra aparece " + contador + " veces");
	}

}







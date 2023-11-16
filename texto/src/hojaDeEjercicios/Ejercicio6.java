package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Programa que descubra si una palabra es o no palíndroma, es decir se lee
			igual del derecho que del revés.
				Introduciendo: “oso”
				Da como salida: true
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase;
			
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		//convertir a StringBuilder
		StringBuilder frase2 = new StringBuilder(frase);
		//darle la vuelta
		frase2.reverse();
		//comprobar si es la misma palabra
		//Ojo porque vamos a comparar un String con un StringBuilder
		if ( frase.equals(frase2.toString()) ) {
			System.out.println("Es palidroma");
		} else {
			System.out.println("No es palindroma");
		}
	}

}









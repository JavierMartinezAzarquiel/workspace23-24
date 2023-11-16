package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 * Programa que reciba una cadena y diga cuantas palabras contiene. (Las
			palabras pueden estar separadas por espacios, puntos o comas).
					Introduciendo: “Hola a todos.Adios”
					Da como salida: 4
		 */

		Scanner teclado = new Scanner(System.in);
		String frase;
		int contador = 0; //contador para contar el numero de espacios, puntos o comas
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i)=='.' || frase.charAt(i)==',' || frase.charAt(i)==' ') {
				contador++;
			}
		}
		
		System.out.println("Palabras: " + (contador+1) );
	}

}








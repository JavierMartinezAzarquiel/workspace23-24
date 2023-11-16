package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio2B {

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
		
		StringTokenizer st = new StringTokenizer(frase, "., ");
		System.out.println("Palabras: " + st.countTokens());
		
	}

}








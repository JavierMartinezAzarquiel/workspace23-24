package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3B {

	public static void main(String[] args) {
		/*
		 * Programa que codifique una cadena cambiando cada letra por la siguiente en
			el código ASCII.
					Introduciendo: “Lunes”
					Da como salida: “Mvoft”
		 */

		Scanner teclado = new Scanner(System.in);
		String frase;
		char letra;
				
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		//convertir la frase a StringBuilder
		StringBuilder sb = new StringBuilder(frase);
		
		for (int i = 0; i < sb.length(); i++) {
			//saco una letra
			letra = sb.charAt(i);
			//la modifico
			letra++;
			//la vuelvo a poner en su lugar
			sb.setCharAt(i, letra);
		}
		
		System.out.println(sb);

	}

}

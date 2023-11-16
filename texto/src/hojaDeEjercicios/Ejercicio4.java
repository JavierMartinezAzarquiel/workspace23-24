package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que rote una cadena tantas veces como se le diga.
				Introduciendo: “Lunes”
				Rotaciones: 3
				Da como salida: “nesLu”
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int rotaciones;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("Teclea las rotaciones: ");
		rotaciones = teclado.nextInt();
		
		
		//convertir el String en un StringBuilder
		StringBuilder sb = new StringBuilder(frase);
		
		//para cada rotación, tengo que eliminar la última letra y ponerla al principio
		for (int i = 1; i <= rotaciones; i++) {
			//sacar una copia de la última letra
			char letra = sb.charAt( sb.length() -1 );
			//eliminar la última letra
			sb.deleteCharAt(sb.length() -1);
			//insertarla en la posición 0
			sb.insert(0, letra);
		}
		
		System.out.println(sb);
		
		for (int i = 1; i <= rotaciones; i++) {
			//sacar una copia de la última letra
			char letra = frase.charAt( frase.length() -1 );
			//eliminar la última letra
			frase = frase.substring(0, frase.length() -1);
			//insertarla en la posición 0
			frase =  letra + frase;
		}
		
		System.out.println(frase);
	}

}









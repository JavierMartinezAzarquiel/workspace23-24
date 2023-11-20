package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * Programa que elimina todas las vocales de una frase.
				Introduciendo: “Hola a Todos”
				Da como salida: “Hl Tds”
		 */

		Scanner teclado = new Scanner(System.in);
		String frase, vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		StringBuilder sb = new StringBuilder(frase);
		
		for (int i = 0; i < sb.length(); i++) {
			//si la letra es una vocal, la elimio
			//if ( vocales.contains(String.valueOf(sb.charAt(i))) ) {
			if ( vocales.indexOf(sb.charAt(i)) != -1) {
				sb.deleteCharAt(i);
				i--; //retraso el bucle para que no se salte ninguna letra
			}
		}
		
		System.out.println("Resultado: " + sb);
	}

}








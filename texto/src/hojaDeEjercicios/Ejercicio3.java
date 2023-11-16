package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Programa que codifique una cadena cambiando cada letra por la siguiente en
			el código ASCII.
					Introduciendo: “Lunes”
					Da como salida: “Mvoft”
		 */

		Scanner teclado = new Scanner(System.in);
		String frase, resultado = "";
		char letra;
				
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			//saco una letra
			letra = frase.charAt(i);
			//la modifico
			letra++;
			//la añado a resultado
			resultado = resultado + letra;
		}
		
		System.out.println(resultado);
	}

}









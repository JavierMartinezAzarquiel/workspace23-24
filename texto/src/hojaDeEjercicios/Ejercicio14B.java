package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio14B {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que intercale las letras de dos palabras. El programa
			debe pedir 2 palabras y luego dar otra palabra resultado con las letras de las
			dos palabras intercaladas.
					Introduciendo:  Primera palabra “INTERNET”
									Segunda palabra “correo”
					Da como salida: “IcNoTrErReNoET”
		 */

		Scanner teclado = new Scanner(System.in);
		
		String palabra1, palabra2, aux;
		
		System.out.print("Primera palabra: ");
		palabra1 = teclado.nextLine();
		System.out.print("Segunda palabra: ");
		palabra2 = teclado.nextLine();
		
		//Solución insertando las letras de la palabra chica en la palabra mayor
		
		//saber cual es la palabra mayor
		if(palabra1.length() < palabra2.length()) { //si la palabra2 es mayor, las intercambio
			aux = palabra1;
			palabra1 = palabra2;
			palabra2 = aux;
		}
		
		//voy insertando las letras en las posiciones 1,3,5,7,...
		int posicion = 1;
		StringBuilder resultado = new StringBuilder(palabra1);
		for (int i = 0; i < palabra2.length(); i++) { //las letras de la palabra2
			resultado.insert( posicion, palabra2.charAt(i) );
			posicion += 2; //preparo la siguiente posición
		}
		
		System.out.println(resultado);
	}

}

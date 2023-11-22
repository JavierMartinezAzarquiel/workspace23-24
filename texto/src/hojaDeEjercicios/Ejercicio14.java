package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio14 {

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
		
		String palabra1, palabra2, resultado = "";
		
		System.out.print("Primera palabra: ");
		palabra1 = teclado.nextLine();
		System.out.print("Segunda palabra: ");
		palabra2 = teclado.nextLine();
		
		//Solución pasando las letras a una variable resultado
		
		//bucle que se repite hasta el maximo de las dos palabras
		for (int i = 0; i < Math.max(palabra1.length(), palabra2.length()); i++) {
			if(i < palabra1.length()) {
				resultado += palabra1.charAt(i);
			}
			if(i < palabra2.length()) {
				resultado += palabra2.charAt(i);
			}
		}
		
		System.out.println(resultado);
		
	}

}

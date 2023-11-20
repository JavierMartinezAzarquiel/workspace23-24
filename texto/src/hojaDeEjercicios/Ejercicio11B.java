package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio11B {

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
		
		StringBuilder sb = new StringBuilder(); //vacío
		
		for (int i = 0; i < frase.length(); i++) {
			
			if ( vocales.indexOf(frase.charAt(i)) == -1) { //si la letra no es vocal
				//la añado al resultado
				sb.append( frase.charAt(i) );
			}
		}
		
		System.out.println("Resultado: " + sb);
	}

}








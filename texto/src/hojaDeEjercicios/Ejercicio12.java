package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Realiza un programa que lea un String y elimine las palabras de menos de
			tres letras. Una vez eliminadas esas palabras, no deben existir espacios
			duplicados.
					Ejemplo: “El bar de la plaza”
					Dará como resultado: “bar plaza”
		 */

		Scanner teclado = new Scanner(System.in);
		String frase;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		StringBuilder resultado = new StringBuilder(); //vacío para rellenar
		
		//troceamos la frase
		StringTokenizer stk = new StringTokenizer(frase);
		
		while (stk.hasMoreTokens()) {
			String token = stk.nextToken(); //saco una palabra
			//si la palabra tiene 3 letras o más, la añado a resultado
			if(token.length() >= 3) {
				resultado.append(token);
				resultado.append(" ");
			}
		}
		
		System.out.println(resultado.toString().trim()); //quitamos el último espacio en blanco
	}

}





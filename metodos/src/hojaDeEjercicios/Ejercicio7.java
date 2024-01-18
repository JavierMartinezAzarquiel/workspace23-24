package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	/*
	 * Haz dos métodos, una para cifrar() y otro para descifrar() una cadena de
		caracteres. Estos métodos reciben un String y retornan ese String ya cifrado o
		descifrado. Para hacer el cifrado de un String, se cambia cada letra por la que está
		dos puestos mas adelante( la ‘a’ se cambia por la ‘c’), teniendo en cuenta que el
		cambio es circular, es decir, la ‘z’ se cambiará por la ‘b’. El proceso de
		descifrado es el contrario. Los caracteres que no sean alfabéticos no registrarán
		ningún cambio.
	 */

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una frase: ");
		String frase = teclado.nextLine();

		String fraseCifrada = cifrar(frase);
		String fraseDescifrada = descifrar(fraseCifrada);

		System.out.println("La frase cifrada es: " + fraseCifrada);
		System.out.println("La frase descifrada es: " + fraseDescifrada);
	}

	public static String cifrar(String frase) {
		StringBuilder sb =new StringBuilder(frase);
		char letra;
		for (int i = 0; i < sb.length() ; i++) {
			letra = sb.charAt(i); //sacamos una letra
			if( Character.isAlphabetic(letra)) { //si es alfabética, la cambio
				if (letra == 'y') {
					letra = 'a';
				}else if (letra == 'z'){
					letra = 'b';
				}else {
					letra = (char)(letra + 2);
					sb.setCharAt(i, letra);
				}
			}
		}
		return sb.toString();
	}

	public static String descifrar(String frase) {
		StringBuilder sb =new StringBuilder(frase);
		char letra;
		for (int i = 0; i < sb.length() ; i++) {
			letra = sb.charAt(i); //sacamos una letra
			if( Character.isAlphabetic(letra)) { //si es alfabética, la cambio
				if (letra == 'a') {
					letra = 'y';
				}else if (letra == 'b'){
					letra = 'z';
				}else {
					letra = (char)(letra - 2);
					sb.setCharAt(i, letra);
				}
			}
		}
		return sb.toString();
	}

}

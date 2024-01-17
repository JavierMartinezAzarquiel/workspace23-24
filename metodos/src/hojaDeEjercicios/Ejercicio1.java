package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una letra: ");
		char letra = teclado.nextLine().charAt(0);
		
		if (esVocal(letra)) {
			System.out.println("Es una vocal");
		} else {
			System.out.println("No es vocal");
		} 
	}

	/*
	 * Haz un método llamado esVocal(), al que se le pasa como parámetro un carácter
		y retorna un valor true en caso de que el carácter sea una vocal, y un valor false
		en caso contrario.
	 */
	public static boolean esVocal(char letra) {
		String vocales = "aeiouAEIOU";
		if ( vocales.indexOf(letra) != -1) {
			return true;
		}else {
			return false;
		}
	}
	
	
}

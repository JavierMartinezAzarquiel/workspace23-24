package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	/*
	 * Realiza un método llamado quitaFaltas() al que se le pasa un String con un texto
		en minúsculas con signos de puntuación y coloque adecuadamente las palabras
		que deban empezar en mayúsculas.
	 */
	
	public static void main(String[] args) {
		String frase;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		System.out.println( quitaFaltas(frase) );
	}

	
	public static String quitaFaltas(String frase) {
		StringBuilder sb = new StringBuilder(frase);
		boolean hacerCambio = true; //Flag para indicar si hay que poner una letra en mayuscula
		for (int i = 0; i < sb.length(); i++) {
			if(sb.charAt(i) == '.') { //si encuentro un punto, subo la bandera
				hacerCambio = true;
			}else if(Character.isAlphabetic(sb.charAt(i)) && hacerCambio) {
				//si es una letra alfabética y la bandera está subida, 
				//pongo la letra en mayúscula y bajo la bandera
				sb.setCharAt(i, Character.toUpperCase(sb.charAt(i)));
				hacerCambio = false;
			}
		}
		return sb.toString();
	}
}







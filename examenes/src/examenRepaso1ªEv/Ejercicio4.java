package examenRepaso1ªEv;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Realiza un programa que averigüe si un número entero tiene todas sus cifras
			ordenadas. El programa debe pedir al usuario que teclee un número, y debe
			responder si el número tiene las cifras ordenadas ascendentemente o no.
					Ejemplo:
					El numero 2568 tiene todas sus cifras ordenadas ascendentemente.
					El numero 4637 no tiene las cifras ordenadas.
			
			Nota: El número puede tener un número cualquiera de cifras, no tiene que tener
			exactamente cuatro como en el ejemplo. Si el número tuviese una sola cifra, se
			entenderá que tiene las cifras ordenadas correctamente.
		 */
		Scanner teclado = new Scanner(System.in);
		int numero, anterior, cifra;
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
	}

}

package simpleYDoble;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		/*
		 * Programa que pida un numero entero y nos diga
		 * si es par o impar
		 */
		int numero;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		if ( numero % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}
		
		
	}

}








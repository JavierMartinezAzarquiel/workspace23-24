package examenSorpresa;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir numeros hasta que tecleen uno con las dos cifras iguales
		
		Scanner teclado = new Scanner(System.in);

		int numero, unidades, decenas;
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			//divido el número en dos cifras
			unidades = numero % 10;
			decenas = numero / 10;
		} while ( unidades != decenas );
		
//		do {
//			System.out.print("Teclea un número: ");
//			numero = teclado.nextInt();
//		} while ( numero % 11 != 0 );
	}

}

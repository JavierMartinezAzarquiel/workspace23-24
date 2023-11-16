package simpleYDoble;

import java.util.Scanner;

public class MayorDe2 {

	public static void main(String[] args) {
		/*
		 * Pedimos dos números por teclado y mostramos cual es el mayor
		 */

		int numeroA, numeroB;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numeroA = teclado.nextInt();
		System.out.print("Teclea otro numero: ");
		numeroB = teclado.nextInt();
		teclado.close();

		if (numeroA == numeroB) {
			System.out.println("Son iguales");
		}else {
			if (numeroA > numeroB) {
				System.out.println("El mayor es: " + numeroA);
			} else {
				System.out.println("El mayor es: " + numeroB);
			}
		}


		if (numeroA == numeroB) {
			System.out.println("Son iguales");
		}else if (numeroA > numeroB) {
			System.out.println("El mayor es: " + numeroA);
		} else {
			System.out.println("El mayor es: " + numeroB);
		}
	}

}









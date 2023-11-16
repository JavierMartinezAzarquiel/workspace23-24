package simpleYDoble;

import java.util.Scanner;

public class MayorDe3 {

	public static void main(String[] args) {
		/*
		 * Pedimos tres números por teclado y mostramos cual es el mayor
		 */
		int numeroA, numeroB, numeroC;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numeroA = teclado.nextInt();
		System.out.print("Teclea otro numero: ");
		numeroB = teclado.nextInt();
		System.out.print("Teclea otro numero: ");
		numeroC = teclado.nextInt();
		teclado.close();
		
		if (numeroA > numeroB) {
			//el mayor es A de momento
			if (numeroA > numeroC) {
				System.out.println("El mayor es: " + numeroA);
			} else {
				System.out.println("El mayor es: " + numeroC);
			}
		} else {
			//el mayor es B
			if (numeroB > numeroC) {
				System.out.println("El mayor es: " + numeroB);
			} else {
				System.out.println("El mayor es: " + numeroC);
			}
		}
		
		//otra solución usando condiciones mas complejas
		if (numeroA > numeroB && numeroA > numeroC) {
			System.out.println("El mayor es: " + numeroA);
		} else if (numeroB > numeroA && numeroB > numeroC) {
			System.out.println("El mayor es: " + numeroB);
		} else {
			System.out.println("El mayor es: " + numeroC);
		}
	}

}






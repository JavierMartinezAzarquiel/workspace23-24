package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Programa que solitite un numero n y luego muestre por pantalla la siguiente
			figura:
			Introduciendo: 6
			Da como salida:
				          1
				        1 2 1
				      1 2 3 2 1
				    1 2 3 4 3 2 1
				  1 2 3 4 5 4 3 2 1
				1 2 3 4 5 6 5 4 3 2 1
		 */

		
		
		/*
		 *   pedir un numero
		 *   bucle de 1 hasta el numero
		 *   		imprimir unos espacios
		 *   		imprimir numeros de 1 hasta la vuelta
		 *   		imprimir de vuelta-1 hasta 1
		 *   		cambio de linea
		 */
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		//bucle principal
		for (int i = 1; i <= numero; i++) {
			//imprimir unos espacios
			for (int j = 1; j <= numero-i ; j++) {
				System.out.print(" ");
			}
			//imprimir numeros de 1 hasta la vuelta
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			//imprimir de vuelta-1 hasta 1
			for (int j = i-1; j >= 1; j--) {
				System.out.print(j);
			}
			//cambio de linea
			System.out.println();
		}
		
	}

}








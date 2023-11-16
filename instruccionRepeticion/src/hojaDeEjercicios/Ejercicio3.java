package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 *  Programa que solicite un numero n y luego muestre por pantalla la siguiente
			figura:
					1
					1 2
					1 2 3
					1 2 3 4
					1 2 3 4 5
					…………
					1 2 3 4 5 … n
		 */

		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero ; i++) { //este da tantas vueltas como lineas
			for (int j = 1; j <= i ; j++) {  //imprime los número de cada linea
				System.out.print(j);
			}
			System.out.println();//cambio a la siguiente linea
		}
	}

}









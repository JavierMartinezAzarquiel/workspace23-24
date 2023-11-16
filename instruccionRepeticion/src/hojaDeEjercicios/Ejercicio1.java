package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Programa que lea números hasta que se den cinco ceros y escriba después la
			suma de los números leídos.
					Introduciendo: 1 3 5 0 4 0 6 7 –1 0 0 8 0
					Da como salida: 33
		 */

		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0, contadorDeCeros = 0;
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			suma += numero;
			if (numero == 0) {
				contadorDeCeros++;
			}
		} while (contadorDeCeros != 5);
		
		System.out.println("Suma total: " + suma);
	}

}










package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Programa que lea un número entero positivo y lo transforme a su representación
		   binaria.
						Introduciendo: 18
						Da como salida: 10010
		 */
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		
		while (numero != 0) {
			System.out.print( numero%2 );
			numero = numero / 2;
		}
		
	}

}







package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9C {

	public static void main(String[] args) {
		/*
		 * Programa que lea un número entero positivo y lo transforme a su representación
		   binaria.
						Introduciendo: 18
						Da como salida: 10010
		 */
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		String resultado = "";
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		
		while (numero != 0) {
			resultado = numero%2 + resultado ;
			numero = numero / 2;
		}
		
		System.out.println(resultado);
	}

}







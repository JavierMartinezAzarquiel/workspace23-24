package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 *  Realiza un programa que nos pregunte la edad y nos diga si somos
			mayores de edad o no. El programa debe escribir en pantalla el
			resultado true o false.
		 */

		//variables que necesitamos
		byte edad;
		boolean mayorDeEdad;
		
		//Pedir que tecleen su edad
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea tu edad: ");
		edad = teclado.nextByte();
		
		//calcular si es mayor de edad
		mayorDeEdad = (edad >= 18);
		
		//Mostrar el resultado
		System.out.println("Resultado de la comprobación de mayoría de edad: " + mayorDeEdad);
	}

}








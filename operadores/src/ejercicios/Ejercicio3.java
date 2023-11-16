package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * Programa que permita teclear un número correspondiente a un año y
			calcule y visualice si es bisiesto o no. (Un año es bisiesto si es múltiplo
			de 4 y no es múltiplo de 100 o bien es múltiplo de 400).
		 */

		//variables necesarias
		int año;
		boolean bisiesto;

		//Pedir que tecleen el año
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un año: ");
		año = teclado.nextInt();
		teclado.close();
		
		//comprobar si es bisiesto
		bisiesto = (año%4 == 0) &&  !(año%100 == 0) || (año%400 == 0);
	
		//Resultado
		System.out.println("El año " + año + " es bisiesto: " + bisiesto );
	}

}











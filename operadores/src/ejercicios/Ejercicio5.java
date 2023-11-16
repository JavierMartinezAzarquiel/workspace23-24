package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que nos pida cuantos segundos duró un concierto,
			y nos calcule cuantas horas, minutos y segundos son.

					Ejemplo: Cuantos segundos duró el concierto: 8479
					Equivale a 2:21:19
		 */

		//variables
		int cantidadTotal, horas, minutos, segundos, resto;

		//Pedir los segundos que duró el concierto
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantos segundos duró el concierto: ");
		cantidadTotal = teclado.nextInt();
		teclado.close();

		//calcular
		horas = cantidadTotal / 3600; //cuantas hora hay
		resto = cantidadTotal % 3600; //cuantos segundos restan después de sacar las horas
 		minutos = resto / 60;  //cuantos minutos
 		segundos = resto % 60; //cuantos segundos
 		
 		//mostramos
 		System.out.println("Equivale a " + horas + ":" + minutos + ":" + segundos);
 		System.out.printf("Equivale a %d:%02d:%02d ", horas, minutos, segundos);
	}

}







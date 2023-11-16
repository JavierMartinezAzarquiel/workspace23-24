package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que pida cual es el radio de una circunferencia y nos calcule cual es la longitud y el área.

			Longitud = 2πr
			Área = πr^2
		 */
		
		
		double radio, longitud, area;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea el radio de la circunferencia: ");
		radio = teclado.nextDouble();
		
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud de la circunferencia es: " + longitud);
		System.out.println("El área de la circunferencia es: " + area);
	}

}













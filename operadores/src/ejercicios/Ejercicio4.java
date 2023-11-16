package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Elabora un programa que nos pregunte nuestro peso, y calcule cuanto
			pesaríamos si nos vamos a vivir a la Luna. Sabemos que en la Tierra la
			gravedad en de 9.8, mientras que en la Luna es de 1.62
		 */

		//constantes
		final float GTIERRA = 9.8F;
		final float GLUNA = 1.62F;
		
		//variables
		float pesoEnLaTierra, pesoEnLaLuna;
		
		//Pedir el peso en la tierra
		Scanner teclado = new Scanner(System.in);
		System.out.print("Dime cuanto pesas: ");
		pesoEnLaTierra = teclado.nextFloat();
		teclado.close();
		
		//Calcular el peso en la luna
		pesoEnLaLuna =  pesoEnLaTierra * GLUNA / GTIERRA;
		
		//Mostrar resultado
		System.out.println("Tu peso en la luna sería: " + pesoEnLaLuna);
		System.out.printf("Tu peso en la luna sería: %.2f", pesoEnLaLuna);
	}

}







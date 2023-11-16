package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 *  Diseña un programa que indique si un número pasado por teclado es
			múltiplo de siete o no.
		 */

		//variables necesarias
		int numero, resto;
		boolean multiploDe7;

		//Pedir que tecleen un numero
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		//calcular el resto de dividir entre 7
		resto = numero % 7;
		
		//compruebo si es cero el resto
		multiploDe7 = resto == 0;
		
		//mostrar el resultado
		System.out.println("Multiplo de 7: " + multiploDe7);
	}

}










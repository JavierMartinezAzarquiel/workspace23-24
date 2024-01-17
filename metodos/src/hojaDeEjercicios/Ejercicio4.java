package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		int numero = teclado.nextInt();
		
		System.out.println("Factorial: " + factorial(numero));
	}

	
	
	/*
	 * Método factorial(), que calculará el factorial del número que se le pasa como
		parámetro. Retornará el resultado del calculo del factorial, o bien un -1 en caso
		de que el parámetro pasado sea negativo, y un -2 en caso de que el parámetro
		pasado sea cero.
	 */
	public static long factorial(int numero) {
		if(numero < 0 ) return -1;
		if(numero == 0 ) return -2;
		
		if (numero == 1) { 
			return 1;
		} else {
			return numero * factorial(numero-1);
		}
	}
}

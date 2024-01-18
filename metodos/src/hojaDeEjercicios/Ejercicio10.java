package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio10 {

	/*
	 * Método mcd() (máximo común divisor), que calcule el mcd de dos números
		pasados como parámetros utilizando el algoritmo de Euclides. Este algoritmo
		dice que si tenemos dos números A y B, restamos el menor del mayor hasta que
		A y B sean iguales, es ese momento tenemos el valor de mcd.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un número: ");
		int a = teclado.nextInt();
		System.out.print("Teclea un segundo número: ");
		int b = teclado.nextInt();
		System.out.println("El mcd es: " + mcd(a,b));
	}

	public static int mcd(int a, int b) {
		while( a != b ) {
			if(a>b) {
				a -= b;
			}else {
				b -= a;
			}
		}
		return a;
	}
	
}







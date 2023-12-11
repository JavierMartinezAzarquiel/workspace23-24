package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio2B {

	public static void main(String[] args) {
		/*2. Dado un array de números enteros, realiza un programa que diga si está
			ordenado o no.
		*/

		int[] numeros = {10, 16, 22, 29, 31, 33, 46, 54};
		
		//Hago un clon del array
		int[] copia = numeros.clone();
		//ordeno la copia
		Arrays.sort(copia); 
		
		if (Arrays.equals(numeros, copia) ) {
			System.out.println("Está ordenado");
		} else {
			System.out.println("No está ordenado");
		}
	}

}

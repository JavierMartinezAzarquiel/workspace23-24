package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio5B {

	public static void main(String[] args) {
		/*
		 * 5. Dado un array de 50 números entre 1 y 100, Escribir una lista ordenada con los
				valores que no aparecen en el array.
		 */

		int[] array = new int[50];
		
		//rellenamos el array con numeros entre 1 y 100
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()* 100) +1;
		}
		
		System.out.println(Arrays.toString(array));
		
		//Ordeno el array para que funcionen las busquedas
		Arrays.sort(array);
		
		//imprimir los valores que no están dentro del array
		for (int valor = 1; valor <= 100; valor++) {
			//buscar si el valor está dentro del array
			//si no está, lo imprimo
			if ( Arrays.binarySearch(array, valor) < 0) {
				System.out.print(valor + " ");
			}
		}
		
	}

}






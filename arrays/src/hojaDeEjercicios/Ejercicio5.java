package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio5 {

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
		
		//imprimir los valores que no están dentro del array
		for (int valor = 1; valor <= 100; valor++) {
			//buscar si el valor está dentro del array
			boolean encontrado = false;
			for (int i = 0; i < array.length; i++) {
				if (array[i] == valor) {
					encontrado = true;
				}
			}
			//si no está, lo imprimo
			if (!encontrado) {
				System.out.print(valor + " ");
			}
		}
		
	}

}






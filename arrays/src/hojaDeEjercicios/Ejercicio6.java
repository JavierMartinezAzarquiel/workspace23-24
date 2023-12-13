package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * 6. Programa que rellene un array de 4x4 de la siguiente manera:

				1 0 0 0
				0 1 0 0
				0 0 1 0
				0 0 0 1
		 */

		int[][] array = new int[4][4];
	
		//rellenamos la diagonal con el valor 1
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				if (i == j) {
//					array[i][j] = 1;
//				}
//			}
//		}
		
		for (int i = 0; i < array.length; i++) {
			array[i][i] = 1;
		}
		
		//imprimimos el resultado
		for (int[] is : array) {
			System.out.println(Arrays.toString(is));
		}
		
		
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.print(array[i][j]);
//			}
//			System.out.println();
//		}
	
	}

}

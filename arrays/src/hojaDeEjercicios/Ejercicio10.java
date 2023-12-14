package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * 10. Dado un array de 5x5, realizar un algoritmo que lo rellene como en la figura.

				0 1 2 3 4
				1 2 3 4 3
				2 3 4 3 2
				3 4 3 2 1
				4 3 2 1 0
		 */

		
		int[][] array = new int[5][5];
		
		//rellenar
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i+j <=4) {
					array[i][j] = i + j;
				}else {
					array[i][j] = 8 - ( i + j );
				}
				
			}
		}
		
		//resultado
		for (int[] is : array) {
			System.out.println(Arrays.toString(is));
		}
		
	}

}

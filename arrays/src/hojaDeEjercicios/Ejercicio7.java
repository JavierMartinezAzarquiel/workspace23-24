package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Dado un array de 3x3 elementos, calcular la suma de sus filas y sus columnas
			almacenándolas en dos array de 3 elementos.
		 */

		int[][] a = new int[3][3];

		int[] f = new int[3], c = new int[3];

		//rellenamos el array a
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = (int)(Math.random() * 50);
			}
		}

		//imprimir
		for (int[] is : a) {
			System.out.println(Arrays.toString(is));
		}
		
		//suma de cada fila
		for (int i = 0; i < a.length; i++) {
			int suma = 0;
			for (int j = 0; j < a[i].length; j++) {
				suma += a[i][j];
			}
			f[i] = suma; //guardo la suma en el array f
		}
		
		//suma de cada columna
		for (int j = 0; j < a[0].length; j++) {
			int suma = 0;
			for (int i = 0; i < a.length; i++){
				suma += a[i][j];
			}
			c[j] = suma; //guardo la suma en el array c
		}
		
		//resultado
		System.out.println("Filas: " + Arrays.toString(f));
		System.out.println("Columnas: " + Arrays.toString(c));
	}

}

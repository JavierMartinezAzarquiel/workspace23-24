package pruebas;

import java.util.Arrays;

public class PruebaArray {

	public static void main(String[] args) {
		// Probar los arrays
		
		//declaración de una variable individual
		int a;
		
		//declaración de una variable array
		int[] b, c, d, e, f;
		int v[], g, p;

		//dimensionar el array
		b = new int[20];   //dimensiono una estructura para 20 datos
		
		//todo en la misma linea
		int[] w = new int[10];
		
		//uso de la estructura, guardar un valor en un hueco concreto
		w[4] = 83;
		
		System.out.println("El hueco 4 contiene: " + w[4]);
		System.out.println("El hueco 4 contiene: " + w[5]);
		System.out.println("Todo: " + w);
		
		for (int i = 0; i < w.length; i++) {
			System.out.print( w[i] + " ");
		}
		
		//diferentes tipos de arrays
		double[] j;
		boolean[] k;
		String[] l;
		Object[] m;
		int[][] n;   //dos dimensiones
		
		
		//declarar un array ya con los valores dentro
		int[] o = {12, 36, 78, 42, 0, 35, 64, 77};
		
		o[3]++;
		o[2] += o[6];
		
		System.out.println();
		System.out.println( Arrays.toString(o) );
	}

}






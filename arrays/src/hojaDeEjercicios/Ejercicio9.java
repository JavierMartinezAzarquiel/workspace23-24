package hojaDeEjercicios;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * 9. Programa que mezcla dos arrays ordenados de N elementos, consiguiendo un
			array de N*2 elementos igualmente ordenados.
			
				Array A
				
				4 8 15 22 25 40
				
				Array B
				
				3 6 18 21 25 47
				
				Array C
				
				3 4 6 8 15 18 21 22 25 25 40 47
		 */

		int[] a = {4, 8, 15, 22, 25, 40}, b = {3, 6, 18, 21, 25, 47};
		int[] c = new int[a.length + b.length];
		
		//copiar el array a en el c
		c = Arrays.copyOf(a, a.length + b.length);
		
		//copio el array b en la zona vacía de c
//		for (int i = 0; i < b.length; i++) {
//			c[i + a.length] = b[i];
//		}
		System.arraycopy(b, 0, c, a.length, b.length);
		//ordeno el array c
		Arrays.sort(c);
		//imprimir el resultado
		System.out.println(Arrays.toString(c));
		
		
	}

}

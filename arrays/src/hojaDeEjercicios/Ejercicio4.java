package hojaDeEjercicios;

import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * 4. Programa que ordene los índices de un array de enteros. A partir del array
			original debe generar otro donde aparezcan ordenados los índices de mayor a
			menor.
			
				Array original
				0   1  2  3  4
				34 54 12 85 45
				
				Array resultado
				3 1 4 0 2
		 */

		int[] original = {34, 54, 12, 85, 45};
		int[] resultado = new int[original.length]; 
		
		
		//repetir tantas veces como datos hay en original
		for (int veces = 0; veces < original.length; veces++) {
				
			//buscar el mayor
			int lugarMayor = 0;
			for (int i = 1; i < resultado.length; i++) {
				if ( original[i] > original[lugarMayor]) {
					lugarMayor = i;
				}
			}
			//anotar en el resultado
			resultado[veces] = lugarMayor;
		 	//borrar el dato original
			original[lugarMayor] = 0;
		}
		
		System.out.println( Arrays.toString(resultado));
	}

}

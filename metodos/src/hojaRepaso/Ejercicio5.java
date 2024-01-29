package hojaRepaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio5 {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6};
		
		int[] resultado = ordenar(array);
		
		System.out.println(Arrays.toString(resultado));
		System.out.println(ordenar2(array));
	}


	public static int[] ordenar(int[] array) {
		int[] pares = new int[0], impares = new int[0];
		
		for (int i = 0; i < array.length; i++) {
			if( array[i] % 2 == 0) {
				//a los pares
				pares = Arrays.copyOf(pares, pares.length + 1); //añado un hueco al array de pares
				pares[pares.length - 1] = array[i]; //lo guardo en el último hueco
			}else {
				//a los impares
				impares = Arrays.copyOf(impares, impares.length + 1); //añado un hueco al array de pares
				impares[impares.length - 1] = array[i]; //lo guardo en el último hueco
			}
		}
		
		//ordeno los dos arrays
		Arrays.sort(pares);
		Arrays.sort(impares);
		
		//copio los dos arrays en uno nuevo completamente
		int[] nuevo = new int[array.length]; //hago un array del mismo tamaño que el original
		for (int i = 0; i < pares.length; i++) { //copio los pares
			nuevo[i] = pares[i];
		}
		int posicion = pares.length;
		for (int i = impares.length -1; i >= 0 ; i--) { //copio los impares
			nuevo[posicion] = impares[i];
			posicion++;
		}
		
		return nuevo;
	}
	
	public static ArrayList<Integer> ordenar2(int[] array) {
		ArrayList<Integer> pares = new ArrayList<Integer>();
		ArrayList<Integer> impares = new ArrayList<Integer>();
		
		for (int i = 0; i < array.length; i++) {
			if( array[i] % 2 == 0) {
				//a los pares
				pares.add( array[i] );
			}else {
				//a los impares
				impares.add( array[i] );
			}
		}
		
		//ordeno los dos arraysList
		Collections.sort(pares);
		Collections.sort(impares, Collections.reverseOrder());
		
		//copio los dos arraysList en uno nuevo completamente
		ArrayList<Integer> nuevo = new ArrayList<Integer>(); //hago un array del mismo tamaño que el original
		nuevo.addAll(pares);
		nuevo.addAll(impares);
		
			
		return nuevo;
	}
}

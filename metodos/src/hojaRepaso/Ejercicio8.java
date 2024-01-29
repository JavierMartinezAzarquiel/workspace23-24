package hojaRepaso;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio8 {
	/*
	 * 8.	Dado un array invertir los valores de la primera mitad y los de la segunda mitad. 
	 * Si el tamaño del array es impar, el valor central no se moverá.

			1	2	3	4	5	6
	    	El array quedará así   
	    	3	2	1	6	5	4 

	 */
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7};

		boolean tamañoPar = array.length%2 == 0;
		int centro = array.length / 2;

		ArrayList<Integer> primeraMitad = new ArrayList<Integer>(), segundaMitad = new ArrayList<Integer>();

		//copio la primera mitad
		for (int i = 0; i < centro; i++) {
			primeraMitad.add(0, array[i]);
		}

		//copio la segunda mitad
		int comienzo;
		if(tamañoPar) {
			comienzo = centro;
		}else {
			comienzo = centro +1;
		}
		for (int i = comienzo; i < array.length; i++) {
			segundaMitad.add(0, array[i]);
		}
		
		int[] resultado = new int[array.length];
		
		int i=0;
		for (int valor : primeraMitad) {
			resultado[i] = valor;
			i++;
		}
		
		if(! tamañoPar ) {
			resultado[i] = array[centro];
			i++;
		}
		
		for (int valor : segundaMitad) {
			resultado[i] = valor;
			i++;
		}
		
		System.out.println( Arrays.toString(resultado));
	}


}

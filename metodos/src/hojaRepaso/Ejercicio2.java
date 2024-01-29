package hojaRepaso;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {
		int[] original = {32,45,12,95,39,72};
		int[] resultado;
		
		resultado = insertar(original, 33, 4);
		
		System.out.print(Arrays.toString(resultado));

	}
	
	public static int[] insertar(int[] array, int valor, int posicion) {
		//crear un array con un hueco mas que el original
		int[] resultado = new int[array.length+1];
		
		for (int i = 0; i < posicion; i++) {  //copiar los datos que hay antes del punto de insercion
			resultado[i] = array[i];
		}
		
		resultado[posicion] = valor;  //inserto el valor
		
		for (int i = posicion; i < array.length; i++) {  //copiar los datos que hay detras del punto de insercion
			resultado[i+1] = array[i];
		}
		return resultado;
	}

}

package hojaRepaso;

import java.util.Arrays;

public class Ejercicio5B {

	public static void main(String[] args) {
		int[] datos = {16,15,31,22,8,19};
		int[] resultado;
		
		resultado = ordenar(datos);
		
		System.out.println( Arrays.toString(resultado));
	}

	public static int[] ordenar( int[] array) {
		//crear array resultado
		int[] resultado = new int[array.length];
		int k=0; //indice para saber por donde voy en el resultado
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 == 0) {
				resultado[k] = array[i];
				k++;
			}
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i]%2 != 0) {
				resultado[k] = array[i];
				k++;
			}
		}
		return resultado;
	}
}

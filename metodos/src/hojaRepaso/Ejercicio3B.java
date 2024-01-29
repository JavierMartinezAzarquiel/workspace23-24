package hojaRepaso;

import java.util.Arrays;

public class Ejercicio3B {
	
	public static void main(String[] args) {
		int[] datos = {16,15,31,22,8,19};
		int[] resultado;
		
		resultado = insertar(datos, 40, 3);

		System.out.println( Arrays.toString(resultado));
	}
	
	public static int[] insertar( int[] array, int datoNuevo, int lugar) {
		//crear un array resultado con los mismos huecos 
		int[] resultado = new int[ array.length];
		
		//copiar los datos del array original al resultado
		for (int i = 0; i < array.length -1 ; i++) {
			if( i < lugar) {
				resultado[i] = array[i];
			}else {
				resultado[i+1] = array[i];
			}
		}
		//añadir el dato nuevo
		resultado[lugar] = datoNuevo;
		//retornar el resultado
		return resultado;
	}

}

package pruebas;

import java.util.Arrays;

public class PruebaClaseArrays {

	public static void main(String[] args) {
		//Probamos la clase Arrays, que es una clase especial
		//que nos ayuda con el manejo de los arrays.
		
		int[] numeros = {4, 7, 12, 27, 35, 36, 49, 51};
		
		//imprimir un array en pantalla
		System.out.println( Arrays.toString(numeros));

		//buscar un valor en un array(Tiene que estar ordenado)
		System.out.println("Búsqueda: " + Arrays.binarySearch(numeros, 35));
		
		//Ordenar un array
		numeros[3]= 58;
		System.out.println( Arrays.toString(numeros));
		Arrays.sort(numeros);
		System.out.println( Arrays.toString(numeros));
		
		
	}

}

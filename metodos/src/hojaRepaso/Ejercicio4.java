package hojaRepaso;

import java.util.ArrayList;

public class Ejercicio4 {

	public static void main(String[] args) {
		int[] array = {1, 7, 9, 3, 6, 7, 8, 2, 3, 1};
		
		System.out.println( secuencia(array) );
	}

	
	public static ArrayList<Integer> secuencia(int[] array) {
		
		int inicio, tamaño, inicioMayor = 0, tamañoMayor = 0;
		
		inicio = 0;
		tamaño = 1; //la primera secuencia como mínimo tiene el primer valor
		for (int i = 1; i < array.length; i++) {
			if( array[i] >= array[i-1]) { //si el valor es mayor, uno mas para la secuencia
				tamaño++;
			}else {
				if(tamaño > tamañoMayor) {
					tamañoMayor = tamaño;
					inicioMayor = inicio;
				}
				inicio = i;  //nueva secuencia
				tamaño = 1;  //comenzamos con tamaño 1
			}
		}
		
		ArrayList<Integer> resultado = new ArrayList<Integer>();
		resultado.add(inicioMayor);
		resultado.add(tamañoMayor);
		return resultado;
		
	}
}

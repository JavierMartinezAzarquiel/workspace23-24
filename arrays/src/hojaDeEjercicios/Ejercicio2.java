package hojaDeEjercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*2. Dado un array de números enteros, realiza un programa que diga si está
			ordenado o no.
		*/

		int[] numeros = {10, 16, 22, 29, 31, 33, 46, 54};
		boolean ordenado = true;
		
		//compruebo si están ordenados dos a dos
		for (int i = 0; i < numeros.length - 1 ; i++) {
			if(numeros[i] > numeros[i+1]) {
				ordenado = false;
			}
		}
		
		if (ordenado) {
			System.out.println("Está ordenado");
		} else {
			System.out.println("No está ordenado");
		}
	}

}

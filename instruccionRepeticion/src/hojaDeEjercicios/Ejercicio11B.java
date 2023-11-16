package hojaDeEjercicios;

public class Ejercicio11B {

	public static void main(String[] args) {
		/*
		 * Programa que visualice en la pantalla la siguiente figura:

					      *
					    * * *
					  * * * * *
					* * * * * * *
					  * * * * *
					    * * *
					      *		
		 */

		
		/*     bucle de 1 a 7
		 *          tengo que imprimir los espacios
		 * 			tengo que imprimir *			
		 *          fin de linea
		 * 
		 * 	   bucle de 5 a 1
		 * 			tengo que imprimir los espacios
		 * 			tengo que imprimir *			
		 *          fin de linea
		 */
		
		
		for (int i = 1; i <= 7; i+=2) {
			//imprimir los espacios
			for (int j = 1; j <= (7-i)/2; j++) {
				System.out.print(" ");
			}
			//imprimo los *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//cambio de linea
			System.out.println();
		}
		
		for (int i = 5; i >= 1; i-=2) {
			//imprimir los espacios
			for (int j = 1; j <= (7-i)/2; j++) {
				System.out.print(" ");
			}
			//imprimo los *
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			//cambio de linea
			System.out.println();
		}
	}

}

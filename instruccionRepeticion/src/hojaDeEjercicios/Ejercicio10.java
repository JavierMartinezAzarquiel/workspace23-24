package hojaDeEjercicios;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Calcular todos los números de tres cifras tales que la suma de los cubos de las
			cifras es igual al valor del número. (Dado el 153 entonces 1³+5³+3³=153).
					Da como salida: 153 370 371 407
		 */

		int cifra1, cifra2, cifra3, resultado;
		
		for (int i = 100; i < 1000; i++) {
			//dividir el número en 3 cifras
			cifra1 = i/100;
			cifra2 = (i/10)%10;
			cifra3 = i%10;
			//hacer la operación matemática
			resultado = (int)(Math.pow(cifra1, 3) + Math.pow(cifra2, 3) + Math.pow(cifra3, 3));
			//si el resultado es el propio número -> lo imprimo
			if(resultado == i) {
				System.out.println(i);
			}
		}
		
	}

}

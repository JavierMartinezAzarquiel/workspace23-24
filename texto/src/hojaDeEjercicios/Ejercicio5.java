package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Programa que lea un numero double, lo convierta a una cadena y le añada las
			comas separadoras de los miles.
					Introduciendo: 2388432.34
					Da como salida: “2,388,432.34”
		 */

		Scanner teclado = new Scanner(System.in);
		double numero;
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextDouble();
		teclado.close();
		
		//convertir el double en String
		String texto = String.valueOf(numero);
		//convertir el String en StringBuilder
		StringBuilder texto2 = new StringBuilder(texto);
		
		//todo en una línea
//		StringBuilder ejemplo = new StringBuilder(String.valueOf(numero));
		
		//buscar donde está el punto
		int lugarPunto = texto2.indexOf(".");
		//calculo donde iría la coma
		int lugarComa = lugarPunto - 3;
		
		while (lugarComa > 0) {
			//inserto una coma
			texto2.insert(lugarComa, ',');
			lugarComa -= 3;
		}
		
		
		System.out.println(texto2);
	}

}









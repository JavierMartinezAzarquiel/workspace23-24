package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una frase: ");
		String frase = teclado.nextLine();
		System.out.print("¿Cuantas veces la repetimos?: ");
		int veces = teclado.nextInt();

		System.out.println("La frase repetida es: " + repite(frase, veces) );
		System.out.println("La frase repetida es: " + repite2(frase, veces) );
	}

	
	/*
	 * Método repite(), que recibe como parámetro una cadena de caracteres y un
		numero, y retorna un nuevo String donde aparece repetida la cadena de caracteres
		tantas veces como indique el numero pasado como parámetro.
	 */
	
	public static String repite(String frase, int veces) {
		if(veces < 0) return "";
		String resultado = "";
		for (int i = 1; i <= veces; i++) {
			resultado = resultado.concat(frase);
		}
		return resultado;
	}
	
	public static String repite2(String frase, int veces) { //recursivo
		if(veces < 0) return "";
		if (veces == 0) {
			return "";
		} else {
			return frase + repite2(frase, veces -1 );
		}
	}
	
}

package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Programa que sume todas las cifras de los números que aparecen en una
			cadena de caracteres.
					Introduciendo: “15 de Noviembre de 2022”
					Da como salida: 12
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int suma = 0;
			
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i); //saco la letra con la que voy a trabajar
			
			//si la letra es un dígito, la convierto y la sumo
			if (Character.isDigit(letra)) {
				//convertir la letra a String y de String a int
				String texto = String.valueOf(letra);
				int valor = Integer.parseInt(texto);
				//la sumo al acumulador
				suma += valor;
				
//				suma += Integer.parseInt(String.valueOf(letra));
			}
			
		}
		
		System.out.println("Valor total: " + suma);
	}

}






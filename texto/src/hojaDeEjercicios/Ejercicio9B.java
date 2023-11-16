package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9B {

	public static void main(String[] args) {
		/*
		 * Programa que recibe dos cadenas de caracteres y comprueba cuantas veces
			aparece la primera en la segunda.
					Introduciendo: “la”
					“La calle de la plaza”
					Da como salida: 2
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra;
		int contador = 0, posicion;
			
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("Teclea la palabra a buscar: ");
		palabra = teclado.nextLine();

		//convertir la frase y la palabra todo a mayusculas
		frase = frase.toUpperCase();
		palabra = palabra.toUpperCase();
		
		posicion = frase.indexOf(palabra, 0); //buscar la primera aparición de la palabra
		
		while ( posicion != -1) { //mientras encuentre la palabra
			contador++; //cuento una mas
			//Y busco la siguiente palabra
			posicion = frase.indexOf(palabra, posicion + 1);
		}
		
		System.out.println("La palabra aparece " + contador + " veces");
	}

}







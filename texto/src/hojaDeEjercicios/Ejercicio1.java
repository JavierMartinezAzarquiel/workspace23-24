package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Programa que pase un String a mayúsculas y diga cuantas letras han
			cambiado.
					Introduciendo: “Hola a Todos”
					Da como salida: “HOLA A TODOS” 8 cambios
		 */

		Scanner teclado = new Scanner(System.in);
		String frase, fraseEnMayusculas;
		int cambios = 0; //contador para saber cuantos cambios hemos hecho
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		fraseEnMayusculas = frase.toUpperCase(); //convertir toda la frase a mayusculas
		
		for (int i = 0; i < frase.length(); i++) {
			if(frase.charAt(i) != fraseEnMayusculas.charAt(i)) {
				cambios++;
			}
		}
		
		
		System.out.println(fraseEnMayusculas);
		System.out.println("Cambios: " + cambios);
	}

}







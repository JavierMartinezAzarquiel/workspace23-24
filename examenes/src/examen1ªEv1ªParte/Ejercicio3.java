package examen1ªEv1ªParte;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * 3.	Realiza un programa que pide por teclado una frase de texto. Luego pedir� una palabra para poner en may�sculas. Cuando tenga los dos Strings, debe poner en may�sculas en la frase la palabra que hemos escrito.
				Puede pasar que la palabra aparezca en la frase m�s de una vez, por lo que tendremos que cambiarla a may�sculas en todos los sitios que aparezca.
				
						Ejemplo 1:
						Introduzca una frase: Este es mi amigo Juan.
						Introduzca una palabra: amigo
						Resultado: Este es mi AMIGO Juan.
						
						Ejemplo 2:
						Introduzca una frase: Este es mi amigo Juan que es amigo de Luis.
						Introduzca una palabra: amigo
						Resultado: Este es mi AMIGO Juan que es AMIGO de Luis.

		 */
		
		Scanner teclado = new Scanner(System.in);
		
		String frase, palabra;
		int lugar;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("Teclea una palabra: ");
		palabra = teclado.nextLine();
		
		lugar = frase.indexOf(palabra); //busco la palabra
		
		while (lugar != -1) { //mientras la encuentre
			
			String trozo1 = frase.substring(0, lugar);  //trozo de frase que hay antes de la palabra
			String trozo2 = frase.substring(lugar+ palabra.length()); //trozo de frase que hay despues de la palabra
			frase = trozo1 + palabra.toUpperCase() + trozo2;  //uno los trozos con la palabra en mayusculas
			lugar = frase.indexOf(palabra, lugar +1); //busco otra vez
		}
		
		System.out.println(frase);
	}

}

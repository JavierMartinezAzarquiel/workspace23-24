package examen1ªEv1ªParte;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio3B {

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
		
		String frase, palabra, resultado="";
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("Teclea una palabra: ");
		palabra = teclado.nextLine();
		
		//preparo un Tokenizer para dividir la frase
		StringTokenizer stk = new StringTokenizer(frase);
		
		while ( stk.hasMoreTokens() ) {
			String trozo = stk.nextToken(); //obtengo una palabra
			//si la palabra es la que tengo que cambiar, la paso a mayusculas
			//sino la dejo como estaba
			if ( trozo.equals(palabra) ) {
				resultado += trozo.toUpperCase() + " ";
			} else {
				resultado += trozo + " ";
			}
			
		}
		
		
		System.out.println(resultado);
	}

}









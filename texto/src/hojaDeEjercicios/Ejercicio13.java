package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * 13. Realiza un programa que averigüe cual es la palabra que mas letras tiene de
			un String. El String solo contendrá letras y espacios de separación, nada más.
				En el ejemplo: “Este Mp3 lo conecto al puerto usb”
				El método debe retornar la palabra “conecto” que es la que más letras
				tiene.
		 */

		
		Scanner teclado = new Scanner(System.in);
		String frase, palabraMayor="";
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		//troceamos la frase
		StringTokenizer stk = new StringTokenizer(frase);
		
		while (stk.hasMoreTokens()) {
			String token = stk.nextToken();
			if (token.length() > palabraMayor.length()) {
				palabraMayor = token;
			}
		}
		
		System.out.println("Resultado: " + palabraMayor);
	}

}










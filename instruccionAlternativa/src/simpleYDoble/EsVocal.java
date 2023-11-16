package simpleYDoble;

import java.util.Scanner;

public class EsVocal {

	public static void main(String[] args) {
		// Pedimos una letra por teclado y respondemos si es vocal o consonante
		
		char letra;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una letra: ");
		letra = teclado.nextLine().charAt(0);
		teclado.close();
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o'|| letra == 'u'
			|| letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O'|| letra == 'U'	) {
			System.out.println("Es vocal");
		} else {
			System.out.println("Es consonante");
		}

		
		if ("aeiouAEIOU".contains( String.valueOf(letra))) {
			System.out.println("Es vocal");
		} else {
			System.out.println("Es consonante");
		}
	}

}

package pruebas;

import java.util.Scanner;

public class ContarVocales {

	public static void main(String[] args) {
		// Contar cuantas vocales tiene una frase
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		String vocales = "aeiouAEIOUáéíóúÁÉÍÓÚüÜ";
		int contador = 0;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		

		for (int i = 0; i < frase.length() ; i++) {
			if (vocales.indexOf(frase.charAt(i)) != -1 ) { //compruebo si la letra es una vocal
				contador++;
			}
		}
		
		System.out.println("Total vocales: " + contador);
	}

}





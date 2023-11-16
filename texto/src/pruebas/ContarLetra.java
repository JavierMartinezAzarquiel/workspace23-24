package pruebas;

import java.util.Scanner;

public class ContarLetra {

	public static void main(String[] args) {
		// Pedimos una frase y la letra a buscar.
		// Contamos cuantas veces aparece esa letra independientemente de mayusculas
		
		Scanner teclado = new Scanner(System.in);
		
		String frase;
		char letra;
		int contador = 0;
		
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		System.out.print("Teclea la letra a buscar: ");
		letra = teclado.nextLine().charAt(0);
		//antes de comenzar, convierto todo a mayusculas
		frase = frase.toUpperCase();
		letra = Character.toUpperCase(letra);
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra) {
				contador++;
			}
		}
		
		System.out.println("La letra aparece " + contador + " veces");
		
	}

}








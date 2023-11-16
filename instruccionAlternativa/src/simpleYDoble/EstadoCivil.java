package simpleYDoble;

import java.util.Scanner;

public class EstadoCivil {

	public static void main(String[] args) {
		/*
		 * Programa que pida la letra del estado civil, y responde con el nombre completo
		 * 
		 *  sS  Soltero/a
		 *  cC  Casado/a
		 *  vV  Viudo/a
		 *  dD  Divorciado/a
		 *  
		 */

		char letra;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una letra: ");
		letra = teclado.nextLine().charAt(0);
		teclado.close();
		
		if (letra == 's' || letra == 'S') {
			System.out.println("Soltero/a");
		} else if (letra == 'c' || letra == 'C') {
			System.out.println("Casado/a");
		} else if (letra == 'v' || letra == 'V') {
			System.out.println("Viudo/a");
		} else if (letra == 'd' || letra == 'D') {
			System.out.println("Divorciado/a");
		} else {
			System.out.println("Letra incorrecta");
		}

		
		
	}

}










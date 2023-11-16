package multiple;

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

		// con un switch
		
		char letra;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una letra: ");
		letra = teclado.nextLine().charAt(0);
		teclado.close();
		
		switch (letra) {
		case 's':
		case 'S':
			System.out.println("Soltero/a");
			break;

		case 'c','C':
			System.out.println("Casado/a");
			break;
		
		case 'v', 'V':
			System.out.println("Viudo/a");
			break;
			
		case 'd', 'D':
			System.out.println("Divorciado/a");
			break;
			
		default:
			System.out.println("Letra incorrecta");
			break;
		}
		
		
			
		
	}

}










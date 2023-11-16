package bucleFor;

import java.util.Scanner;

public class Cuadrado {

	public static void main(String[] args) {
		/* Pedir un numero y hacer un cuadrado con *
		 * 
		 * 			*****
		 * 			*   *
		 *  		*   *
		 *  		*   *
		 *   		*****
		 */

		
		Scanner teclado = new Scanner(System.in);

		int numero;
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = 1; j <= numero; j++) {
				if (i==1 || i==numero || j==1 || j==numero) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}






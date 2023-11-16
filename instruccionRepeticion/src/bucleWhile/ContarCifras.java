package bucleWhile;

import java.util.Scanner;

public class ContarCifras {

	public static void main(String[] args) {
		/*
		 *  Pedimos un número entero y calculamos cuantas cifras tiene
		 *  
		 *  Repetir una división entre 10 hasta que podamos
		 */

		Scanner teclado = new Scanner(System.in);
		int numero, contador = 0;
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		
		do {
			//divido el número entre 10 y cuento una división mas
			numero /= 10; //numero = numero / 10;
			contador++;
		}while (numero != 0);
		
		System.out.println("Tiene " + contador + " cifras");
	}

}





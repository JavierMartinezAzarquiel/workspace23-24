package bucleWhile;

import java.util.Scanner;

public class PruebaBreak {

	public static void main(String[] args) {
		// Pedir números por teclado y los vamos sumando, hasta que tecleemos un 0
		// Solución usando BREAK
		
		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0;


		do {//pedimos números y los sumamos hasta que tecleamos el 0
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			if (numero == 0) {
				break;			//si el número es 0, rompo el bucle
			}
			suma += numero;
		} while (true); //no me preocupa la condición

		System.out.println("La suma total es: " + suma);
	}

}

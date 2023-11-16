package bucleWhile;

import java.util.Scanner;

public class SumarNumerosHastaPoner0 {

	public static void main(String[] args) {
		// Pedir números por teclado y los vamos sumando, hasta que tecleemos un 0
		
		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0;
		
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			suma += numero;
		} while (numero != 0);

		System.out.println("La suma total es: " + suma);
	}

}

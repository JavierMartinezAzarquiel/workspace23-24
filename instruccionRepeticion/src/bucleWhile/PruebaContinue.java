package bucleWhile;

import java.util.Scanner;

public class PruebaContinue {

	public static void main(String[] args) {
		// Pedir números por teclado y los vamos sumando,
		// sumamos los positivos, los negativos no
		// hasta que tecleemos un 0
		// usaremos un 	CONTINUE para no sumar los negativos

		Scanner teclado = new Scanner(System.in);
		int numero, suma = 0;

		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			if (numero < 0) {
				continue;      //si el número es negativo, pasamos de el
			}
			suma += numero;
		} while (numero != 0);

		System.out.println("La suma total es: " + suma);

	}

}

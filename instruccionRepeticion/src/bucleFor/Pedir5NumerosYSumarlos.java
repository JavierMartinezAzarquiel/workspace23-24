package bucleFor;

import java.util.Scanner;

public class Pedir5NumerosYSumarlos {

	public static void main(String[] args) {
		// Programa que pide 5 números por teclado y nos dé la suma total

		Scanner teclado = new Scanner(System.in);

		int numero, suma = 0;//a la variable suma le llamamos un "acumulador"

		for (int i = 0; i < 5; i++) {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			suma = suma + numero;  //suma += numero;
		}
		
		teclado.close();
		System.out.println("La suma total es: " + suma);
	}

}

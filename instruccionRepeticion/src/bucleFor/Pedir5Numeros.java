package bucleFor;

import java.util.Scanner;

public class Pedir5Numeros {

	public static void main(String[] args) {
		// Programa que pide 5 números por teclado
		
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		
		for (int i = 1; i <= 5; i++) {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
		}
		

	}

}

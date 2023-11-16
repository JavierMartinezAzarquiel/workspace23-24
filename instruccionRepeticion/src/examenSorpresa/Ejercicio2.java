package examenSorpresa;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Comprobar que un número es perfecto
		
		Scanner teclado = new Scanner(System.in);

		int numero, acumulador = 0;
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				acumulador += i;
			}	
		}
		
		if(acumulador == numero) {
			System.out.println("Número Perfecto");
		}else {
			System.out.println("No Perfecto");
		}
		
	}

}








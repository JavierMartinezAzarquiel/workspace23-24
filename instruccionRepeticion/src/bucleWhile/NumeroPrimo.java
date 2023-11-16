package bucleWhile;

import java.util.Scanner;

public class NumeroPrimo {

	public static void main(String[] args) {
		/*
		 * Pedimos un número entero por teclado y averiguamos si es primo
		 * 
		 */
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		boolean haSalidoRestoCero = false; //bandera flag
		
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		
		//dividimos el número entre todos sus posibles divisores salvo el 1
		//si sale un resto cero, lo anotamos.
		
		for (int i = numero -1 ; i > 1; i--) {
			if( numero % i == 0) { //si sale resto cero, lo anoto
				haSalidoRestoCero = true; //subo la bandera
			}
		}
		
		if (haSalidoRestoCero) { //si la bandera está subida
			System.out.println("No es primo");
		} else {
			System.out.println("Es primo");
		}
	}

}











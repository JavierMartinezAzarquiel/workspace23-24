package bucleWhile;

import java.util.Scanner;

public class NumeroPrimo2 {

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
		
		int i= numero - 1;
		while(i>1 && !haSalidoRestoCero) {
			if( numero % i == 0) { //si sale resto cero, lo anoto
				haSalidoRestoCero = true; //subo la bandera
			}
			i--;
		}
		
		if (haSalidoRestoCero) { //si la bandera está subida
			System.out.println("No es primo");
		} else {
			System.out.println("Es primo");
		}

	}

}

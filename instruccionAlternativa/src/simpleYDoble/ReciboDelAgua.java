package simpleYDoble;

import java.util.Scanner;

public class ReciboDelAgua {

	public static void main(String[] args) {
		/*
		 * Calcular el precio del recibo del agua
		 * Pedimos por teclado los metros cúbicos que hemos consumido y calculamos el precio
		 * 
		 * Hasta 10 mº a 1€ cada uno
		 * de 11 a 20 mº a 4€ cada uno
		 * mas de 20 a 10€ 
		 */

		final int PRECIO_BARATO = 1;
		final int PRECIO_MEDIO = 4;
		final int PRECIO_CARO = 10;
		
		int consumo, total;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea cuantos m\u00b3 has consumido: ");
		consumo = teclado.nextInt();
		teclado.close();
		
		if (consumo <= 10) {
			total = consumo * PRECIO_BARATO;
		} else if (consumo <= 20) {
			total = 10 * PRECIO_BARATO + (consumo - 10) * PRECIO_MEDIO;
		} else {
			total = 10 * PRECIO_BARATO + 10 * PRECIO_MEDIO + (consumo - 20) * PRECIO_CARO;
		}
		
		System.out.println("Total a pagar: " + total + "€");
	}

}







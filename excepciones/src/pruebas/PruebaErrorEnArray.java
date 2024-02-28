package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaErrorEnArray {

	public static void main(String[] args) {
		// Proteger un programa que trabaja con un array
		
		Scanner teclado = new Scanner(System.in);

		int[] temperaturas = {15, 16, 13, 12, 15, 14, 18};
		
		try {
			System.out.print("¿Que dia quieres consultar(1-7)?: ");
			int dia = teclado.nextInt();
			
			System.out.println("La temperatura ese día fué: " + temperaturas[dia-1]);
		} catch (InputMismatchException e) {
			System.out.println("Has escrito cosas raras");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Te dije que era de 1 a 7");
		} catch (Exception e) {
			System.out.println("Algo salió mal");
		} finally {
			System.out.println("Fin del programa");
			//esto se hace siempre, con errores o sin ellos
		}
	}

}

package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaErrorEnDivision {

	public static void main(String[] args) {
		//Probar las posibles excepciones que se producen en una division
		
		/*
		 * Bloque try/catch
		 * 
		 * try{
		 *    //aquí ponemos las instruccion que queremos probar
		 * }catch (Exception e){
		 *    //aquí la solución a la excepcion en caso de que se produzca
		 * }
		 */

		
		Scanner teclado = new Scanner(System.in);
		int a,b;
		
		System.out.print("Teclea el dividendo: ");
		try {
			a = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("No has escrito bien el número");
			a = 1; //le pongo un valor por defecto
		}
		
		System.out.print("Teclea el divisor: ");
		try {
			b = teclado.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("No has escrito bien el número");
			b = 1; //le pongo un valor por defecto
		}
		
		try {
			System.out.println("La división es: " + a/b);
		} catch (ArithmeticException e) {
			System.out.println("No puedo dividir entre 0");
		}
	}

}







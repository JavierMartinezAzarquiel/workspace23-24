package pruebas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaErrorEnDivision2 {

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
		
		try {
			System.out.print("Teclea el dividendo: ");
			a = teclado.nextInt();
			System.out.print("Teclea el divisor: ");
			b = teclado.nextInt();
			
			System.out.println("La división es: " + a/b);
			
		} catch (ArithmeticException e) {
			System.out.println("No puedo dividir entre 0: " + e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("No has escrito bien el número");
		} catch (Exception e) { //aquí cubro todas las posibles excepciones
			System.out.println("No se el que, pero algo pasó");
		}
		
	}

}







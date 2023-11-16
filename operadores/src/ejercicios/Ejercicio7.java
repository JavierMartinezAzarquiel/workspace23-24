package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Prepara un programa que pide por teclado tres números y nos dice si
			están ordenados o no.
		 */

		//variables 
		int numeroA, numeroB, numeroC;
		boolean ordenados;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numeroA = teclado.nextInt();
		
		System.out.print("Teclea otro numero: ");
		numeroB = teclado.nextInt();
		
		System.out.print("Teclea otro numero: ");
		numeroC = teclado.nextInt();
		teclado.close();
		
		//ordenados =  numeroA <= numeroB  &&  numeroB  <= numeroC; //solo creciente
		
		ordenados =  (numeroA <= numeroB  &&  numeroB  <= numeroC) 
				    || (numeroA >= numeroB  &&  numeroB  >= numeroC);
		
		System.out.println("Ordenados: " + ordenados);
		
	}

}




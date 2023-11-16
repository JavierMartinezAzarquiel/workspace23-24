package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que cuando un cliente de un banco quiere sacar
			una cantidad de dinero de su cuenta, calcule cuantos billetes tenemos
			que darle. Siempre calcularemos la mínima cantidad de billetes.
					Teclea la cantidad de euros: 3475
					La cantidad de billetes que te tengo que dar es:
						6 billetes de 500€
						2 billetes de 200€
						0 billetes de 100€
						1 billetes de 50€
						1 billetes de 20€
						0 billetes de 10€
						1 billetes de 5€
		 */

		//variables
		int dineroTotal, resto, billetes500, billetes200,
			billetes100, billetes50, billetes20, billetes10, billetes5;

		//Pedir la cantidad de dinero
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea la cantidad de euros: ");
		dineroTotal = teclado.nextInt();
		teclado.close();

		System.out.println("La cantidad de billetes que te tengo que dar es:");
		
		billetes500 = dineroTotal / 500;
		System.out.println("\t" + billetes500 + " billetes de 500€");
		resto = dineroTotal % 500;
		
		billetes200 = resto / 200;
		System.out.println("\t" + billetes200 + " billetes de 200€");
		resto = resto % 200;

		billetes100 = resto / 100;
		System.out.println("\t" + billetes100 + " billetes de 100€");
		resto = resto % 100;
		
		billetes50 = resto / 50;
		System.out.println("\t" + billetes50 + " billetes de 50€");
		resto = resto % 50;
		
		billetes20 = resto / 20;
		System.out.println("\t" + billetes20 + " billetes de 20€");
		resto = resto % 20;
		
		billetes10 = resto / 10;
		System.out.println("\t" + billetes10 + " billetes de 10€");
		resto = resto % 10;
		
		billetes5 = resto / 5;
		System.out.println("\t" + billetes5 + " billetes de 5€");
		resto = resto % 5;
	}

}






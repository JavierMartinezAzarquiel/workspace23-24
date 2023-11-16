package primerosProgramas;

import java.util.Scanner;

public class Doble {

	public static void main(String[] args) {
		/*
		 * Programa que pida al usuario que teclee un numero
		 * Y nosotros imprimimos el doble de ese número
		 */
		
		double numero, doble; //variables para guardar los datos (son gratis)
		
		//preparar un objeto para poder hablar con el teclado
		Scanner teclado = new Scanner(System.in);
		
		//Mostrar un mensaje para que el usuario teclee algo
		System.out.print("Teclea un numero: ");
		
		//Le digo al teclado que esté atento para guardar lo que tecleen
		numero = teclado.nextDouble();

		//calcular el doble
		doble = numero * 2;
		
		//imprimo el resultado
		System.out.println("El doble es : " + doble);
		
		//libero el objeto teclado para que no consuma mas recursos
		teclado.close();
	}

}










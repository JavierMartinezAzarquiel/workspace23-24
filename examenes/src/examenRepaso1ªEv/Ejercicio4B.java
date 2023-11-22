package examenRepaso1ªEv;

import java.util.Scanner;

public class Ejercicio4B {

	public static void main(String[] args) {
		/*
		 * 4. Realiza un programa que averigüe si un número entero tiene todas sus cifras
			ordenadas. El programa debe pedir al usuario que teclee un número, y debe
			responder si el número tiene las cifras ordenadas ascendentemente o no.
					Ejemplo:
					El numero 2568 tiene todas sus cifras ordenadas ascendentemente.
					El numero 4637 no tiene las cifras ordenadas.
			
			Nota: El número puede tener un número cualquiera de cifras, no tiene que tener
			exactamente cuatro como en el ejemplo. Si el número tuviese una sola cifra, se
			entenderá que tiene las cifras ordenadas correctamente.
		 */
		Scanner teclado = new Scanner(System.in);
		int numero, anterior, cifra;
		boolean ordenado = true; //flag para indicar si está ordenado o no
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		
		//solución usando matemáticas
		anterior = numero % 10; //saco el último numero antes de comenzar el bucle
		numero /= 10; //quito la cifra
		
		while (numero>0) {
			//saco otra cifra y la comparo con la anterior
			cifra = numero % 10;
			numero /= 10;
			
			if(cifra > anterior) { //si la cifra es mayor que la anterior
				ordenado = false; //bajo la bandera
			}
			
			anterior = cifra; //me preparo para la siguiente vuelta
		}
		
		if (ordenado) {
			System.out.println("Las cifras están ordenadas");
		} else {
			System.out.println("Las cifras NO están ordenadas");
		}
		
	}

}







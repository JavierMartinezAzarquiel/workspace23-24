package hojaDeEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * 1. En un array de 20 elementos hay almacenados números enteros. Haz un
				programa que pida un número y diga cuantas veces aparece el número dentro del
				array.
		 */

		int[] datos = new int[20]; //declaramos el array para contener 20 datos
		
		//rellenamos el array con datos aleatorios
		for (int i = 0; i < datos.length; i++) {
			datos[i] = (int)(Math.random()* 50);
		}
		
		System.out.println(Arrays.toString(datos));
		
		//Pedimos el número a buscar
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		int numero = teclado.nextInt();
		
		//hacemos la búsqueda
		int contador = 0;
//		for (int i = 0; i < datos.length; i++) {
//			if( datos[i] == numero) {
//				contador++;
//			}
//		}
		
		//bucle foreach
		for (int valor : datos) {
			if( valor == numero) {
				contador++;
			}
		}
		
		System.out.println("Aparece " + contador + " veces");
		
	}

}

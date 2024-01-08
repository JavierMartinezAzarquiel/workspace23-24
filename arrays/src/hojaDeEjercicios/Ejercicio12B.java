package hojaDeEjercicios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio12B {

	public static void main(String[] args) {
		/*
		 * Programa que lea números enteros hasta que se escriba el -1. Los números deben
			ir quedando almacenados en un array. Como no sabemos los números que van a
			teclear el array debe ir cambiando de tamaño para irse adaptando al numero de
			datos leídos.
		 */
		
		Scanner teclado = new Scanner(System.in);
		int[] lista = new int[0];
		
		int numero;
		System.out.print("Teclea un numero:");
		numero = teclado.nextInt();
		while( numero != -1){
			lista = Arrays.copyOf(lista, lista.length + 1 );
			lista[ lista.length - 1 ] = numero;
			System.out.print("Teclea un numero:");
			numero = teclado.nextInt();
		}
		
		System.out.println("Lista de numeros tecleados: " + Arrays.toString(lista) );
	}

}

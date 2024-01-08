package hojaDeEjercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		/*
		 * Programa que lea números enteros hasta que se escriba el -1. Los números deben
			ir quedando almacenados en un array. Como no sabemos los números que van a
			teclear el array debe ir cambiando de tamaño para irse adaptando al numero de
			datos leídos.
		 */
		
		Scanner teclado = new Scanner(System.in);
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		int numero;
		System.out.print("Teclea un numero:");
		numero = teclado.nextInt();
		while( numero != -1){
			lista.add(numero);
			System.out.print("Teclea un numero:");
			numero = teclado.nextInt();
		}
		
		System.out.println("Lista de numeros tecleados: " + lista);
	}

}

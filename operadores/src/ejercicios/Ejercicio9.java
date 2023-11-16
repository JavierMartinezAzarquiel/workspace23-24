package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		/*
		 * Prepara un programa que pide por teclado un número entero entre 0 y 99999, y lo escribe del revés.
				Teclea un número: 65741
				Del revés es: 14756

		 */
		
		//variables
		int numero, unidades, decenas, centenas, unidadesMillar, decenasMillar, delReves;

		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		//saco cada una de las cifras
		unidades = numero % 10;
		decenas = (numero / 10) % 10;
		centenas = (numero / 100) % 10;
		unidadesMillar = (numero / 1000) % 10;
		decenasMillar = numero / 10000;
		
		//crear el número en la variable delReves
		delReves = unidades*10000 + decenas*1000 + centenas*100 + unidadesMillar*10 + decenasMillar;
		
		//Mostrar el resultado
		System.out.println("El número del revés: " + delReves);
		System.out.println("El número del revés: " + unidades + decenas +centenas + unidadesMillar + decenasMillar);
	}

}









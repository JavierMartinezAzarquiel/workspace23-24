package examenRepaso1ªEv;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Ante el grave problema de calvicie que asola las cabezas de los hombres
			españoles, vamos a averiguar cuando un hombre se quedará calvo dependiendo
			del ritmo de pérdida de cabello.
			Realiza un programa que pida por teclado la edad del individuo cuando
			comenzó a perder pelo, el porcentaje de pelo que pierde cada año, y calcule a
			qué edad estará calvo.
				Ejemplo de cómo funcionará el programa:
				¿A qué edad comenzó la pérdida de cabello?: 20
				Porcentaje de pérdida de cabello (%): 15
				Te quedarás calvo a los 39 años
			La forma de calcular los años es:
				- Al principio el hombre tiene el 100% de pelo.
				- El primer año pierde el 15%
				100 - 100*15/100 = 85
				
				- El segundo año pierde el 15% de lo que quedaba.
				
				85 - 85*15/100 = 73
				
				- El tercer año pierde el 15% de lo que aún quedaba
				
				73 – 73*15/100 = 62
				
				- Y así sucesivamente hasta que el hombre tenga menos del 5% de
				cabello, en ese momento se considerará que está calvo.
		 */

		Scanner teclado = new Scanner(System.in);
		int edad, porcentaje;
		
		System.out.print("¿A qué edad comenzó la pérdida de cabello?: ");
		edad = teclado.nextInt();
		System.out.print("Porcentaje de pérdida de cabello (%): ");
		porcentaje = teclado.nextInt();
		
		double cabello = 100; //comenzamos teniendo el 100% del cabello
		
		//mientras nos quede mas del 5%
		while ( cabello >= 5) {
			edad++; //un año mas
			//calculo cuanto cabello me quedará
			cabello -= cabello * porcentaje/100;
		}
		
		System.out.println("Te quedarás calvo a los " + edad + " años");
		
		
	}

}

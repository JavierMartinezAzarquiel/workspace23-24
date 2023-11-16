package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		/*
		 * Diseñar un algoritmo para leer las longitudes de los lados de un triángulo (A, B,
			C) y determinar qué tipo de triángulo es, de acuerdo a los siguientes casos.
			Suponiendo que A es el mayor de los lados y que B y C corresponden a los otros
			dos lados entonces:
			
					Si A >= B+C no se trata de un triángulo
					Si A2 = B2+C2 es triángulo rectángulo
					Si A2 > B2+C2 triángulo obtusángulo
					Si A2 < B2+C2 triángulo acutángulo
		 */

		int a, b, c;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea el valor de a: ");
		a = teclado.nextInt();
		System.out.print("Teclea el valor de b: ");
		b = teclado.nextInt();
		System.out.print("Teclea el valor de c: ");
		c = teclado.nextInt();
		teclado.close();
		
		if(a >= b + c) {
			System.out.println("No se trata de un triángulo");
		}
		else if(Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Triangulo rectángulo");
		}
		else if(Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Triangulo obtusángulo");
		}
		else if(Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("Triangulo acutángulo");
		}
	}

}





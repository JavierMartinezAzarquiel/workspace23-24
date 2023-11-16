package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		/*
		 * Programa que calcule las soluciones de una ecuación de segundo grado.
		 */
		

		double a, b, c,discriminante;
		double resultado1, resultado2; 

		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir el valor de a:");
		a=teclado.nextDouble();

		System.out.print("Introducir el valor de b:");
		b=teclado.nextDouble();

		System.out.print("Introducir el valor de c:");
		c=teclado.nextDouble();
		teclado.close();

		//calculo el discriminante que me servir� para distinguir los 3 caminos posibles
		discriminante=Math.pow(b,2)-4*a*c;


		if(discriminante>0){ //si el discriminante es positivo existen dos soluciones
			resultado1=(-b-Math.sqrt(discriminante))/(2*a); 
			resultado2=(-b+Math.sqrt(discriminante))/(2*a);
			System.out.println("Resultado 1:" +resultado1);
			System.out.println("Resultado 2:" +resultado2);
		}else if(discriminante<0){ //si el discriminante es negativo, no existe ninguna soluci�n real
			System.out.println("No existen soluciones reales");
		}else{ //cuando el discriminante es ==0 solo hay una soluci�n
			System.out.println("Solución: "+(-b/(2*a)));
		}

		
	}

}

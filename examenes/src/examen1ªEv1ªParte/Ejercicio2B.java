package examen1ªEv1ªParte;

import java.util.Scanner;

public class Ejercicio2B {

	public static void main(String[] args) {
		/*
		 * 2.	Según la cultura china, los n�meros de la suerte son el 3, el 7, el 8 y el 9.
				Los n�meros de la mala suerte son el resto: el 0, el 1, el 2, el 4, el 5 y el 6.
				Un n�mero es afortunado si contiene m�s n�meros de la suerte que de la mala suerte. 
				Realiza un programa que diga si un n�mero introducido por el usuario es afortunado o no.
				
				Ejemplo 1:
				Introduzca un n�mero: 772
				El 772 es un n�mero afortunado.
				
				Ejemplo 2:
				Introduzca un n�mero: 7720
				El 7720 no es un n�mero afortunado.
				
				Ejemplo 3:
				Introduzca un n�mero: 43081
				El 43081 no es un n�mero afortunado.
				
				Ejemplo 4:
				Introduzca un n�mero: 888
				El 888 es un n�mero afortunado. 

		 */

		Scanner teclado = new Scanner(System.in);
		int numero, original, contadorBuenos = 0, contadorMalos= 0;
		
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		original = numero; //guardo el numero original para luego poder mostrar el resultado
		
		String texto = String.valueOf(numero);
		
		for (int i = 0; i < texto.length(); i++) {
			
			char cifra = texto.charAt(i); //saco una cifra		
			
			if(cifra == '3' || cifra == '7' || cifra == '8' || cifra == '9') { //si la cifra es de las buenas, la cuento
				contadorBuenos++;
			}else { //sino, cuento como cifra mala
				contadorMalos++;
			}
			
		}
		
		if(contadorBuenos > contadorMalos) {
			System.out.println("El " + original + " es un numero afortunado");
		}else {
			System.out.println("El " + original + " no es un numero afortunado");
		}
		
	}

}

package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Programa que obtenga el minimo comun multiplo(mcm) de dos numeros.
			Ejemplo: descomponemos los numeros en sus factores 10 (2 * 5) y 18 (2 * 9)
			entonces el mcm es (2 * 5 * 9).
					Introduciendo: 10 18
					Da como salida: 90
		 */

		Scanner teclado = new Scanner(System.in);
		
		int numero1, numero2, factor = 2, mcm = 1;
		
		System.out.print("Teclea un numero:");
		numero1=teclado.nextInt();
		System.out.print("Teclea otro numero:");
		numero2=teclado.nextInt();
		
		while (numero1 != 1 || numero2 != 1) { //mientras quede algo por dividir
			if( numero1 % factor == 0 ||  numero2 % factor == 0) {
				if ( numero1 % factor == 0) { //si puedo dividir entre este factor
					numero1 = numero1 / factor;   //divido el numero
				}	
				if ( numero2 % factor == 0) { //si puedo dividir entre este factor
					numero2 = numero2 / factor;   //divido el numero
				}	
				mcm *= factor;
			}else { //si no puedo dividir
				factor++; //paso al siguiente factor
			}
		}
		
		System.out.println("El mcm = " + mcm);
	}

}

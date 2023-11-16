package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*Programa que descomponga un número en sus factores primos.

			Introduciendo: 75
			Da como salida : 3 5 5
		*/
		Scanner teclado = new Scanner(System.in);
		
		int numero, factor = 2;
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		
		while (numero != 1) {
			if ( numero % factor == 0) { //si puedo dividir entre este factor
				System.out.println(factor); //lo muestro
				numero = numero / factor;   //divido el numero
			}else { //si no puedo dividir
				factor++; //paso al siguiente factor
			}
		}
		
	}

}








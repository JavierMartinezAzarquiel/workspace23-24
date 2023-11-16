package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		/*
		 * Realizar un programa que lea varios números por teclado hasta que se introduzca
		un cero, y entonces diga cuál es el mayor de los números introducidos y cuantas
		veces se repite ese número.
				Introduciendo: 1 3 5 5 4 6 6 7 1 4 7 2 0
				Da como salida: El mayor es el 7
				Se repite 2 veces
		 */

		Scanner teclado = new Scanner(System.in);
		
		int numero, mayor, veces;
		
		System.out.print("Teclea un numero:");
		numero=teclado.nextInt();
		mayor = numero;
		veces = 1;
		
		while (numero != 0) {
			System.out.print("Teclea un numero:");
			numero=teclado.nextInt();
			if(numero > mayor) {
				mayor = numero; //si es mayor, guarde este numero
				veces = 1;      // y reseteo el contador
			}else if (numero == mayor) {
				veces++; //si es igual al mayor, incremento el contador
			}
		} 
		
		System.out.println("El mayor es: " + mayor);
		System.out.println("Y se repite " + veces + " veces");
	}

}











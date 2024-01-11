package pruebas;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int edad;
		System.out.print("Teclea tu edad: ");
		edad = teclado.nextInt();
		
		if(esMayorDeEdad(edad)) {
			System.out.println("Eres mayor de edad");
		}else {
			System.out.println("No eres mayor de edad");
		}
	}

	
	//método al que pasamos la edad de una persona y nos dice si es mayor de edad
	public static boolean esMayorDeEdad( int edad) {
		if (edad >= 18) {
			return true;
		} else {
			return false;
		}
	}
}

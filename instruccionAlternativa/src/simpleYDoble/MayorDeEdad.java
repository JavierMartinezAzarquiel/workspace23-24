package simpleYDoble;

import java.util.Scanner;

public class MayorDeEdad {

	public static void main(String[] args) {
		// Pedimos por teclado la edad de una persona y
		// contestamos si es mayor de edad o no
		
		int edad;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea tu edad: ");
		edad = teclado.nextInt();
		teclado.close();

		//alternativa simple para contestar si es mayor de edad
//		if ( edad >= 18 ) {
//			System.out.println("Enhorabuena!!! Ya puedes votar");
//		}
		
		
		//alternativa doble
		if ( edad >= 18 ) {
			System.out.println("Enhorabuena!!! Ya puedes votar");
		} else {
			System.out.println("Los siento, no puedes votar. Con la ilusión que te hacía");
		}
		
		
	}

}

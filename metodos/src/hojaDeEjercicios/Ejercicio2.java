package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea una temperatura: ");
		float temperatura = teclado.nextFloat();

		System.out.println("En grados Fahrenheit: " + grados(temperatura));
	}

	
	//Escribe el método grados(), que convierta una temperatura en grados Celsius a
	//grados Fahrenheit. 
	public static float grados(float temperatura) {
		return 9F/5*temperatura + 32;
	}
}

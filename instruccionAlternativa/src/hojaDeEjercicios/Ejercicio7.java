package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);  
		int numero;

		//pedimos un numero
		System.out.print("Teclea un numero: ");
		numero=teclado.nextInt();
		teclado.close();

		if(numero < 10) {
			System.out.println("El numero tiene una cifra");
		}else if (numero < 100) {
			System.out.println("El numero tiene 2 cifras");
		}else if (numero < 1000) {
			System.out.println("El numero tiene 3 cifras");
		}else if(numero < 10000) {
			System.out.println("El numero tiene 4 cifras");
		}
		
	}

}

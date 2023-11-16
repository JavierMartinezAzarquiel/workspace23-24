package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*Programa que lea números hasta que se teclee un número negativo y después
		indique si se ha dado el mismo número dos veces consecutivas:
		
				Introduciendo: 1 3 5 3 4 6 7 –1
				Da como salida: No
				Introduciendo: 1 3 5 6 6 4 3 –1
				Da como salida : Si
		*/
		Scanner teclado = new Scanner(System.in);
		
		int numero, anterior;
		boolean repetidos = false; //flag para anotar si encontramos repetidos
		
		//Lectura anticipada
		System.out.print("Teclea un número: ");
		numero = teclado.nextInt();
		anterior = numero;
		
		while (numero >= 0) {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			//compruebo si es igual al anterior
			if (numero == anterior) {
				repetidos = true; //subo la bandera
			}
			//me preparo para la siguiente vuelta
			anterior = numero;
		} 
		
		if (repetidos) {//mostramos el resultado
			System.out.println("Hemos encontrado repetidos");
		} else {
			System.out.println("No hay repetidos");
		}
	}

}










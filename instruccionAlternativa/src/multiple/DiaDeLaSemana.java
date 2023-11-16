package multiple;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Pedir un número del 1 al 7 y vamos a imprimir el nombre del dia de la semana
		// Usaremos la estructura múltiple switch
		
		int numero;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		switch (numero) { //Estructura switch, aquí tengo que poner una variable o expresion
		case 1:  //rótulo de uno de los caminos.
			System.out.println("Lunes");
			break;
		case 2:  
			System.out.println("Martes");
			break;
		case 3:  
			System.out.println("Miercoles");
			break;
		case 4:  
			System.out.println("Jueves");
			break;
		case 5:  
			System.out.println("Viernes");
			break;
		case 6:  
			System.out.println("Sabado");
			break;
		case 7:  
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Número incorrecto");
			break;
		}
	}

}














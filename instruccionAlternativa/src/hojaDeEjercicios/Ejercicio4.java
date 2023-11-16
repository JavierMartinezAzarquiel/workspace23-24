package hojaDeEjercicios;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		/*
		 * Programa que nos diga si un número ha conseguido o no el reintegro en el
		sorteo de la ONCE. Un número de cinco cifras consigue el reintegro si su
		primera o última cifra coincide con la primera o última cifra del número
		agraciado en el sorteo.
		
				Introduciendo: 23745 y premiado es 29348
				Da como salida: Si tiene reintegro
		 */

		int numeroJugado, numeroPremiado;
		
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce el número jugado: ");
		numeroJugado=teclado.nextInt();
//		System.out.print("Introduce el número premiado: ");
//		numeroPremiado=teclado.nextInt();
		teclado.close();    
		
		//elegir de manera aleatoria el número premiado
//		numeroPremiado =(int) (Math.random()*100000); //multiplicamos por el máximo que queremos conseguir
		Random generador = new Random();
		numeroPremiado = generador.nextInt(100000);
		
		System.out.printf("Numero Premiado: %05d\n", numeroPremiado);
		
		if (numeroJugado / 10000 == numeroPremiado / 10000  
				|| numeroJugado % 10 == numeroPremiado % 10 ) {
			System.out.println("Premio: tienes reintegro");
		} else {
			System.out.println("Sigue jugando");
		}
	}

}









package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		/*
		 *  Realizar un programa que dada una medida de tiempo expresada en horas,
			minutos y segundos con valores arbitrarios, elabore un programa que
			transforme dicha medida en una expresión correcta.
			
			Introduciendo: 3 Horas 118 Minutos 195 Segundos
			Da como salida: 5 Horas 1 Minuto 15 Segundos
		 */
		int horas, minutos, segundos;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero de horas: ");
		horas = teclado.nextInt();
		System.out.print("Teclea un numero de minutos: ");
		minutos = teclado.nextInt();
		System.out.print("Teclea un numero de segundos: ");
		segundos = teclado.nextInt();
		teclado.close();
		
		// si hay mas de 59 segundos, hay que arreglar
		if ( segundos > 59 ) {
			minutos = minutos + segundos / 60; //dividir los segundos entre 60 y añadirlos a minutos
			segundos = segundos % 60; //me quedo con los segundos que restan
		}
		
		if ( minutos > 59 ) {
			horas = horas + minutos / 60; //dividir los minutos entre 60 y añadirlos a horas
			minutos = minutos % 60; //me quedo con los minutos que restan
		}
		
		
		System.out.println(horas + ":" + minutos + ":" + segundos);
		System.out.printf("%02d:%02d:%02d",horas, minutos, segundos);
	}

}








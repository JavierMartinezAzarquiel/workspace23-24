package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		/*
		 * 3. Crea una agenda para almacenar nombres y direcciones de N personas. Después
			haz un programa que permita ir consultando el nombre y la dirección de las
			personas almacenadas.
		 */

//		String[] nombres = {"Ana", "Carlos", "Javier", "María"};
//		String[] direcciones = {"Calle Urano, 18 Toledo", " "
		
		String[][] agenda = { {"Ana", "Calle Urano, 18 Toledo"},
							  {"Marcos", "Avda. Europa 16 4B, Toledo"},
							  {"Sara", "Gran via 148 5C, Madrid"},
							  {"Luis", "Calle Amanecer 18, Olias"} };
		
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿A quien buscas?: ");
		String nombreABuscar = teclado.nextLine();
		
		
		boolean encontrado = false;  //flag para indicar si hemos encontrado la persona
		for (int i = 0; i < agenda.length; i++) {
			if (nombreABuscar.equalsIgnoreCase(agenda[i][0])) {
				System.out.println("Su dirección es: " + agenda[i][1]);
				encontrado = true;
			}
		}
		
		//usando un bucle foreach
		for (String[] fila : agenda) {
			if (nombreABuscar.equalsIgnoreCase(fila[0])) {
				System.out.println("Su dirección es: " + fila[1]);
				encontrado = true;
			}
		}
		
		if (!encontrado) {
			System.out.println("Lo siento, no tengo a esa persona en la agenda");
		}
	
	}

}

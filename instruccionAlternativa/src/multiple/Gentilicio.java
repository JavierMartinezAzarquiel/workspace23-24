package multiple;

import java.util.Scanner;

public class Gentilicio {

	public static void main(String[] args) {
		// Tecleamos el nombre de un pueblo, y nos pone el gentilicio

		
		String pueblo;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea el nombre de tu pueblo: ");
		pueblo = teclado.nextLine();
		teclado.close();
		
		switch (pueblo) {
		case "Toledo":
			System.out.println("Toledano/a");
			break;
		case "Pantoja":
			System.out.println("Pantojano/a");
			break;
		case "Yuncos":
			System.out.println("Yunquero/a");
			break;
		case "Mora","mora","MORA":
			System.out.println("Moracho/a");
			break;
		default:
			System.out.println("Pueblo desconocido");
			break;
		}
	}

}















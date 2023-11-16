package multiple;

import java.util.Scanner;

public class DiasDelMes {

	public static void main(String[] args) {
		// Tecleamos un número entre 1 y 12, y ponemos los dias que 
		// tiene ese mes.
		
		int mes;

		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero del 1 al 12: ");
		mes = teclado.nextInt();
		teclado.close();

		//dependiendo del mes, escribo los días correspondientes
		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Tiene 31 dias");
			break;
		case 2:
			System.out.println("Tiene 28 dias");
			break;
		case 4, 6, 9, 11:
			System.out.println("Tiene 30 dias");
			break;
		default:
			System.out.println("Del 1 al 12");
			break;
		}
		
	}

}












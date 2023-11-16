package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int nota;
		System.out.print("Introduzca una nota: ");
		nota=teclado.nextInt();
		teclado.close();
		
		switch(nota){
		case 0,1,2,3,4:
			System.out.println("INSUFICIENTE");
			break;
		case 5:
			System.out.println("SUFICIENTE");
			break;
		case 6:
			System.out.println("BIEN");
			break;
		case 7:case 8:
			System.out.println("NOTABLE");
			break;
		case 9:case 10:
			System.out.println("SOBRESALIENTE");
			
		}//fin switch

	}

}

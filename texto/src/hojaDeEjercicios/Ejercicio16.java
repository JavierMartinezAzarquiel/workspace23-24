package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que compruebe si en una palabra se repite alguna vocal
			más de 2 veces. El programa pedirá que se teclee una palabra y comprobará
			la vocales que contiene, cuando compruebe que una vocal aparece mas de
			dos veces emitirá un mensaje en la pantalla y terminará. El programa debe
			terminar en el mismo instante en que encuentre mas de dos vocales iguales,
			no esperará a comprobar toda la palabra.
					Ejemplo: Escriba una palabra: “Instintivo”
					Dará como resultado: “Tiene mas de dos vocales iguales”
		 */

		Scanner teclado = new Scanner(System.in);

		String palabra;
		int contadorA = 0, contadorE = 0, contadorI = 0, contadorO = 0, contadorU = 0;

		System.out.print("Escribe una palabra: ");
		palabra = teclado.nextLine();

		for (int i = 0; i < palabra.length() ; i++) {
			
			switch ( Character.toLowerCase(palabra.charAt(i)) ) { //convertido a minusculas
			case 'a':contadorA++;
			break;
			case 'e':contadorE++;
			break;
			case 'i':contadorI++;
			break;
			case 'o':contadorO++;
			break;
			case 'u':contadorU++;
			break;
			}
			
			if(contadorA == 3 || contadorE == 3 || contadorI == 3 || contadorO == 3 || contadorU == 3 ) {
				break;  //si algun contador ha llegado a tres, paro el bucle
			}
		}//for
		
		if( contadorA >= 3 || contadorE >= 3 || contadorI >= 3 || contadorO >= 3 || contadorU >= 3 ) {
			System.out.println("Tiene mas de dos vocales iguales");
		}else {
			System.out.println("No tiene mas de dos vocales iguales");
		}
	}

}

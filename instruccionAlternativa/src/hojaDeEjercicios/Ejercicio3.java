package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		/*
		 * Programa que obtenga la letra del DNI a partir del número. Para ello debe
			dividir el número entre 23(división entera), luego multiplicarlo por 23 y restar el
			resultado del valor original. La letra asociada al número vendrá dada por este
			resto en función de la siguiente tabla:
			0 T 1 R 2 W 3 A 4 G 5 M
			6 Y 7 F 8 P 9 D 10 X 11 B
			12 N 13 J 14 Z 15 S 16 Q 17 V
			18 H 19 L 20 C 21 K 22 E
		 */
		
		int dni,resultado,diferencia;
		char letra;
	
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduce tu DNI:");
		dni=teclado.nextInt();
		teclado.close();           

		resultado = dni / 23 *23;      // dividimos el dni entre 23
		                               // y lo multiplicamos por 23
		
		diferencia = dni - resultado;  // calculamos la diferencia
		
		switch(diferencia){            // hacemos un switch de la diferencia entre el dni original            
		case 0:letra='T';break;
		case 1:letra='R';break;
		case 2:letra='W';break;
		case 3:letra='A';break;
		case 4:letra='G';break;        // para cada numero ponemos en letra su caracter correspondiente
		case 5:letra='M';break;
		case 6:letra='Y';break;
		case 7:letra='F';break;
		case 8:letra='P';break;
		case 9:letra='D';break;
		case 10:letra='X';break;
		case 11:letra='B';break;
		case 12:letra='N';break;
		case 13:letra='J';break;
		case 14:letra='Z';break;
		case 15:letra='S';break;
		case 16:letra='Q';break;
		case 17:letra='V';break;
		case 18:letra='H';break;
		case 19:letra='L';break;
		case 20:letra='C';break;
		case 21:letra='K';break;
		case 22:letra='E';break;
		default:letra='*';
		}

		System.out.println("DNI: "+dni+letra);          //escribimos el dni y su letra
	}


}

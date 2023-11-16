package simpleYDoble;

import java.util.Scanner;

public class Horoscopo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dia,mes;
		
		System.out.print("Teclea tu dia de nacimiento: ");
		dia = teclado.nextInt();
		System.out.print("Teclea tu mes de nacimiento: ");
		mes = teclado.nextInt();	
		teclado.close();

		if( mes==3 && dia>=21  || mes==4 && dia<=20) {
			System.out.println("Aries");
		}else if(mes==4 && dia>=21 || mes==5 && dia<=21) {
			System.out.println("Tauro");
		}else if(mes==5 && dia>=22 || mes==6 && dia<=21) {
			System.out.println("Géminis");
		}else if(mes==6 && dia>=22 || mes==7 && dia<=21) {
			System.out.println("Cancer");
		}else if(mes==7 && dia>=22 || mes==8 && dia<=21) {
			System.out.println("Leo");
		}else if(mes==8 && dia>=22 || mes==9 && dia<=21) {
			System.out.println("Virgo");
		}else if(mes==9 && dia>=22 || mes==10 && dia<=21) {
			System.out.println("Libra");
		}else if(mes==10 && dia>=22 || mes==11 && dia<=21) {
			System.out.println("Escorpio");
		}else if(mes==11 && dia>=22 || mes==12 && dia<=21) {
			System.out.println("Sagitario");
		}else if(mes==12 && dia>=22 || mes==1 && dia<=21) {
			System.out.println("Capricornio");
		}else if(mes==1 && dia>=22 || mes==2 && dia<=21) {
			System.out.println("Acuario");
		}else if(mes==2 && dia>=22 || mes==3 && dia<=21) {
			System.out.println("Piscis");
		}else {System.out.println("Fecha incorrecta");}
		
	}

}

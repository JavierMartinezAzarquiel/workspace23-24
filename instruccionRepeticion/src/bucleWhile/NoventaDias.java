package bucleWhile;

import java.util.Scanner;

public class NoventaDias {

	public static void main(String[] args) {
		// Dado un dia y un mes, averiguar cual será la fecha a 90 dias

		int dia, mes, diasMes, plazo = 90;
		Scanner teclado = new Scanner(System.in);

		System.out.print("Teclea un dia: ");
		dia = teclado.nextInt();
		System.out.print("Teclea un mes: ");
		mes = teclado.nextInt();

		while (plazo != 0) {
			//averiguar cuantos dias tiene el mes
			switch(mes) {
			case 2: diasMes=28;
			break;
			case 4,6,9,11: diasMes=30;
			break;
			default: diasMes=31;
			}
			//si me queda plazo, le resto esos dias y cambio de mes
			if (plazo >= diasMes) { //si puedo colocar el mes entero, lo coloco
				plazo -= diasMes;
				mes++;
				if(mes==13) { mes=1;}
			} else {
				dia += plazo;
				plazo = 0;	
				if(dia > diasMes) {
					mes++;
					dia -= diasMes;
				}
				if(mes==13) { mes=1;}
			}
			
		}
		System.out.println(dia+"/"+mes);
		



	}

}

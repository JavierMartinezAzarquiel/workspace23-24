package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un dia: ");
		int dia = teclado.nextInt();
		System.out.print("Teclea un mes: ");
		int mes = teclado.nextInt();
		
		System.out.println("Han pasado " + fecha(dia,mes) + " dias");
	}

	
	/*
	 * Método fecha() que calculará el día del año al que corresponde una fecha en
	formato día, mes.
			fecha(1,1)=1
			fecha(11,3)=70
			fecha(31,12)=365
	 */
	public static int fecha(int dia, int mes) {
		if(mes<1 || mes>12 || dia<1 || dia>31) return -1;
		
		int total = 0;
		for (int i = 1; i < mes; i++) {
			switch (i) {
			case 2:	total += 28;
				break;
			case 4,6,9,11: total += 30;
				break;
			default: total += 31;
			}
		}
		return total + dia;
	}
	
	
}





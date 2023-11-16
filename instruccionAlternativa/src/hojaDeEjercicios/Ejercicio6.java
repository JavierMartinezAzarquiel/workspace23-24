package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int dia,mes,año,diasDelMes;

		System.out.print("Teclea el valor del dia: ");
		dia=teclado.nextInt();
		System.out.print("Teclea el valor del mes: ");
		mes=teclado.nextInt();
		System.out.print("Teclea el valor del año: ");
		año=teclado.nextInt();
		teclado.close();

		//averiguar cuantos dias tiene el mes
		switch(mes){
		case 2:diasDelMes=28;break;
		case 4,6,9,11:diasDelMes=30; break;
		default: diasDelMes=31;
		}

		if( dia == diasDelMes){ //es fin de mes
			dia=1;
			mes++;
			//si me he pasado de mes, cambiar de año
			if(mes>12){
				mes=1;
				año++;
			}

		}else{ //no es fin de mes
			dia++;
		}

		System.out.printf("Dia siguiente: %02d/%02d/%d",dia,mes,año);

	}

}

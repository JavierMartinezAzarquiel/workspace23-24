package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num;
		int unidades, decenas;

		System.out.print("Introduzca un número (0 a 99): ");
		num=teclado.nextInt();
		teclado.close();
		
		if(num>10 && num<20 || num>20 && num<30 || num==0){	
			//switch casos especiales
			switch(num){
			case 0:System.out.print("cero");break;
			case 11:System.out.print("once");break;
			case 12:System.out.print("doce");break;
			case 13:System.out.print("trece");break;
			case 14:System.out.print("catorce");break;
			case 15:System.out.print("quince");break;
			case 16:System.out.print("dieciseis");break;
			case 17:System.out.print("diecisiete");break;
			case 18:System.out.print("dieciocho");break;
			case 19:System.out.print("diecinueve");break;
			case 21:System.out.print("veintiuno");break;
			case 22:System.out.print("veintidos");break;
			case 23:System.out.print("veintitres");break;
			case 24:System.out.print("veinticuatro");break;
			case 25:System.out.print("veinticinco");break;
			case 26:System.out.print("veintiseis");break;
			case 27:System.out.print("veintisiete");break;
			case 28:System.out.print("veintiocho");break;
			case 29:System.out.print("veintinueve");break;
			}
		}else{//casos normales	
			//obtengo decenas y unidades
			unidades = num % 10;
			decenas = num / 10;

			switch(decenas){  //switch para imprimir las decenas
			case 0:
				System.out.print("");
				break;
			case 1:
				System.out.print("diez");
				break;
			case 2:
				System.out.print("veinte");
				break;
			case 3:
				System.out.print("treinta");
				break;
			case 4:
				System.out.print("cuarenta");
				break;
			case 5:
				System.out.print("cincuenta");
				break;
			case 6:
				System.out.print("sesenta");
				break;
			case 7:
				System.out.print("setenta");
				break;
			case 8:
				System.out.print("ochenta");
				break;
			case 9:
				System.out.print("noventa");
				break;
			}


			if(unidades!=0 && decenas!=0){ //decidir si poner el "y" o no ponerlo
				System.out.print (" y ");
			}

			switch(unidades){   //switch para imprimir las unidades
			case 0:
				System.out.println("");
				break;
			case 1:
				System.out.println("uno");
				break;
			case 2:
				System.out.println("dos");
				break;
			case 3:
				System.out.println("tres");
				break;
			case 4:
				System.out.println("cuatro");
				break;
			case 5:
				System.out.println("cinco");
				break;
			case 6:
				System.out.println("seis");
				break;
			case 7:
				System.out.println("siete");
				break;
			case 8:
				System.out.println("ocho");
				break;
			case 9:
				System.out.println("nueve");
				break;
			}

		}//fin else	
	}

}

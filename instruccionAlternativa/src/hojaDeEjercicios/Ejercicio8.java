package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num;
		int um, c, d, u;
		
		System.out.print("Introduzca un numero entre 0 y 9.999: ");
		num=teclado.nextInt();
		teclado.close();
		
		if(num<10){
			System.out.println("Del reves: "+num);
		}else if(num<100){
			u = num % 10;
			d = num / 10;
			System.out.println("Del reves: "+ u + d);
		}else if(num<1000){
			u = num % 10;
			d = (num%100)/10;
			c = num / 100;
			System.out.println("Del reves: "+ u + d + c);
		}else if(num<10000){
			u = num % 10;
			d = (num%100)/10;
			c = (num%1000)/100;
			um =num / 1000;
			System.out.println("Del reves: "+ u + d + c + um);
		}
		

	}

}

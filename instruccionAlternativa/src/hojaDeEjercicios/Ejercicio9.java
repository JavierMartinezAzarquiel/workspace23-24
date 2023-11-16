package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		int num;
		int um, c, d, u;
		
		System.out.print("Introduzca un numero entre 0 y 9.999: ");
		num=teclado.nextInt();
		teclado.close();
		
		if(num<10){ //si tiene una cifra, ya lo considero como capicua
			System.out.println("Si es capicua");
		}else if(num<100){ //si tiene dos cifras, deberían ser iguales
			u = num % 10;
			d = num / 10;
			if(u==d){
				System.out.println("Si es capicua");
			}else{
				System.out.println("No es capicua");
			}
		}else if(num<1000){//si tiene tres cifras, compruebo si las unidades y las centenas son iguales
			u = num % 10;
			d = (num%100)/10;
			c = num / 100;
			if(u==c){
				System.out.println("Si es capicua");
			}else{
				System.out.println("No es capicua");
			}
		}else if(num<10000){ //si tiene cuatro cifras, deben coincidir la primera y la ultima, y la segunda y tercera
			u = num % 10;
			d = (num%100)/10;
			c = (num%1000)/100;
			um =num / 1000;
			if(u==um && d==c){
				System.out.println("Si es capicua");
			}else{
				System.out.println("No es capicua");
			}
		}
		

	}

}

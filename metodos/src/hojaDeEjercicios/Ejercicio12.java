package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	/*
	 * Escribe un método recursivo Fibonacci() que calcule el valor de la serie para un
		valor dado, siendo:
		F(1)=0
		F(2)=1
		F(n)=F(n-1)+F(n-2), para n>=3
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Que numero de la serie de Fibonacci quieres?: ");
		int a = teclado.nextInt();
		System.out.println(fibonacci(a));
	}

	
	public static long fibonacci(int n) {
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}
	
	
}

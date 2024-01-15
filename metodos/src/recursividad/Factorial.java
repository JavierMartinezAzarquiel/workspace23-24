package recursividad;

import java.util.Iterator;

public class Factorial {

	public static void main(String[] args) {
		
		System.out.println( factorial(5) );

	}

	
	//método iterativo que calcula el factorial de un número
//	public static long factorial(int numero) {
//		long resultado = 1;
//		
//		for (int i = 1 ; i <= numero; i++) {
//			resultado *= i;
//		}
//		
//		return resultado;
//	}
	
	//método recursivo
	public static long factorial(int numero) {
		//Filosofía de trabajo, si es facil lo resuelvo, pero si se complica
		//pido ayuda
		if (numero == 1) { //Esto es facil, retorno el resultado
			return 1;
		} else {
			return numero * factorial(numero-1);
		}
	}
	
}

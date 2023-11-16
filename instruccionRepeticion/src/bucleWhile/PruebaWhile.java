package bucleWhile;

import java.util.Scanner;

public class PruebaWhile {

	public static void main(String[] args) {
		/*
		 *    Bucle mientras
		 *    
		 *    while(condicion){
		 *       instrucciones a repetir;
		 *    }
		 *    
		 *    
		 *    Bucle hacer-mientras
		 *    
		 *    
		 *    do{
		 *    	 instrucciones a repetir;
		 *    }while(condicion);
		 */
		
		//Pedir números hasta que tecleemos el 0
		
//		Scanner teclado = new Scanner(System.in);
//		int numero = 1;
//		
//		while (numero != 0) {
//			System.out.print("Teclea un número: ");
//			numero = teclado.nextInt();
//		}
		
		
		//usando un do while
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
		} while (numero != 0);
		
		
	}

}









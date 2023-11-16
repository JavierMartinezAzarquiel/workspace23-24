package pruebas;

import java.util.Scanner;

public class ProbarConversiones {

	public static void main(String[] args) {
		// Convertir unos datos en otros
		
		int a = 1234;
		String texto;
		
		//convertir el entero en String
		texto = String.valueOf(a);
		
		
		//convertir un texto a número
		texto = "542";

		a = Integer.parseInt(texto); //convertimos las letras en un número entero
		//  Double.parseDouble(texto);
		//  Float.parseDouble(texto);
		//  Long.parseLong(texto);
		
		//averiguar las cifras que tiene un número
		System.out.println("Cifras:" +  String.valueOf(a).length()   );
		
		//Pedir un número de 4 cifras, lo divido en dos trozos y lo sumo
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un número: ");
		int numero = teclado.nextInt();
		
		//Troceo la frase
		String trozo1 = String.valueOf(numero).substring(0, 2);
		String trozo2 = String.valueOf(numero).substring(2);
		
		//convierto cada trozo en un numero
		int n1 = Integer.parseInt(trozo1); 
		int n2 = Integer.parseInt(trozo2); 
		
		//los sumo
		System.out.println("Suma: " + (n1+n2) );
	}

}
















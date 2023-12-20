package pruebaArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class GuardarNumeros {

	public static void main(String[] args) {
		/*
		 * Pedir por teclado números hasta que pongan el 0
		 * y los vamos a ir guardando en un ArrayList
		 * sin repetir los números
		 */
		
		//preparar el ArrayList para guardar números
		ArrayList<Integer> listaDeNumeros = new ArrayList<Integer>();

		Scanner teclado = new Scanner(System.in);
		int numero;
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			if ( ! listaDeNumeros.contains(numero)) {
				listaDeNumeros.add(numero);
			}
			
		} while (numero != 0);
		
		//quitar el cero
		listaDeNumeros.remove( listaDeNumeros.size() - 1);
//		listaDeNumeros.remove( listaDeNumeros.indexOf(0) );
//		listaDeNumeros.remove( new Integer(0) );
//		listaDeNumeros.remove( Integer.valueOf(0) );
		
		System.out.println(listaDeNumeros);
		
	}

}

package bucleWhile;

import java.util.Scanner;

public class MediaDeVariosNumeros {

	public static void main(String[] args) {
		// Calcular la media de los números que tecleemos hasta poner un 0
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		int suma = 0; //acumulador
		int contador = 0; //contador de los números que vamos sumando
		
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			suma += numero; //sumo el número
			contador++; //cuento un número mas
		} while (numero != 0);

		System.out.println("La media es: " + suma / (contador-1) );

	}

}









package bucleFor;

import java.util.Scanner;

public class TablaElegidaUsuario {

	public static void main(String[] args) {
		// Mostramos la tabla de multiplicar que nos pidan
		
		Scanner teclado = new Scanner(System.in);

		int numero;
		
		System.out.print("¿Que tabla quieres?: ");
		numero = teclado.nextInt();
		teclado.close();
		
		System.out.println("Tabla del " + numero);
		for (int i = 0; i <= 10; i++) {
			System.out.println(numero + " x " + i + " = " + numero*i);
		}
	}

}

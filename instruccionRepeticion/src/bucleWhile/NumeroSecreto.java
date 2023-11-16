package bucleWhile;

import java.util.Scanner;

public class NumeroSecreto {

	public static void main(String[] args) {
		// Pedir un número hasta que adivinemos un número secreto
		
		int secreto = (int) (Math.random()*100) ;  //número secreto
		int numero, intentos = 0;
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Teclea un número: ");
			numero = teclado.nextInt();
			//cuento un intento mas
			intentos++;
			//dar ayuda si hemos fallado
			if(numero < secreto) {
				System.out.println("Mayor");
			}else if (numero > secreto) {
				System.out.println("Menor");
			}
		} while (numero != secreto && intentos != 10);

		if (numero == secreto) {
			System.out.println("Enhorabuena!!!");
			System.out.println("Has necesitado " + intentos + " intentos");
		} else {
			System.out.println("Eres un matao!!!");
		}
		
	}

}

package recursividad;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		int base, exponente;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Base: ");
		base = teclado.nextInt();
		System.out.print("Exponente: ");
		exponente = teclado.nextInt();

		System.out.println("Potencia: " + potencia(base,exponente) );
	}

	//método recursivo para calcular la potencia
	public static long potencia(int base, int exponente) {
		if (exponente == 0) { //si es facil, lo resuelvo
			return 1;
		} else { //sino, hago un poco y el resto que lo haga otro
			return base * potencia(base, exponente-1);
		}
	}
}

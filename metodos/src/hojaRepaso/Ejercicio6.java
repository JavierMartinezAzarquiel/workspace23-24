package hojaRepaso;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int[] cartas = new int[40];

		//rellenar el array de cartas
		for (int i = 0; i < cartas.length; i++) {
			cartas[i]= i%10 +1;
		}

		//mostrar baraja
		System.out.println(Arrays.toString(cartas));

		//barajar cartas
		barajar(cartas);

		//mostrar baraja
		System.out.println(Arrays.toString(cartas));
		
		//jugar
		jugar(cartas);
	}


	public static void barajar(int[] cartas) {
		int posicion1,posicion2,aux;

		for (int i = 1; i <=1000 ; i++) {
			posicion1 = (int)(Math.random()*40);
			posicion2 = (int)(Math.random()*40);
			aux = cartas[posicion1];
			cartas[posicion1] = cartas[posicion2];
			cartas[posicion2] = aux;
		}
	}
	
	public static void jugar(int[] cartas) {
		Scanner teclado = new Scanner(System.in);
		double puntos=0;
		int i=0;
		System.out.println("\n Comienza el juego...");
		while(puntos<7.5) {
			System.out.println("Ha salido un "+cartas[i]);
			if(cartas[i]>=8 && cartas[i]<=10) {
				puntos += 0.5;
			}else {
				puntos += cartas[i];
			}
			System.out.println("Tienes "+puntos+" puntos");
			i++;
			teclado.nextLine();
		}
		
		if(puntos == 7.5) {
			System.out.println("Ganaste !!!!");
		}else {
			System.out.println("Has perdido :(");
		}
	}
}

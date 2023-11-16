package simpleYDoble;

import java.util.Scanner;

public class DiaDeLaSemana {

	public static void main(String[] args) {
		// Pedir un número del 1 al 7 y vamos a imprimir el nombre del dia de la semana

		int numero;
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		//Solución clásica, pero para volverte loco
		if (numero == 1) {
			System.out.println("Lunes");
		} else {
			if (numero == 2) {
				System.out.println("Martes");
			} else {
				if (numero == 3) {
					System.out.println("Miercoles");
				} else {
					if (numero == 4) {
						System.out.println("Jueves");
					} else {
						if (numero == 5) {
							System.out.println("Viernes");
						} else {
							if (numero == 6) {
								System.out.println("Sábado");
							} else {
								if (numero == 7) {
									System.out.println("Domingo");
								} else {
									System.out.println("Número incorrecto");
								}
							}
						}
					}
				}
			}
		}
		
		//Otra solución mas sencilla pero no es eficiente
		if (numero == 1) { System.out.println("Lunes");	}
		if (numero == 2) { System.out.println("Martes");	}
		if (numero == 3) { System.out.println("Miercoles");	}
		if (numero == 4) { System.out.println("Jueves");	}
		if (numero == 5) { System.out.println("Viernes");	}
		if (numero == 6) { System.out.println("Sábado");	}
		if (numero == 7) { System.out.println("Domingo");	}
		if (numero<1 || numero > 7) { System.out.println("Número incorrecto");	}
		
		//Solución mas eficiente
		if (numero == 1) { System.out.println("Lunes");	}
		else if (numero == 2) { System.out.println("Martes");	}
		else if (numero == 3) { System.out.println("Miercoles");	}
		else if (numero == 4) { System.out.println("Jueves");	}
		else if (numero == 5) { System.out.println("Viernes");	}
		else if (numero == 6) { System.out.println("Sábado");	}
		else if (numero == 7) { System.out.println("Domingo");	}
		else { System.out.println("Número incorrecto");	}
	}

}

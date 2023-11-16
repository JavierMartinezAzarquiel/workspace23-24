package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);

		int h,m,s; // hora, minutos y segundos
		System.out.print("Introduzca hora: ");
		h=teclado.nextInt();
		System.out.print("Introduzca minutos: ");
		m=teclado.nextInt();
		System.out.print("Introduzca segundos: ");
		s=teclado.nextInt();
		teclado.close();
		// suponemos que la hora introducida es correcta
		// incrementamos los segundos
		s++;
		// si los segundos superan 59, los reiniciamos a 0 e incrementamos los minutos
		if (s == 60){
			s = 0;
			m++;
			// si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
			if (m == 60){
				m = 0;
				h++;
				// si la hora supera 23, la reiniciamos a 0
				if (h==24)
					h=0;
			}
		}
		System.out.printf ("Hora: %02d:%02d:%02d",h,m,s);
	

	}

}

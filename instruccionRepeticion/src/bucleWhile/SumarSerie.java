package bucleWhile;

import java.util.Scanner;

public class SumarSerie {

	public static void main(String[] args) {
		/*
		 *  Programa que sume la serie 1 + 1/2 + 1/3 + 1/4 + ...
		 *  
		 *  Por teclado pediremos la suma total que quiero conseguir
		 *  y nos dirá cuando termine, cuantos terminos ha tenido que sumar
		 */
		Scanner teclado = new Scanner(System.in);
		
		double suma = 0, sumaQueTengoQueConseguir;
		long contador = 1;
		
		System.out.print("¿Cuanto tengo que sumar en total?: ");
		sumaQueTengoQueConseguir = teclado.nextDouble();
		
		while (suma < sumaQueTengoQueConseguir) { //mientras no hay conseguido la suma total
			//sumar otro término
			suma += 1/(double)contador;
			//incrementar el contador
			contador++;
		}
		
		System.out.println("He necesitado sumar "+ (contador-1) + " términos");
	}

}








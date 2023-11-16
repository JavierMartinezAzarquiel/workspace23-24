package primerosProgramas;

public class Operadores {

	public static void main(String[] args) {
		/*
		 * Probando operadores
		 */
		
		int a = 7, b = 5;
		
		System.out.println("Suma: " + a + b );

		System.out.println("División: " + a / b );
		
		System.out.println("Resto: " + a % b );
		
		//operador incremento
		a++;
		++a;
		System.out.println( a );
		
		//operador decremento
		b--;
		
		System.out.println( b );
		
		System.out.println( a + ++b );
		
		System.out.println( a == b );
		
		//Operadores relacionales y condicionales
		
		boolean hayToner, hayPapel , resultado;
		
		hayToner = true;
		hayPapel = false;
		
		resultado = hayToner && hayPapel; 
		
		System.out.println("Podemos imprimir: " + resultado );
		
		boolean familiaNumerosa = false , bajosIngresos= false, beca;
		
		beca = familiaNumerosa || bajosIngresos;
		
		System.out.println("Beca: " + beca);
	}

}








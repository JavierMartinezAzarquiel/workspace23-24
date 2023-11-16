package pruebas;

import java.util.StringTokenizer;

public class PruebaTokenizer {

	public static void main(String[] args) {
		// Probando la clase StringTokenizer

		String frase = "Hola a todos.Buenos dias por la mañana.";

		//creamos un Objeto StringTokenizer
		//		StringTokenizer st = new StringTokenizer(frase); //por defecto solo mira los espacios
		StringTokenizer st = new StringTokenizer(frase, "., :;");
		//Le preguntamos cuantos trozos tiene la frase
		System.out.println("La frase tiene " + st.countTokens() + " palabras");

		//pedir un token
		System.out.println("El primer trozo: " + st.nextToken());
		//pedir otro token
		System.out.println("El siguiente trozo: " + st.nextToken());
		
		//cuantos trozos tiene ahora
		System.out.println("La frase tiene " + st.countTokens() + " palabras");
		
		//pedir todos los tokens que le queden
		while ( st.hasMoreTokens() ) { //mientras te queden tokens, te pediré otro
			System.out.println( st.nextToken());
		}
		
		//pedir otro token fallará porque ya no le quedan
		System.out.println("El siguiente trozo: " + st.nextToken());
	}

}







package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * Igual al anterior, pero sumando los números completos.
				Introduciendo: “15 de Noviembre de 2022”
				Da como salida: 2037
		 */

		Scanner teclado = new Scanner(System.in);
		
		String frase;
		int suma = 0;
			
		System.out.print("Teclea una frase: ");
		frase = teclado.nextLine();
		
		//preparar un StringTokenizer
		StringTokenizer st = new StringTokenizer(frase);
		
		//bucle para ir pidiendo todos los tokens que ha generado
		while ( st.hasMoreTokens() ) {
			//pedir un trozo
			String trozo = st.nextToken();
			//comprobar que todas las letras del trozo son números
			
			boolean hayLetras = false; //flag para avisar de que no podemos convertir
			for (int i = 0; i < trozo.length(); i++) {
				if ( !Character.isDigit(trozo.charAt(i)) ) {
					hayLetras = true; //si la letra no es dígito, subo la bandera
				}
			}
			//si todas las letras son números, convierto el trozo a número y lo añado a la suma
			if (!hayLetras) {
				suma += Integer.parseInt(trozo);
			}
			
		}
		
		System.out.println("Suma total: " + suma);
	}

}










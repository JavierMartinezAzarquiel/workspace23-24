package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaExcepcionesChecked2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// Vamos a probar excepciones CHECKED
		// Estas obligaba a tratarlar si o si
		
		//usamos el teclado como antiguamente, sin la clase Scanner
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Teclea un numero: ");
		int a = 0;
		
		a = Integer.parseInt(teclado.readLine());
				
		System.out.println("El valor tecleado es: " + a);

	}

}

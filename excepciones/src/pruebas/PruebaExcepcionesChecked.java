package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaExcepcionesChecked {

	public static void main(String[] args) {
		// Vamos a probar excepciones CHECKED
		// Estas obligaba a tratarlar si o si
		
		//usamos el teclado como antiguamente, sin la clase Scanner
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Teclea un numero: ");
		int a = 0;
		
		try {
			a = Integer.parseInt(teclado.readLine());
		} catch (NumberFormatException | IOException e) {
			System.out.println("Error en el teclado");
		}
		
//		try {
//			a = Integer.parseInt(teclado.readLine());
//		} catch (NumberFormatException e) {
//			System.out.println("El formato del número no es correcto");
//		} catch (IOException e) {
//			System.out.println("Error en el teclado");
//		}
		
		System.out.println("El valor tecleado es: " + a);

	}

}

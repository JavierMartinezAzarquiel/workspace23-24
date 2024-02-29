package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaExcepcionesChecked3 {

	public static void main(String[] args) {
		// Vamos a probar excepciones CHECKED
		// Estas obligaba a tratarlar si o si

		int numero=0;

		try {
			numero = leerDatoEntero();
		} catch (NumberFormatException e) {
			System.out.println("El formato del número no es correcto");
		} catch (IOException e) {
			System.out.println("Error en el teclado");
		}
		System.out.println("El valor tecleado es: " + numero);

	}


	//Lo ideal es que los método no se encarguen de sus excepciones
	//y lo haga solo un método de manera centralizada
	public static int leerDatoEntero() throws NumberFormatException, IOException {
		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Teclea un numero: ");
		int a = 0;

		a = Integer.parseInt(teclado.readLine());

		return a;
	}



	//método para leer un dato entero del teclado
	//Esto es una mierda. La idea es centralizar el tratamiento de las excepciones
	//	public static int leerDatoEntero() {
	//		BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	//
	//		System.out.print("Teclea un numero: ");
	//		int a = 0;
	//
	//		try {
	//			a = Integer.parseInt(teclado.readLine());
	//		} catch (NumberFormatException e) {
	//			System.out.println("El formato del número no es correcto");
	//		} catch (IOException e) {
	//			System.out.println("Error en el teclado");
	//		}
	//		
	//		return a;
	//	}


}

package pruebas;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class RecuperarUnNumero {

	public static void main(String[] args) {
		// Haremos una lectura del numero entero guardado en el archivo
		
		//Tengo que crear el objeto File
		File archivo = new File("numero.dat");

		
		try {
			//crear el Stream
			DataInputStream stream = new DataInputStream(new FileInputStream(archivo));
		
			//leo el dato guardado en el archivo
			int dato = stream.readInt();
			
			//cerrar el Stream
			stream.close();
			
			System.out.println("El dato que contiene el archivo es: " + dato);
		
		} catch (FileNotFoundException e) {
			System.out.println("No encuentro el archivo");
		} catch (IOException e) {
			System.out.println("Error de lectura");
		}
	}

}

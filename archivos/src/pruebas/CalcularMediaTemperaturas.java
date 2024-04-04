package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CalcularMediaTemperaturas {

	public static void main(String[] args) {
		// Programa que calcula la media de temperatura del archivo
		
		File archivo = new File("temperaturas.dat");
		double media=0, suma=0;
		int contador=0;

		DataInputStream stream = null; //declaramos el stream fuera del try
		try {
			stream = new DataInputStream(new FileInputStream(archivo));

			while(true) {
				suma += stream.readDouble();
				contador++;
			}

			
					
		} catch (EOFException e) { 
			//cuando se acaba el archivo, es momento de calcular la media
			media = suma / contador;
			System.out.println("La media de temperatura es: " + media);
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error leyendo temperaturas");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}

		
	}

}

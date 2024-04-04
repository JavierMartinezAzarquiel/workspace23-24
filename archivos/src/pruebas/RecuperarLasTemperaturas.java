package pruebas;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class RecuperarLasTemperaturas {

	public static void main(String[] args) {
		// Imprimimos en pantalla las temperaturas del mes
		
		File archivo = new File("temperaturas.dat");
		
		DataInputStream stream = null; //declaramos el stream fuera del try
		try {
			stream = new DataInputStream(new FileInputStream(archivo));
		
			while(true) {
				System.out.println(stream.readDouble());
			}
					
		} catch (EOFException e) {
			//esta exception salta cuando se acaba el archivo
			//muchas veces no habrá que hacer nada aquí
			System.out.println("Ya hemos terminado, no quedan mas temperaturas");
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

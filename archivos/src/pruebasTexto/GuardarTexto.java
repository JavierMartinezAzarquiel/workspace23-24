package pruebasTexto;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class GuardarTexto {

	public static void main(String[] args) {
		// Guardamos varias lineas en un archivo de texto plano
		
		//objeto File
		File archivo = new File("texto.txt");

		//Stream
		BufferedWriter stream = null;
		
		try {
			//creamos el stream
			stream =new BufferedWriter( new FileWriter(archivo) );
			
			stream.write("Hola");
			stream.newLine();
			stream.write("Buenos dias");
			stream.newLine();
			stream.write("Adios");
			
		} catch (IOException e) {
			System.out.println("Error escribiendo en el archivo");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el archivo");
			}
		}
		
	}

}

package pruebasTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RecuperarTexto {

	public static void main(String[] args) {
		// recupero el texto del archivo

		//objeto File
		File archivo = new File("texto.txt");

		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivo) );

			String linea;
			while( (linea = stream.readLine()) != null) {
				System.out.println(linea); 
			}
			
//			String linea = stream.readLine(); //pido una primera linea
//			while(linea != null){ //mientras no sea null
//				System.out.println(linea); //la trabajo
//				linea = stream.readLine(); //pido una nueva linea
//			}
			

		} catch (IOException e) {
			System.out.println("Error leyendo en el archivo");
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

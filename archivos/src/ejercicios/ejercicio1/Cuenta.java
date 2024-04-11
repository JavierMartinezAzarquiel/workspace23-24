package ejercicios.ejercicio1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Cuenta {

	public static void main(String[] args) {
		File archivo = new File(".\\src\\ejercicios\\ejercicio1\\quijote.txt");

		System.out.println("El archivo contiene " + cuentaPalabras(archivo) + " palabras");
	}


	public static int cuentaPalabras(File archivo) {
		int contadorPalabras = 0; 
		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivo) );

			String linea;
			while( (linea = stream.readLine()) != null) {
				//cuento las palabras que tiene la linea
//				StringTokenizer st = new StringTokenizer(linea);
//				contadorPalabras += st.countTokens();
				contadorPalabras += new StringTokenizer(linea).countTokens();
			}

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
		return contadorPalabras;
	}
}

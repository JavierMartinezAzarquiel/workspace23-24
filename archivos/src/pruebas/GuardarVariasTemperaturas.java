package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarVariasTemperaturas {

	public static void main(String[] args) {
		// Guardamos en un archivo 30 temperaturas
		
		File archivo = new File("temperaturas.dat");
		
		 
		try {
			DataOutputStream stream = new DataOutputStream(new FileOutputStream(archivo));
		
			for (int i = 1; i <= 30; i++) {
				stream.writeDouble( Math.random()*20 + 10 );
			}
			
			stream.close(); 
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Error guardando temperaturas");
		}
		
	}

}

package pruebas;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class GuardarUnNumero {

	public static void main(String[] args) {
		// Guardamos un numero entero en un archivo
		int valor = 123456;
		
		//Tengo que crear el objeto File
		File archivo = new File("numero.dat");

		try {
			//ahora necesitamos un Stream
			FileOutputStream stream = new FileOutputStream(archivo);
			
			//mejorar el Stream para que me permita enviar los datos mas comodo
			DataOutputStream streamMejorado = new DataOutputStream(stream);
			
			//enviar el dato hacia el archivo
			streamMejorado.writeInt(valor);
			
			//cerrar el stream. Cerrando el último, se cierra todo
			streamMejorado.close();
			
			System.out.println("Dato guardado correctamente");
			
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			System.out.println("Error escribiendo en el archivo");
		}
	}

}

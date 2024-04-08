package pruebasConObjetos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RecuperarUnContacto {

	public static void main(String[] args) {
		File archivo = new File("contacto.obj");
		
		
		ObjectInputStream stream = null;

		
		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));
			
			//recuperar el objeto
			Contacto c = (Contacto) stream.readObject();
			
			System.out.println("Hola soy " + c.getNombre());
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de lectura");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: El archivo no contiene objetos Contacto");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
	}

}

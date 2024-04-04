package pruebasConObjetos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class GuardarUnContacto {

	public static void main(String[] args) {
		Contacto c = new Contacto("Javier", 665746433);
		
		File archivo = new File("contacto.obj");
		
		
		ObjectOutputStream stream = null;
		
		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivo));
			
			stream.writeObject(c);
			
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de escritura");
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}

	}

}

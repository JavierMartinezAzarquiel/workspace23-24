package pruebas;

import java.io.File;
import java.text.DateFormat;

public class PruebaObjetoFile {

	public static void main(String[] args) {
		//Probar como funciona el objeto File
		
		File archivo = new File("C:\\Windows\\notepad.exe");
		
		if(archivo.exists()) {
			System.out.println("El archivo es real, existe");
			System.out.println("Ruta: " + archivo.getAbsolutePath());
			System.out.println("Tamaño: " + archivo.length());
			System.out.println("Fecha modificacion: " + DateFormat.getInstance().format(archivo.lastModified()) );
			System.out.println("Permiso de lectura: " + archivo.canRead());
			System.out.println("Permiso de escritura: " + archivo.canWrite());
		}else {
			System.out.println("El archivo no existe");
		}
		

	}

}

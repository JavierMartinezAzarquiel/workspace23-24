package ejercicios.examen2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CrearArchivoDeCompras {

	
	public static void main(String[] args) throws IOException 	{
		
		File archivo=new File("compras.obj");
		
		ObjectOutputStream salida=new ObjectOutputStream(new FileOutputStream(archivo));
		salida.writeObject(new Compra("Historia", 500));
		salida.writeObject(new Compra("Ciencias", 400));
		salida.writeObject(new Compra("Idiomas", 150));
		salida.writeObject(new Compra("Historia", 45));
		salida.writeObject(new Compra("Idiomas", 200));
		salida.writeObject(new Compra("Musica", 180));
		salida.writeObject(new Compra("Historia", 20));
		salida.close();

	}

}

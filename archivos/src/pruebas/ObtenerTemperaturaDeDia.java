package pruebas;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ObtenerTemperaturaDeDia {

	public static void main(String[] args) {
		// Pedimos por teclado el dia que quiere consultar
		// y recuperamos esa temperatura concreta
		
		Scanner teclado = new Scanner(System.in);
		System.out.print("¿Que dia quieres consultar?: ");
		int dia = teclado.nextInt();
		
		File archivo = new File("temperaturas.dat");
		
		DataInputStream stream = null; //declaramos el stream fuera del try
		try {
			stream = new DataInputStream(new FileInputStream(archivo));

			for (int i = 1; i < dia; i++) { //consumo todos los dias anteriores
				stream.readDouble();
			}
			
			//ahora consumo el dia que me han pedido
			System.out.println("Dia "+ dia + ": " + stream.readDouble());
					
		} catch (EOFException e) { 
			System.out.println("No tengo registro para ese dia");
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

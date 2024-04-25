package ejercicios.taller;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorArchivoVehiculos {

	private File archivo;

	public GestorArchivoVehiculos(File archivo) {
		super();
		this.archivo = archivo;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	//obtener todos los objetos vehiculo
	public ArrayList<Vehiculo> getVehiculos(){
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

		ObjectInputStream stream = null;


		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));

			while(true) {
				Vehiculo v = (Vehiculo) stream.readObject();
				lista.add(v);
			}


		} catch (EOFException e) {
			//cuando salte esta excepción el archivo se ha acabado
			return lista;	
		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de lectura");
		} catch (ClassNotFoundException e) {
			System.out.println("Error: El archivo no contiene objetos Vehiculo");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el stream");
			}
		}
		return null;
	}

	//guardar objetos vehiculo
	public void setVehiculos(ArrayList<Vehiculo> lista) {
		ObjectOutputStream stream = null;

		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivo));

			for (Vehiculo vehiculo : lista) {
				stream.writeObject(vehiculo);
			}
			

		} catch (FileNotFoundException e) {
			System.out.println("Archivo no encontrado");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Error de escritura");
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

	//añadir un objeto vehiculo mas
	public void addVehiculo(Vehiculo nuevo) {
		ArrayList<Vehiculo> lista = this.getVehiculos();
		lista.add(nuevo);
		this.setVehiculos(lista);
	}


}

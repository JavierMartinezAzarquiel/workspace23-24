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

public class GestorArchivoIntervenciones {
	private File archivo;

	public GestorArchivoIntervenciones(File archivo) {
		super();
		this.archivo = archivo;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	//obtener todos los objetos Intervencion
	public ArrayList<Intervencion> getIntervenciones(){
		ArrayList<Intervencion> lista = new ArrayList<Intervencion>();

		ObjectInputStream stream = null;


		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));

			while(true) {
				Intervencion v = (Intervencion) stream.readObject();
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
			System.out.println("Error: El archivo no contiene objetos Intervencion");
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

	//guardar objetos Intervencion
	public void setIntervenciones(ArrayList<Intervencion> lista) {
		ObjectOutputStream stream = null;

		try {
			stream = new ObjectOutputStream(new FileOutputStream(archivo));

			for (Intervencion Intervencion : lista) {
				stream.writeObject(Intervencion);
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

	//añadir un objeto Intervencion mas
	public void addIntervencion(Intervencion nuevo) {
		ArrayList<Intervencion> lista = this.getIntervenciones();
		lista.add(nuevo);
		this.setIntervenciones(lista);
	}
	
	//obtener las intervenciones de una matrícula concreta
	public ArrayList<Intervencion> getIntervenciones(String matricula){
		ArrayList<Intervencion> lista = new ArrayList<Intervencion>();

		ObjectInputStream stream = null;


		try {
			stream = new ObjectInputStream(new FileInputStream(archivo));

			while(true) {
				Intervencion i = (Intervencion) stream.readObject();
				if(i.getMatricula().equals(matricula)) {
					lista.add(i);
				}
				
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
			System.out.println("Error: El archivo no contiene objetos Intervencion");
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

}

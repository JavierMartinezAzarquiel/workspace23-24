package blocDeNotas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GestorArchivoTexto {
	//Esta clase se encargará de toda las gestión del archivo de texto
	//debe saber guardar, recuperar texto plano

	private File archivo; //atributo para guardar el archivo que debo gestionar

	public GestorArchivoTexto(File archivo) {
		super();
		this.archivo = archivo;
	}

	public File getArchivo() {
		return archivo;
	}

	public void setArchivo(File archivo) {
		this.archivo = archivo;
	}

	//método para recuperar el texto del archivo
	public ArrayList<String> getTexto(){
		ArrayList<String> listaDeLineas = new ArrayList<String>();
		//Stream
		BufferedReader stream = null;

		try {
			//creamos el stream
			stream =new BufferedReader( new FileReader(archivo) );

			String linea;
			while( (linea = stream.readLine()) != null) {
				listaDeLineas.add(linea);
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
		return listaDeLineas;
	}

	//método para guardar texto en el archivo
	public void setTexto( String texto ) {
		//Stream
		BufferedWriter stream = null;

		try {
			//creamos el stream
			stream =new BufferedWriter( new FileWriter(archivo) );
			
			stream.write(texto);  //escribo el texto de una sola vez
			
		} catch (IOException e) {
			System.out.println("Error escribiendo en el archivo");
		} finally {
			try {
				if(stream != null) {
					stream.close();
				}
			} catch (IOException e) {
				System.out.println("Error cerrando el archivo");
			}
		}
	}
}



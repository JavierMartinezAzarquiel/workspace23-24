package ejercicios.hotel;


import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestorArchivoHabitaciones{
	private  File archivoHabitaciones=new File("habitaciones.obj");


	public GestorArchivoHabitaciones(){	
		if(!archivoHabitaciones.exists()){
			try {
				new ObjectOutputStream(new FileOutputStream(archivoHabitaciones)).close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public ArrayList<Habitacion> get(){
		ArrayList<Habitacion> lista=new ArrayList<Habitacion>();

		ObjectInputStream ois=null;

		try{
			ois=new ObjectInputStream(new FileInputStream(archivoHabitaciones));
			while(true){
				Habitacion habitacion=(Habitacion)ois.readObject();
				lista.add(habitacion);
			}

		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son habitaciones");
		}catch(IOException e){
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}finally{
			//cierre de la via de comunicacion
			if(ois!=null) {
				try{
					ois.close();
				}catch(IOException e){}
			}
		}

		return lista;
	}

	public ArrayList<Habitacion> getHabitacionesLibres(){
		ArrayList<Habitacion> lista=new ArrayList<Habitacion>();

		ObjectInputStream ois=null;

		try{
			ois=new ObjectInputStream(new FileInputStream(archivoHabitaciones));
			while(true){
				Habitacion habitacion=(Habitacion)ois.readObject();
				if(habitacion.getDni()==null)
					lista.add(habitacion);
			}

		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son habitaciones");
		}catch(IOException e){
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}finally{
			//cierre de la via de comunicacion
			if(ois!=null) {
				try{
					ois.close();
				}catch(IOException e){}
			}
		}

		return lista;
	}

	public void desalojar(int numero){
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		ArrayList<Habitacion> lista = new ArrayList<Habitacion>();
		try{
			ois=new ObjectInputStream(new FileInputStream(archivoHabitaciones));
			while(true){
				Habitacion h=(Habitacion)ois.readObject();
				if(h.getNumero()==numero){
					h.setDni(null);
				}
				lista.add(h);
			}
			
		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son habitaciones");
		}catch(IOException e){
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}finally{
			//cierre de la via de comunicacion
			if(ois!=null) {
				try{
					ois.close();
				}catch(IOException e){}
			}
		}
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream(archivoHabitaciones));
			for (Habitacion habitacion : lista) {
				oos.writeObject(habitacion);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}
		finally{
			//cierre de la via de comunicacion
			if(oos!=null) {
				try{
					oos.close();
				}catch(IOException e){}
			}
		}

	}

	public void alojar(int numero,String dni){
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		ArrayList<Habitacion> lista = new ArrayList<Habitacion>();
		try{
			ois=new ObjectInputStream(new FileInputStream(archivoHabitaciones));
			while(true){
				Habitacion h=(Habitacion)ois.readObject();
				if(h.getNumero()==numero){
					h.setDni(dni);
					h.setDisponible(false);
				}
				lista.add(h);
			}
			
		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son habitaciones");
		}catch(IOException e){
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}finally{
			//cierre de la via de comunicacion
			if(ois!=null) {
				try{
					ois.close();
				}catch(IOException e){}
			}
		}
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream(archivoHabitaciones));
			for (Habitacion habitacion : lista) {
				oos.writeObject(habitacion);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}
		finally{
			//cierre de la via de comunicacion
			if(oos!=null) {
				try{
					oos.close();
				}catch(IOException e){}
			}
		}

	}

	public void setDisponible(int numero,boolean estado){
		ObjectInputStream ois=null;
		ObjectOutputStream oos=null;
		ArrayList<Habitacion> lista = new ArrayList<Habitacion>();
		try{
			ois=new ObjectInputStream(new FileInputStream(archivoHabitaciones));
			while(true){
				Habitacion h=(Habitacion)ois.readObject();
				if(h.getNumero()==numero){
					h.setDisponible(estado);
				}
				lista.add(h);
			}
			
		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son habitaciones");
		}catch(IOException e){
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}finally{
			//cierre de la via de comunicacion
			if(ois!=null) {
				try{
					ois.close();
				}catch(IOException e){}
			}
		}
		
		try {
			oos=new ObjectOutputStream(new FileOutputStream(archivoHabitaciones));
			for (Habitacion habitacion : lista) {
				oos.writeObject(habitacion);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error: archivo no encontrado");
		} catch (IOException e) {
			System.out.println("Error en el archivo de habitaciones:"+e.getMessage());
		}
		finally{
			//cierre de la via de comunicacion
			if(oos!=null) {
				try{
					oos.close();
				}catch(IOException e){}
			}
		}

		
	}
}

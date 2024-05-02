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

public class GestorArchivoClientes {

	private  File archivoClientes=new File("clientes.obj");
	
	public GestorArchivoClientes(){	
		if(!archivoClientes.exists()){
			try {
				new ObjectOutputStream(new FileOutputStream(archivoClientes)).close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public void add(Cliente c){
		ObjectOutputStream oos=null;
		ArrayList<Cliente> lista=this.get();
		lista.add(c);
		try{
			oos=new ObjectOutputStream(new FileOutputStream(archivoClientes));
			for (Cliente cliente : lista) {
				oos.writeObject( cliente );
			}

		}catch(IOException e){
			System.out.println("Error en el archivo de clientes:"+e.getMessage());
			e.printStackTrace();
		}finally	{
			//cierre de la via de comunicacion
			if(oos!=null) {
				try{
					oos.close();
				}catch(IOException e){}
			}
		}

	}


	public Cliente get(String dni){
		ObjectInputStream ois=null;

		try{
			ois=new ObjectInputStream(new FileInputStream(archivoClientes));
			while(true){
				Cliente cliente=(Cliente)ois.readObject();
				if(cliente.getDni().equals(dni)){
					return cliente;
				}
			}

		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son clientes");
		}catch(IOException e){
			System.out.println("Error en el archivo de clientes:"+e.getMessage());
		}finally{
			//cierre de la via de comunicacion
			if(ois!=null) {
				try{
					ois.close();
				}catch(IOException e){}
			}
		}
		return null;
	}

	
	public ArrayList<Cliente> get(){
		ArrayList<Cliente> lista=new ArrayList<Cliente>();
		ObjectInputStream ois=null;
		
		try{
			ois=new ObjectInputStream(new FileInputStream(archivoClientes));
			while(true){
				Cliente cliente=(Cliente)ois.readObject();
				lista.add(cliente);
			}

		}catch(EOFException e){
			
		}catch(ClassNotFoundException e){
			System.out.println("El archivo contiene objetos que no son clientes");
		}catch(IOException e){
			System.out.println("Error en el archivo de clientes:"+e.getMessage());
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
}

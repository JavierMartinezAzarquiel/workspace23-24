package clinica;

import java.util.ArrayList;

public class ListaDeEspera {

	private ArrayList<Paciente> listaDePacientes;

	
	public ListaDeEspera() {
		super();
		this.listaDePacientes = new ArrayList<Paciente>();  //creo un ArrayList en blanco
	}

	public ListaDeEspera(ArrayList<Paciente> listaDePacientes) {
		super();
		this.listaDePacientes = listaDePacientes;
	}

	public ArrayList<Paciente> getListaDePacientes() {
		return listaDePacientes;
	}

	public void setListaDePacientes(ArrayList<Paciente> listaDePacientes) {
		this.listaDePacientes = listaDePacientes;
	}

	@Override
	public String toString() {
		return "ListaDeEspera [listaDePacientes=" + listaDePacientes + "]";
	}
	
	
	
	//add paciente
	public void add(Paciente paciente) {
		this.listaDePacientes.add(paciente);
	}
	
	//delete paciente
	public void delete(Paciente paciente) {
		this.listaDePacientes.remove(paciente);
	}
		
	//atender a un paciente, retorna el paciente que mas tiempo lleva esperando y lo elimina de la lista
	public Paciente atender() {
		//sacar al paciente que está en la posición 0 de la lista
		Paciente primeroDeLaLista = this.listaDePacientes.get(0);
		//borrar ese paciente de la lista
		this.listaDePacientes.remove(0);
		return primeroDeLaLista;
//		return this.listaDePacientes.remove(0); //así se puede hacer todo en la misma linea
	}
	
	//colar a un paciente en una posicion concreta
	public boolean colar(Paciente paciente, int posicion) {
		if(posicion < 0 || posicion >= this.listaDePacientes.size()) {
			//la posición no es correcta, entonces lo añado al final
			this.add(paciente);
			return false;
		}else {
			this.listaDePacientes.add(posicion, paciente);
			return true;
		}
	}
		
	//tamaño de la lista de espera
	public int size() {
		return this.listaDePacientes.size();
	}

	
	
}



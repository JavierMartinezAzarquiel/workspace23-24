package agenda;

import java.util.ArrayList;

public class Agenda {

	//Atributos
	private ArrayList<Contacto> listaDeContactos;
	
	//constructores
	
	public Agenda() { //agenda vacía por defecto
		listaDeContactos = new ArrayList<Contacto>();
	}
						//constructor para clonar una agenda
	public Agenda(ArrayList<Contacto> listaDeContactos) {
		this.listaDeContactos = listaDeContactos;
	}
		
	//getter y setter
	public ArrayList<Contacto> getListaDeContactos() {
		return listaDeContactos;
	}
	
	public void setListaDeContactos(ArrayList<Contacto> listaDeContactos) {
		this.listaDeContactos = listaDeContactos;
	}
	
	@Override
	public String toString() {
		return "Agenda [listaDeContactos=" + listaDeContactos + "]";
	}
	
	//métodos fabricados a mano
	
	//añadir un contacto
	public void add(Contacto nuevo){
		this.listaDeContactos.add(nuevo);
	}
	
	//borrar un contacto
	public boolean delete(Contacto viejo) {
		return this.listaDeContactos.remove(viejo);
	}
	
	//borrar un contacto, si me dan su nombre
	public boolean delete(String nombreViejo) {
		for (Contacto contacto : listaDeContactos) {
			if (contacto.getNombre().equals(nombreViejo)) {
				this.delete(contacto);
				return true;
			}
		}
		return false;
	}
	
	//buscar un contacto, usando un nombre
	public Contacto get(String nombre) {
		for (Contacto contacto : listaDeContactos) {
			if (contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null; //si no he encontrado un contacto con ese nombre, retorno nada
	}
	
	//buscar un contacto, dada su posición en la lista
	public Contacto get(int posicion) {
		return listaDeContactos.get(posicion);
	}
	
	
	//actualizar un contacto
	public boolean update(String nombreAntiguo, String nombreNuevo) {
		Contacto c = this.get(nombreAntiguo);
		if(c!=null) {
			c.setNombre(nombreNuevo);
			return true;
		}else {
			return false;
		}
//		for (Contacto contacto : listaDeContactos) {
//			if (contacto.getNombre().equals(nombreAntiguo)) {
//				contacto.setNombre(nombreNuevo);
//				return true;
//			}
//		}
//		return false;
	}
	
	public void update(Contacto contactoViejo, Contacto contactoNuevo) {
		this.delete(contactoViejo);
		this.add(contactoNuevo);
	}
	
	//método longitud
	public int length() {
		return this.listaDeContactos.size();
	}
}







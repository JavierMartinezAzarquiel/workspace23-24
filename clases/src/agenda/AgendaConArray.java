package agenda;

public class AgendaConArray {
	//Atributos
	private Contacto[] contactos;

	
	public AgendaConArray() {//constructor para preparar una agenda vacía
		this.contactos = new Contacto[200];
	}
	
	public AgendaConArray(int tamaño) { //constructor que crea una agenda de tamaño personalizado
		this.contactos = new Contacto[tamaño];
	}
	
	public AgendaConArray(Contacto[] contactos) { //constructor que recibe un array ya preparado
		super();
		this.contactos = contactos;
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}
	
	//método para buscar un Contacto por Nombre
	public Contacto getContacto(String nombre) {
		for (Contacto contacto : contactos) {
			if( contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}
	
	//método para eliminar un contacto, pasando un nombre
	public boolean removeContacto(String nombre) {
		for (int i = 0; i < contactos.length; i++) {
			if(contactos[i].getNombre().equals(nombre)) {
				contactos[i] = null; //borro el contacto
				return true;
			}
		}
		return false;
	}
	
	//....  y muchos métodos mas
}







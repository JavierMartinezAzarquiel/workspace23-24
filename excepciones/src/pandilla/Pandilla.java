package pandilla;

import java.util.ArrayList;

public class Pandilla {

	private int capacidad;
	private ArrayList<Amigo> listaDeAmigos;
	
	public Pandilla(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.listaDeAmigos = new ArrayList<Amigo>();
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public ArrayList<Amigo> getListaDeAmigos() {
		return listaDeAmigos;
	}

	public void setListaDeAmigos(ArrayList<Amigo> listaDeAmigos) {
		this.listaDeAmigos = listaDeAmigos;
	}

	@Override
	public String toString() {
		return "Pandilla [capacidad=" + capacidad + ", listaDeAmigos=" + listaDeAmigos + "]";
	}
	
	//método add() que puede generar excepciones
	public void add(Amigo a) throws NoMeGustaTuNombreException, PandillaCompletaException {
		if(this.listaDeAmigos.size() == this.capacidad) {//si ya estamos al completo
			throw new PandillaCompletaException("No cabes");
		}else if(a.getNombre().toLowerCase().endsWith("s")){ //si el nombre acaba en s
			throw new NoMeGustaTuNombreException("No nos gustan las eses");
		}else {
			this.listaDeAmigos.add(a);
		}
	}
	
	
	//método remove()
	public void remove(Amigo a) {
		this.listaDeAmigos.remove(a);
	}
	
}

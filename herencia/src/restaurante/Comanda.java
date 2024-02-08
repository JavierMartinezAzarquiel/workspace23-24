package restaurante;

import java.util.ArrayList;

public class Comanda {

	private int numeroMesa;
	private int comensales;
	private ArrayList<Plato> listaPlatos;
	
	
	public Comanda(int numeroMesa, int comensales, ArrayList<Plato> listaPlatos) {
		super();
		this.numeroMesa = numeroMesa;
		this.comensales = comensales;
		this.listaPlatos = listaPlatos;
	}

	public Comanda(int numeroMesa, int comensales) {
		super();
		this.numeroMesa = numeroMesa;
		this.comensales = comensales;
		this.listaPlatos = new ArrayList<Plato>();
	}

	public int getNumeroMesa() {
		return numeroMesa;
	}

	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}

	public int getComensales() {
		return comensales;
	}

	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

	public ArrayList<Plato> getListaPlatos() {
		return listaPlatos;
	}

	public void setListaPlatos(ArrayList<Plato> listaPlatos) {
		this.listaPlatos = listaPlatos;
	}
	
	public void addPlato(Plato p) {
		this.listaPlatos.add(p);
	}
	
	public void deletePlato(Plato p) {
		this.listaPlatos.remove(p);
	}

	// toString()
	@Override
	public String toString() {
		String resultado = "Comanda\nNumero de Mesa: "+ this.numeroMesa + "\nComensales: "+ this.comensales+"\n";
		for (Plato plato : listaPlatos) {
			resultado += "\n\t" + plato.toString();
		}
		return resultado;
	}
	
	
	
	// coste()
	public float coste() {
		float total = 0;
		for (Plato plato : listaPlatos) {
			total += plato.getPrecio();
		}
		return total;
	}
	// hayDiabeticosEnLaMesa()
	public boolean hayDiabeticosEnLaMesa() {
		for (Plato plato : listaPlatos) {
			if ( plato instanceof Postre && !((Postre) plato).isAzucar() ) {
				return true;
			}
		}
		return false;
	}
	
	
	
}

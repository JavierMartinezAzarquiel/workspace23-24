package restaurante;

public class Primero extends Plato{

	protected boolean paraCompartir;

	public Primero(String nombre, float precio, boolean paraCompartir) {
		super(nombre, precio);
		this.paraCompartir = paraCompartir;
	}

	public boolean isParaCompartir() {
		return paraCompartir;
	}

	public void setParaCompartir(boolean paraCompartir) {
		this.paraCompartir = paraCompartir;
	}

	@Override
	public String toString() {
		return "Primero [nombre=" + nombre + ", precio=" + precio + ", paraCompartir=" + paraCompartir + "]";
	}
	
	
}

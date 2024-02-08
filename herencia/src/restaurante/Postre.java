package restaurante;

public class Postre extends Plato{

	protected boolean azucar;

	public Postre(String nombre, float precio, boolean azucar) {
		super(nombre, precio);
		this.azucar = azucar;
	}

	public boolean isAzucar() {
		return azucar;
	}

	public void setAzucar(boolean azucar) {
		this.azucar = azucar;
	}

	@Override
	public String toString() {
		return "Postre [nombre=" + nombre + ", precio=" + precio + ", azucar=" + azucar + "]";
	}


	
}

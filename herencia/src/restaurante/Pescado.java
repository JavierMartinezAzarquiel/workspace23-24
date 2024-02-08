package restaurante;

public class Pescado extends Plato{

	public Pescado(String nombre, float precio) {
		super(nombre, precio);
	}

	@Override
	public String toString() {
		return "Pescado [nombre=" + nombre + ", precio=" + precio + "]";
	}

	
}

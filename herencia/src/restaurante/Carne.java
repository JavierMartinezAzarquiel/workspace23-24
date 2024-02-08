package restaurante;

public class Carne extends Plato{
//	public static final String POCO_HECHA = "Poco hecha";
//	public static final String AL_PUNTO = "Al punto";
//	public static final String MUY_HECHA = "Muy hecha";
//	public static final String CARBONIZADA = "Carbonizada";
	
	public enum GradoCocion{ POCO_HECHA, AL_PUNTO, MUY_HECHA, CARBONIZADA};
	
	protected GradoCocion cocion;

	public Carne(String nombre, float precio, GradoCocion cocion) {
		super(nombre, precio);
		this.cocion = cocion; 
	}

	public GradoCocion getCocion() {
		return cocion;
	}

	public void setCocion(GradoCocion cocion) {
		this.cocion = cocion;
	}

	@Override
	public String toString() {
		return "Carne [nombre=" + nombre + ", precio=" + precio + ", cocion=" + cocion + "]";
	}

	
	
	
}

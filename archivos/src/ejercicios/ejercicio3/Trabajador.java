package ejercicios.ejercicio3;

public class Trabajador {
	
	private String nombre;
	private int peonadas;
	
	public Trabajador(String nombre, int peonadas) {
		super();
		this.nombre = nombre;
		this.peonadas = peonadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeonadas() {
		return peonadas;
	}
	public void setPeonadas(int peonadas) {
		this.peonadas = peonadas;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", peonadas=" + peonadas + "]";
	}
	
	
}

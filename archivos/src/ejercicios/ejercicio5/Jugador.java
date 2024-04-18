package ejercicios.ejercicio5;

public class Jugador {

	private String nombre;
	private Demarcacion demarcacion;
	private Seleccion seleccion;
	
	public Jugador(String nombre, Demarcacion demarcacion, Seleccion seleccion) {
		super();
		this.nombre = nombre;
		this.demarcacion = demarcacion;
		this.seleccion = seleccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Demarcacion getDemarcacion() {
		return demarcacion;
	}
	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}
	public Seleccion getSeleccion() {
		return seleccion;
	}
	public void setSeleccion(Seleccion seleccion) {
		this.seleccion = seleccion;
	}
	@Override
	public String toString() {
		return "Jugador [nombre=" + nombre + ", demarcacion=" + demarcacion + ", seleccion=" + seleccion + "]";
	}
	
	
}

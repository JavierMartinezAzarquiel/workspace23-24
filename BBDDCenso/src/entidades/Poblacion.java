package entidades;

public class Poblacion {
	private String nombre;
	private int numeroHabitantes;
	
	public Poblacion(String nombre, int numeroHabitantes) {
		super();
		this.nombre = nombre;
		this.numeroHabitantes = numeroHabitantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroHabitantes() {
		return numeroHabitantes;
	}

	public void setNumeroHabitantes(int numeroHabitantes) {
		this.numeroHabitantes = numeroHabitantes;
	}

	@Override
	public String toString() {
		return "Poblacion [nombre=" + nombre + ", numeroHabitantes=" + numeroHabitantes + "]";
	}
	
	
}

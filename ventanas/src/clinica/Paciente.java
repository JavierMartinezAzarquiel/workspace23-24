package clinica;

public class Paciente {

	private String dni;
	private String nombre;
	private String compañia;
	
	public Paciente(String dni, String nombre, String compañia) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.compañia = compañia;
	}

	public Paciente(String dni, String nombre) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.compañia = "Privado";
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCompañia() {
		return compañia;
	}

	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "Paciente [dni=" + dni + ", nombre=" + nombre + ", compañia=" + compañia + "]";
	}
	
	
}

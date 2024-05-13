package entidades;

public class Habitante {

	private String nombre;
	private String email;
	private int edad;
	private String poblacion;
	
	public Habitante(String nombre, String email, int edad, String poblacion) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.edad = edad;
		this.poblacion = poblacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Habitante [nombre=" + nombre + ", email=" + email + ", edad=" + edad + ", poblacion=" + poblacion + "]";
	}
	
	
}

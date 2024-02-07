package empresa;

public abstract class Persona { //clase no instanciable, no se pueden crear objetos

	protected String dni;    //los atributos protegidos se pueden heredar
	protected String nombre;
	protected long telefono;
	
	public Persona(String dni, String nombre, long telefono) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.telefono = telefono;
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

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
}

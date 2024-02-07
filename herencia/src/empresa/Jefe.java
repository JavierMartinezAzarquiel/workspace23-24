package empresa;

public class Jefe extends Staff{

	protected String matricula;

	public Jefe(String dni, String nombre, long telefono, float sueldo, String matricula) {
		super(dni, nombre, telefono, sueldo);
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Jefe [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", sueldo=" + sueldo
				+ ", matricula=" + matricula + "]";
	}
	
	
	
}

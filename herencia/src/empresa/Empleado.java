package empresa;

public class Empleado extends Staff{

	public Empleado(String dni, String nombre, long telefono, float sueldo) {
		super(dni, nombre, telefono, sueldo);
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", sueldo=" + sueldo + "]";
	}

	
}

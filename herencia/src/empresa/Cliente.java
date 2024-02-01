package empresa;

public class Cliente extends Persona{ //la clase hereda todo lo de persona

	protected int numeroSocio;

	public Cliente(String dni, String nombre, long telefono, int numeroSocio) {
		super(dni, nombre, telefono);
		this.numeroSocio = numeroSocio;
	}

	public int getNumeroSocio() {
		return numeroSocio;
	}

	public void setNumeroSocio(int numeroSocio) {
		this.numeroSocio = numeroSocio;
	}

	@Override
	public String toString() {
		return "Cliente [dni=" + dni + ", nombre=" + nombre + ", telefono=" + telefono + ", numeroSocio=" + numeroSocio
				+ "]";
	}

	
	
	
}

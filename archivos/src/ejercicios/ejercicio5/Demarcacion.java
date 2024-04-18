package ejercicios.ejercicio5;

public class Demarcacion {

	private String codigo;
	private String posicion;
	public Demarcacion(String codigo, String posicion) {
		super();
		this.codigo = codigo;
		this.posicion = posicion;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPosicion() {
		return posicion;
	}
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	@Override
	public String toString() {
		return "Demarcacion [codigo=" + codigo + ", posicion=" + posicion + "]";
	}
	
	
}

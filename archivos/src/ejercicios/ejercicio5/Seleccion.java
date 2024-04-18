package ejercicios.ejercicio5;

public class Seleccion {

	private String codigo;
	private String pais;
	
	public Seleccion(String codigo, String pais) {
		super();
		this.codigo = codigo;
		this.pais = pais;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Seleccion [codigo=" + codigo + ", pais=" + pais + "]";
	}
	
	
}

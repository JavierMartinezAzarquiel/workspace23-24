package ejercicios.examen2;

import java.io.Serializable;

public class Compra implements Serializable{
	
	private String departamento;
	private int cantidad;
	
	public Compra(String departamento, int cantidad) {
		this.departamento = departamento;
		this.cantidad = cantidad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}

package ejercicios.ejercicio4;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class Vehiculo implements Serializable{
	
	private String matricula;
	private String modelo;
	private float precio;
	private LocalDate entradaEnExposicion;
	
	
	public Vehiculo(String matricula, String modelo, float precio,
			LocalDate entradaEnExposicion) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.precio = precio;
		this.entradaEnExposicion = entradaEnExposicion;
	}


	public String getMatricula() {
		return matricula;
	}


	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public LocalDate getEntradaEnExposicion() {
		return entradaEnExposicion;
	}


	public void setEntradaEnExposicion(LocalDate entradaEnExposicion) {
		this.entradaEnExposicion = entradaEnExposicion;
	}


	public String toString() {
		return "Vehiculo [matricula=" + matricula + ", modelo=" + modelo
				+ ", precio=" + precio + ", entradaEnExposicion="
				+ entradaEnExposicion + "]";
	}
	
	
	
	

}

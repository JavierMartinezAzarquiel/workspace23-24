package entidades;

import java.sql.Date;

public class Alumno {
	
	private int codigoAlumno;
	private String nombre;
	private String apellidos;
	private String telefono;
	private Date fechaNacimiento;
	
	public Alumno(int codigoAlumno, String nombre, String apellidos,
			String telefono, Date fechaNacimiento) {
		this.codigoAlumno = codigoAlumno;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Alumno [codigoAlumno=" + codigoAlumno + ", nombre=" + nombre
				+ ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
	
	

}

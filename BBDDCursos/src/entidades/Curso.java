package entidades;

import java.sql.Date;

public class Curso {
	
	private int codigoCurso;
	private String curso;
	private Date fechaInicio;
	private Date fechaFin;
	private String horaInicio;
	private String horaFin;
	
	public Curso(int codigoCurso, String curso, Date fechaInicio,
			Date fechaFin, String horaInicio, String horaFin) {
		this.codigoCurso = codigoCurso;
		this.curso = curso;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.horaInicio = horaInicio;
		this.horaFin = horaFin;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getHoraFin() {
		return horaFin;
	}

	public void setHoraFin(String horaFin) {
		this.horaFin = horaFin;
	}

	@Override
	public String toString() {
		return "Curso [codigoCurso=" + codigoCurso + ", curso=" + curso
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin
				+ ", horaInicio=" + horaInicio + ", horaFin=" + horaFin + "]";
	}
	
	
	
	

}

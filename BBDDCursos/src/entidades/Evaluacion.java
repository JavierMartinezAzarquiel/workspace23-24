package entidades;

public class Evaluacion {
	
	private int codigoAlumno;
	private int codigoCurso;
	private int nota;
	private String observaciones;
	
	public Evaluacion(int codigoAlumno, int codigoCurso, int nota,
			String observaciones) {
		this.codigoAlumno = codigoAlumno;
		this.codigoCurso = codigoCurso;
		this.nota = nota;
		this.observaciones = observaciones;
	}

	public int getCodigoAlumno() {
		return codigoAlumno;
	}

	public void setCodigoAlumno(int codigoAlumno) {
		this.codigoAlumno = codigoAlumno;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "Evaluacion [codigoAlumno=" + codigoAlumno + ", codigoCurso="
				+ codigoCurso + ", nota=" + nota + ", observaciones="
				+ observaciones + "]";
	}
	
	

}

package crucero;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Escala {
	
	protected String nombreCiudad;
	protected LocalDateTime horaBajada;
	protected LocalDateTime horaRegreso;
	
	public Escala(String nombreCiudad, LocalDateTime horaBajada, LocalDateTime horaRegreso) {
		super();
		this.nombreCiudad = nombreCiudad;
		this.horaBajada = horaBajada;
		this.horaRegreso = horaRegreso;
	}

	public String getNombreCiudad() {
		return nombreCiudad;
	}

	public void setNombreCiudad(String nombreCiudad) {
		this.nombreCiudad = nombreCiudad;
	}

	public LocalDateTime getHoraBajada() {
		return horaBajada;
	}

	public void setHoraBajada(LocalDateTime horaBajada) {
		this.horaBajada = horaBajada;
	}

	public LocalDateTime getHoraRegreso() {
		return horaRegreso;
	}

	public void setHoraRegreso(LocalDateTime horaRegreso) {
		this.horaRegreso = horaRegreso;
	}

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		return "\n Ciudad: " + nombreCiudad + " Hora de Bajada: " + horaBajada.format(dtf)
		       + " Hora de Regreso: " + horaRegreso.format(dtf);
	}
	
}

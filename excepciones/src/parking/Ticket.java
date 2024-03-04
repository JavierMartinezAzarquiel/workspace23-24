package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {

	public static final float PRECIO_MINUTO = 0.03F;
	public static final float PRECIO_HORA = 1.70F;
	public static final float PRECIO_DIA = 17.0F;
	
	private String matricula;
	private LocalDateTime horaEntrada;
	private boolean pagado;
	
	public Ticket(String matricula) {
		super();
		this.matricula = matricula;
		this.horaEntrada = LocalDateTime.now(); //guado la hora en el momento que se crea el ticket
		this.pagado = false;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public LocalDateTime getHoraEntrada() {
		return horaEntrada;
	}

	public void setHoraEntrada(LocalDateTime horaEntrada) {
		this.horaEntrada = horaEntrada;
	}

	public boolean isPagado() {
		return pagado;
	}

	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}
	
	public float getPrecio() throws TicketException {
		LocalDateTime ahora = LocalDateTime.now();
		Duration duracion = Duration.between(this.horaEntrada, ahora);
		
		if(duracion.toMinutes() < 0) { //si la duración es negativa
			throw new TicketException("La hora del ticket no es correcta");
		}
		
		
	}
	
}

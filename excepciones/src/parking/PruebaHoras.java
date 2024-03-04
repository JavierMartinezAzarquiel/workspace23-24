package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class PruebaHoras {

	public static void main(String[] args) throws InterruptedException {
		// como saber el tiempo que transcurre entre una hora y otra
		
		LocalDateTime horaEntrada = LocalDateTime.now();
		System.out.println(horaEntrada);
		
		Thread.sleep(10000);

		LocalDateTime horaSalida = LocalDateTime.now();
		System.out.println(horaSalida);
		
		
		//obtener la diferencia entre dos horas
		Duration duracion = Duration.between(horaEntrada, horaSalida);
		System.out.println(duracion.toSeconds());
	}

}

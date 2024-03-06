package parking;

import java.time.Duration;
import java.time.LocalDateTime;

public class PruebaHoras {

	public static void main(String[] args) throws InterruptedException, TicketException {
		// como saber el tiempo que transcurre entre una hora y otra
		
//		LocalDateTime horaEntrada = LocalDateTime.now();
//		System.out.println(horaEntrada);
//		
//		Thread.sleep(10000);
//
//		LocalDateTime horaSalida = LocalDateTime.now();
//		System.out.println(horaSalida);
//		
//		
//		//obtener la diferencia entre dos horas
//		Duration duracion = Duration.between(horaEntrada, horaSalida);
//		System.out.println(duracion.toSeconds());
		
		Parking parking = new Parking(100);
		Ticket t1 = new Ticket("1234MHK");
		Ticket t2 = new Ticket("9876LBT");
		t1.setHoraEntrada(LocalDateTime.of(2024, 3, 4, 23, 30));
		parking.addTicket(t1);
		parking.addTicket(t2);
		System.out.println(parking.getTickets());
		
		//Thread.sleep(60000); //espero un minuto
		
		System.out.println(	parking.getTicket("1234MHK").getPrecio() );
		
	}

}

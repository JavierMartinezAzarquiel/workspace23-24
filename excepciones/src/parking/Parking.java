package parking;

import java.util.ArrayList;

public class Parking {
	
	private int capacidad;
	private ArrayList<Ticket> tickets;
	
	public Parking(int capacidad) {
		super();
		this.capacidad = capacidad;
		this.tickets = new ArrayList<Ticket>();
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public ArrayList<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(ArrayList<Ticket> tickets) {
		this.tickets = tickets;
	}
	
	public Ticket getTicket(String matricula) { //busca un ticket dada una matricula
		for (Ticket ticket : tickets) {
			if(ticket.getMatricula().equals(matricula)) {
				return ticket;
			}
		}
		return null;
	}
	
	public void addTicket(Ticket t) throws TicketException {
		if (this.tickets.size() == this.capacidad) {//si el parking está lleno
			throw new TicketException("Parking completo");
		}
		
		if( this.getTicket(t.getMatricula()) != null) { //si hay otro ticket con la misma matrícula
			throw new TicketException("Ya existe un ticket con esa matricula");
		}
		
		this.tickets.add(t); //añado el ticket y subo la barrera para que entre
	}
	
	public void removeTicket(Ticket t) throws TicketException {
		if( ! t.isPagado() ) { //si el ticket no está pagado
			throw new TicketException("Abone su ticket, por favor");
		}
		
		this.tickets.remove(t); //Eliminamos el ticket y subimos la barrera de salida.
	}
	
}

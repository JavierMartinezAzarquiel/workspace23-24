package crucero;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;

public class Crucero {

	private int codigo;
	private String nombreComercial;
	private String nombreBarco;
	private LocalDate fechaPartida;
	private LocalDate fechaRegreso;
	private ArrayList<Escala> listaEscalas;
	
	public Crucero(int codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaRegreso, ArrayList<Escala> listaEscalas) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.listaEscalas = listaEscalas;
	}
	
	public Crucero(int codigo, String nombreComercial, String nombreBarco, LocalDate fechaPartida,
			LocalDate fechaRegreso) {
		super();
		this.codigo = codigo;
		this.nombreComercial = nombreComercial;
		this.nombreBarco = nombreBarco;
		this.fechaPartida = fechaPartida;
		this.fechaRegreso = fechaRegreso;
		this.listaEscalas = new ArrayList<Escala>();
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombreComercial() {
		return nombreComercial;
	}

	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}

	public String getNombreBarco() {
		return nombreBarco;
	}

	public void setNombreBarco(String nombreBarco) {
		this.nombreBarco = nombreBarco;
	}

	public LocalDate getFechaPartida() {
		return fechaPartida;
	}

	public void setFechaPartida(LocalDate fechaPartida) {
		this.fechaPartida = fechaPartida;
	}

	public LocalDate getFechaRegreso() {
		return fechaRegreso;
	}

	public void setFechaRegreso(LocalDate fechaRegreso) {
		this.fechaRegreso = fechaRegreso;
	}

	public ArrayList<Escala> getListaEscalas() {
		return listaEscalas;
	}

	public void setListaEscalas(ArrayList<Escala> listaEscalas) {
		this.listaEscalas = listaEscalas;
	}
	
	//Añadir una escala
	public void add(Escala e) {
		this.listaEscalas.add(e);
	}
	
	//Eliminar una escala
	public void remove(Escala e) {
		this.listaEscalas.remove(e);
	}
	
	//coste
	public float coste() {
		float total = 600;
		for (Escala escala : listaEscalas) {
			if(escala instanceof EscalaCultural) {
				total += 100 + ((EscalaCultural)escala).getPrecioGuia();
			}else {
				total += 100;
			}
		}
		return total;
	}

	
	//toString
	@Override
	public String toString() {
		String escalas = "Lista de escalas: \n";
		for (Escala escala : listaEscalas) {
			escalas += "\t" + escala + "\n";
		}
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return "Código de crucero: " + this.codigo
				+ "\nNombre Comercial: " + this.nombreComercial
				+ "\nNombre del barco: " + this.nombreBarco
				+ "\nFecha de salida: " + this.fechaPartida.format(dtf)
				+ "\nFecha de regreso: " + this.fechaRegreso.format(dtf)
				+ "\n"+escalas;
	}
	
	
	
	
	
}

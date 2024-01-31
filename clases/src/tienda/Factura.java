package tienda;

import java.time.LocalDate;
import java.util.ArrayList;

public class Factura {

	private int numero;
	private LocalDate fecha;
	private ArrayList<LineaFactura> lineas;
	private boolean pagada;
	
	public Factura(int numero, LocalDate fecha, boolean pagada) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.lineas = new ArrayList<LineaFactura>();
		this.pagada = pagada;
	}

	public Factura(int numero, LocalDate fecha, ArrayList<LineaFactura> lineas, boolean pagada) {
		super();
		this.numero = numero;
		this.fecha = fecha;
		this.lineas = lineas;
		this.pagada = pagada;
	}

	public Factura(int numero) {
		super();
		this.numero = numero;
		this.fecha = LocalDate.now();
		this.lineas =  new ArrayList<LineaFactura>();
		this.pagada = false;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public ArrayList<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(ArrayList<LineaFactura> lineas) {
		this.lineas = lineas;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public int getNumero() {
		return numero;
	}
	
	
	
}

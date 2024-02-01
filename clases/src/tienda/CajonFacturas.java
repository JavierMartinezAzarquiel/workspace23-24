package tienda;

import java.util.ArrayList;

public class CajonFacturas {

	//Atributos
	private ArrayList<Factura> facturas;

	//Constructores
	public CajonFacturas(ArrayList<Factura> facturas) {
		super();
		this.facturas = facturas;
	}

	public CajonFacturas() {
		super();
		this.facturas = new ArrayList<Factura>();
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	
	//añadir una factura
	public void add(Factura factura) {
		this.facturas.add(factura);
	}
	
	//buscar una factura(usando el nº de factura)
	public Factura get(int numero) {
		for (Factura factura : facturas) {
			if(factura.getNumero() == numero) {
				return factura;
			}
		}
		return null;
	}
	
	//obtener las facturas pendientes de cobro
	public ArrayList<Factura> getFacturasPendientes(){
		//aquí voy guardando las facturas que están sin pagar
		ArrayList<Factura> pendientes = new ArrayList<Factura>(); 
		for (Factura factura : this.facturas) {
			if( ! factura.isPagada() ) {
				pendientes.add(factura);
			}
		}
		return pendientes;
	}
	
}




package tienda;

public class LineaFactura {

	private int codigo;
	private int cantidad;
	private float precio;
	
	public LineaFactura(int codigo, int cantidad, float precio) {
		super();
		this.codigo = codigo;
		this.cantidad = cantidad;
		this.precio = precio;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "LineaFactura [codigo=" + codigo + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	
	
	
}

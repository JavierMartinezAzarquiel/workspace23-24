package tienda;

import java.util.ArrayList;

public class Stock {

	//Atributos
	private ArrayList<Producto> productos;

	//Constructores
	public Stock() {
		super();
		this.productos = new ArrayList<Producto>();
	}

	public Stock(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
	
	
	//añadir Producto
	public void add(Producto producto) {
		this.productos.add(producto);
	}
	
	//eliminar Producto
	public boolean delete(Producto producto) {
		return this.productos.remove(producto);
	}
	
	//buscar un Producto usando un código de producto
	public Producto get(int codigo) {
		for (Producto producto : productos) {
			if(producto.getCodigo() == codigo) {
				return producto;
			}
		}
		return null;
	}
	
	//obtener los productos agotados
	public ArrayList<Producto> getProductosAgotados(){
		ArrayList<Producto> agotados = new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if(producto.getCantidad() == 0) {
				agotados.add(producto);
			}
		}
	
		return agotados;
	}
	
	//obtener los productos bajo minimo
	public ArrayList<Producto> getProductosBajoMinimo(){
		ArrayList<Producto> bajoMinimo = new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if(producto.getCantidad() < producto.getMinimo()) {
				bajoMinimo.add(producto);
			}
		}
		return bajoMinimo;
	}
	
}

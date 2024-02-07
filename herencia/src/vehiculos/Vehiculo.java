package vehiculos;

public abstract class Vehiculo {  //clase abstracta, no pueden haber objetos de esta clase, no es instanciable

	protected String marca;
	protected int precio;
	protected String modelo;
	protected String color;

	public Vehiculo(String marca, int precio, String modelo, String color) {
		this.marca = marca;
		this.precio = precio;
		this.modelo = modelo;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + "]";
	}

	


}
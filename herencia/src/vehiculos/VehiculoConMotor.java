package vehiculos;

public abstract class VehiculoConMotor extends Vehiculo {

	protected int cilindrada;
	protected String combustible;

	public VehiculoConMotor(String marca, int precio, String modelo,
			String color, int cilindrada, String combustible) {
		super(marca, precio, modelo, color);
		this.cilindrada = cilindrada;
		this.combustible = combustible;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	@Override
	public String toString() {
		return "VehiculoConMotor [cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca=" + marca
				+ ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + "]";
	}

	


}
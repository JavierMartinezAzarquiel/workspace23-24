package vehiculos;

public class Moto extends VehiculoConMotor {

	protected String estilo;

	public Moto(String marca, int precio, String modelo, String color,
			int cilindrada, String combustible, String estilo) {
		super(marca, precio, modelo, color, cilindrada, combustible);
		this.estilo = estilo;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Moto [estilo=" + estilo + ", cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca=" + marca
				+ ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + "]";
	}

	

}
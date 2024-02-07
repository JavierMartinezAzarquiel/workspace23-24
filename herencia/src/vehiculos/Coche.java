package vehiculos;

public class Coche extends VehiculoConMotor {

	protected int puertas;

	public Coche(String marca, int precio, String modelo, String color,
			int cilindrada, String combustible,int puertas) {
		super(marca, precio, modelo, color, cilindrada, combustible);
		this.puertas = puertas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	@Override
	public String toString() {
		return "Coche [puertas=" + puertas + ", cilindrada=" + cilindrada + ", combustible=" + combustible + ", marca="
				+ marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color + "]";
	}

	

}
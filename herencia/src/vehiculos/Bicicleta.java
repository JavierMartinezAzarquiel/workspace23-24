package vehiculos;

public class Bicicleta extends VehiculoSinMotor {

	protected int marchas;

	public Bicicleta(String marca, int precio, String modelo, String color, int marchas) {
		super(marca, precio, modelo, color);
		this.marchas = marchas;
	}

	public int getMarchas() {
		return marchas;
	}

	public void setMarchas(int marchas) {
		this.marchas = marchas;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color
				+ ", marchas=" + marchas + "]";
	}

	
	


}
package vehiculos;

public class Patinete extends VehiculoSinMotor{

	protected int capacidadBateria;

	public Patinete(String marca, int precio, String modelo, String color, int capacidadBateria) {
		super(marca, precio, modelo, color);
		this.capacidadBateria = capacidadBateria;
	}

	public int getCapacidadBateria() {
		return capacidadBateria;
	}

	public void setCapacidadBateria(int capacidadBateria) {
		this.capacidadBateria = capacidadBateria;
	}

	@Override
	public String toString() {
		return "Patinete [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color
				+ ", capacidadBateria=" + capacidadBateria + "]";
	}
	
}

package vehiculos;

public abstract class VehiculoSinMotor extends Vehiculo {

	
	public VehiculoSinMotor(String marca, int precio, String modelo, String color) {
		super(marca, precio, modelo, color);
	}

	@Override
	public String toString() {
		return "VehiculoSinMotor [marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", color=" + color
				+ "]";
	}

	

	
	
	

  
}
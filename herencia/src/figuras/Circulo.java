package figuras;

public class Circulo extends Figura {

	protected double radio;

	public Circulo(String color, double radio) {
		super(color);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [color=" + color + ", radio=" + radio + "]";
	}

	@Override
	public double area() {
		return Math.PI * Math.pow(radio, 2);
	}

	@Override
	public double perimetro() {
		return 2 * Math.PI * radio;
	}
	
	
	
}

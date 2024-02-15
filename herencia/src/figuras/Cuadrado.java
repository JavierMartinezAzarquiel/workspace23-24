package figuras;

public class Cuadrado extends Figura {

	protected int lado;

	public Cuadrado(String color, int lado) {
		super(color);
		this.lado = lado;
	}

	public int getLado() {
		return lado;
	}

	public void setLado(int lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [color=" + color + ", lado=" + lado + "]";
	}

	@Override
	public double area() {
		return lado * lado;
	}

	@Override
	public double perimetro() {
		return lado * 4;
	}

	
	
	
}

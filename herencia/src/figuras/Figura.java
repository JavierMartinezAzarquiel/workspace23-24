package figuras;

public abstract class Figura {

	protected String color;

	public Figura(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}
	
	/*
	 * Dos métodos que todas las clases tendrán que tener
	 * Les ponemos abstractos porque no sabemos implemtarlos todavía
	 * Las clases que hereden de Figura, tendrán la obligación de terminarlos
	 */
	public abstract double area();
	
	public abstract double perimetro();
	
}

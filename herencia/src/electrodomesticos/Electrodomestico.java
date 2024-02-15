package electrodomesticos;

public class Electrodomestico {

//	public static final String BLANCO = "Blanco";
//	public static final String NEGRO = "Negro";
//	....
//	public static final char A = 'A';
//	public static final char B = 'B';
//	....

	public enum Colores{BLANCO, NEGRO, ROJO, AZUL, GRIS}
	
	public enum CategoriaEnergetica{A,B,C,D,E,F}
	
	//constantes para los valores por defecto
	public static final Colores COLOR_POR_DEFECTO = Colores.BLANCO;
	public static final CategoriaEnergetica CONSUMO_POR_DEFECTO = CategoriaEnergetica.F;
	public static final float PRECIO_POR_DEFECTO = 100;
	public static final int PESO_POR_DEFECTO = 5;
	
	protected float precioBase;
	protected Colores color;
	protected CategoriaEnergetica consumoEnergetico;
	protected int peso;
	
	public Electrodomestico() {
		this.precioBase = PRECIO_POR_DEFECTO;
		this.color = COLOR_POR_DEFECTO;
		this.consumoEnergetico = CONSUMO_POR_DEFECTO;
		this.peso = PESO_POR_DEFECTO;
	}

	public Electrodomestico(float precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color = COLOR_POR_DEFECTO;
		this.consumoEnergetico = CONSUMO_POR_DEFECTO;
	}

	public Electrodomestico(float precioBase, Colores color, CategoriaEnergetica consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}

	public float getPrecioBase() {
		return precioBase;
	}

	public Colores getColor() {
		return color;
	}

	public CategoriaEnergetica getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	public float precioFinal() {
		float total = this.precioBase;
		
		if(this.peso < 20) {
			total += 10;
		}else if (this.peso >= 20 && this.peso < 50) {
			total += 50;
		}else if (this.peso >= 50 && this.peso < 80) {
			total += 80;
		}else {
			total += 100;
		}
		
		switch (this.consumoEnergetico) {
		case A:total += 100;break;
		case B:total += 80;break;
		case C:total += 60;break;
		case D:total += 50;break;
		case E:total += 30;break;
		case F:total += 10;break;
		}
		
		return total;
	}
	
}




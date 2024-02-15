package electrodomesticos;

public class Lavadora extends Electrodomestico{
	public static final int CARGA_POR_DEFECTO = 5;
	
	protected int carga;

	public Lavadora() { //constructor por defecto
		super();
		this.carga = CARGA_POR_DEFECTO;
	}

	public Lavadora(float precioBase, Colores color, CategoriaEnergetica consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public Lavadora(float precioBase, int peso) {
		super(precioBase, peso);
		this.carga = CARGA_POR_DEFECTO;
	}

	public int getCarga() {
		return carga;
	}

	@Override
	public float precioFinal() {
		if(this.carga > 30) {
			return super.precioFinal() + 50;
		}else {
			return super.precioFinal();
		}
	}

	
	
}

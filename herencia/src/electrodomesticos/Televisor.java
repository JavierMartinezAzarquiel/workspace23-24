package electrodomesticos;

public class Televisor extends Electrodomestico{

	public static final int TAMAÑO_POR_DEFECTO = 20;
	public static final boolean SMARTTV_POR_DEFECTO = false;
	
	protected int tamaño;
	protected boolean smartTV;
	
	public Televisor() {
		super();
		this.tamaño = TAMAÑO_POR_DEFECTO;
		this.smartTV = SMARTTV_POR_DEFECTO;
	}
	public Televisor(float precioBase, Colores color, CategoriaEnergetica consumoEnergetico, int peso, int tamaño, boolean smartTV) {
		super(precioBase, color, consumoEnergetico, peso);
		this.tamaño = tamaño;
		this.smartTV = smartTV;
	}
	public Televisor(float precioBase, int peso) {
		super(precioBase, peso);
		this.tamaño = TAMAÑO_POR_DEFECTO;
		this.smartTV = SMARTTV_POR_DEFECTO;
	}
	public int getTamaño() {
		return tamaño;
	}
	public boolean isSmartTV() {
		return smartTV;
	}
	
	@Override
	public float precioFinal() {
		float total = super.precioFinal();
		if(this.tamaño > 40) {
			total *= 1.3;
		}
		if(this.smartTV) {
			total += 50;
		}
		return total;
	}
	
	
	
	
}

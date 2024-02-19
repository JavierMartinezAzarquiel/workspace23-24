package contadoresConInterfaz;



public class ContadorEntero implements Contador {

	protected int valor;

	public ContadorEntero(int valor) {
		super();
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ContadorEntero [valor=" + valor + "]";
	}

	@Override
	public void incrementar() {
		this.valor++;
	}

	@Override
	public void decrementar() {
		this.valor--;
	}

	@Override
	public void reset() {
		this.valor = 0;
	}
	
	
}

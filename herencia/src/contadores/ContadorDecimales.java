package contadores;

public class ContadorDecimales extends Contador{

	protected double valor;

	public ContadorDecimales(double valor) {
		super();
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ContadorDecimales [valor=" + valor + "]";
	}

	@Override
	public void incrementar() {
		this.valor += 0.1;
	}

	@Override
	public void decrementar() {
		this.valor -= 0.1;
	}

	@Override
	public void reset() {
		this.valor = 0;
	}
	
}

package contadoresConInterfaz;



public class ContadorEntero implements Contador {

	protected int valor;
	protected int limiteInferior;
	protected int limiteSuperior;

	
	public ContadorEntero(int valor, int limiteInferior, int limiteSuperior) {
		super();
		this.valor = valor;
		this.limiteInferior = limiteInferior;
		this.limiteSuperior = limiteSuperior;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public int getLimiteInferior() {
		return limiteInferior;
	}

	public void setLimiteInferior(int limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public int getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteSuperior(int limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	@Override
	public String toString() {
		return "ContadorEntero [valor=" + valor + "]";
	}

	@Override
	public void incrementar() throws ContadorException {
		if(this.valor == this.limiteSuperior) {
			throw new ContadorException("No puedo subir mas");
		}else {
			this.valor++;
		}
	}

	@Override
	public void decrementar() throws ContadorException {
		if(this.valor == this.limiteInferior) {
			throw new ContadorException("No puedo bajar mas");
		}else {
			this.valor--;
		}
	}

	@Override
	public void reset() {
		this.valor = this.limiteInferior;
	}
	
	
}

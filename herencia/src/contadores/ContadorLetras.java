package contadores;

public class ContadorLetras extends Contador{

	protected char valor;

	public ContadorLetras(char valor) {
		super();
		this.valor = valor;
	}

	public char getValor() {
		return valor;
	}

	public void setValor(char valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ContadorLetras [valor=" + valor + "]";
	}

	@Override
	public void incrementar() {
		if(this.valor == 'Z') {
			this.valor = 'A';
		}else {
			this.valor++;
		}
			
	}

	@Override
	public void decrementar() {
		if(this.valor == 'A') {
			this.valor = 'Z';
		}else {
			this.valor--;
		}
	}

	@Override
	public void reset() {
		this.valor = 'A';
	}
	
	
}

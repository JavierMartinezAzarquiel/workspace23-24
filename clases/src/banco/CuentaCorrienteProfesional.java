package banco;

public class CuentaCorrienteProfesional {

	//atributos
	private String iban;
	private Persona titular;
	private double saldo;

	public CuentaCorrienteProfesional(String iban, Persona titular, double saldo) {
		super();
		this.iban = iban;
		this.titular = titular;
		this.saldo = saldo;
	}

	public CuentaCorrienteProfesional(String iban, Persona titular) {
		super();
		this.iban = iban;
		this.titular = titular;
	}

	public CuentaCorrienteProfesional(String iban) {
		super();
		this.iban = iban;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	@Override
	public String toString() {
		return "CuentaCorrienteProfesional [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}

	//métodos hechos a mano
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}

	public boolean retirar(double cantidad) {
		if( cantidad <= saldo) {
			saldo -= cantidad;
			return true;
		}else {
			return false;
		}
	}


}

package banco;

//vamos a simular como se comporta una cuenta corriente de un banco
public class CuentaCorriente {

	//Atributos: Datos que va a manejar la clase
	//ponemos el modificador privado para que nadie toque los atributos directamente
	private String iban;
	private String titular;
	private double saldo;
	
	//Métodos: Comportamiento que la cuenta corriente debe tener
	public String dimeElTitular(){
		return titular;
	}
	
	public String dimeElIban() {
		return iban;
	}
	
	public double dimeElSaldo() {
		return saldo;
	}
	
	public void cambiaElTitular(String nuevoTitular) {
		titular = nuevoTitular;
	}
	
	public void ingresar(double cantidad) {
		saldo += cantidad;
	}
	
	public void retirar(double cantidad) {
		if( cantidad <= saldo) {
			saldo -= cantidad;
			System.out.println("Retirada completada");
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
}

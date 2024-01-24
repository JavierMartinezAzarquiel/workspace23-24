package banco;

public class Prueba {

	public static void main(String[] args) {
		// Probar la clase CuentaCorriente
		
		//creamos un objeto CuentaCorriente
//		CuentaCorriente cuenta = new CuentaCorriente();
//		
//		cuenta.ingresar(100);
//		cuenta.retirar(30);
//		System.out.println( cuenta.dimeElSaldo() );

		CuentaCorriente2 cuenta = new CuentaCorriente2("ES03928393938393", "Javier",0);
		
		System.out.println("El numero de cuenta es: " + cuenta.getIban());
		cuenta.ingresar(200);
		cuenta.ingresar(100);
		System.out.println("Saldo: " + cuenta.getSaldo());
		
		CuentaCorriente2  cuenta2 = new CuentaCorriente2("ES93983028276464");
		
		System.out.println( cuenta2 );
	}

}

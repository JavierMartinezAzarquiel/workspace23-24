package banco;

public class Prueba {

	public static void main(String[] args) {

		Persona javier = new Persona("02939393Y", "Javier");
		CuentaCorrienteProfesional cc = new CuentaCorrienteProfesional("ES0398398393",javier , 100);
		
		try {
			cc.retirar(20);
		} catch (SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println(cc);
	}

}

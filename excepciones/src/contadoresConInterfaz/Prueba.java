package contadoresConInterfaz;

public class Prueba {

	public static void main(String[] args) {
		ContadorEntero contador = new ContadorEntero(1, 1, 10);

		try {
			contador.decrementar();
		} catch (ContadorException e) {
			System.out.println(e.getMessage());
		}
		
		
	}

}

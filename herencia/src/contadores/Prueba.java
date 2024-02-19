package contadores;

public class Prueba {

	public static void main(String[] args) {
		ContadorEntero ce = new ContadorEntero(0);
		ContadorDecimales cd = new ContadorDecimales(0);
		ContadorLetras cl = new ContadorLetras('A');
		
		ce.incrementar();
		System.out.println(ce);
		
		cd.incrementar();
		cd.incrementar();
		System.out.println(cd);
		
		cl.incrementar();
		cl.incrementar();
		System.out.println(cl);
	}

}

package restaurante;

public class Prueba {

	public static void main(String[] args) {
		Comanda c = new Comanda(14, 6);
		
		c.addPlato(new Primero("Jamón serrano", 25.00F, true));
		c.addPlato(new Carne("Solomillo", 16.00F, Carne.GradoCocion.AL_PUNTO));
		c.addPlato(new Pescado("Lubina", 14.00F));
		c.addPlato(new Postre("Tiramisú", 8.99F, true));
		c.addPlato(new Postre("Brownie", 6.99F, false));
		
		System.out.println(c);
		System.out.println("Precio total: " + c.coste());
	}

}

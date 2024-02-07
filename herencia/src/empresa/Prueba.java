package empresa;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {
		
		Cliente c = new Cliente("03938484J", "Javier", 665747433, 1);
		Empleado e = new Empleado("229384347R", "Carlos", 663737333, 1400);
		Jefe j = new Jefe("02293834J", "Jefe", 67272163, 2000, "3467MLU");
		
		
		System.out.println(c);
		System.out.println(e);
		System.out.println(j);

		
		ArrayList<Persona> gente = new ArrayList<Persona>();
		
		gente.add(e);
		gente.add(c);
		gente.add(j);
		
		for (Persona persona : gente) {
			System.out.println(persona);
		}
		
		//Persona p = new Persona("03938484J", "Javier", 665747433);
	}

}

package ui;

import dao.DAOPoblacion;
import entidades.Poblacion;

public class Prueba {

	public static void main(String[] args) {
		DAOPoblacion daop = new DAOPoblacion();
		
		//daop.add( new Poblacion("Cobisa", 0));
		//daop.delete(new Poblacion("Cobisa", 4000));	
		System.out.println( daop.get() );
		System.out.println( daop.getPoblacionesVacias());
	}

}

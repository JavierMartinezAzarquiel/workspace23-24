package ui;

import dao.DAOContactos;
import entidades.Contacto;

public class Prueba {

	public static void main(String[] args) {
		// obtener un objeto DAO
		DAOContactos daoContactos = new DAOContactos();
		
//		daoContactos.add( new Contacto("Carlos", 69999999L));

		daoContactos.update( new Contacto("Carlos", 60000000L ) );
		
		System.out.println( daoContactos.get() );
	}

}

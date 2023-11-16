package pruebas;

import java.util.Iterator;

public class PruebaDeVelocidad {

	public static void main(String[] args) {
		// comprobar la velocidad de un String y un StringBuilder
		
		String s = "";
		long inicio = System.currentTimeMillis();
		//trabajo a realizar
		for (int i = 0; i < 100000; i++) {
			s = s.concat("Lunes");
		}
		long fin = System.currentTimeMillis();
		System.out.println("Tiempo de String: " + (fin - inicio));

		
		StringBuilder sb = new StringBuilder();
		inicio = System.currentTimeMillis();
		//trabajo a realizar
		for (int i = 0; i < 100000; i++) {
			sb.append("Lunes");
		}
		fin = System.currentTimeMillis();
		System.out.println("Tiempo de StringBuilder: " + (fin - inicio));
		
	}

}

package hojaRepaso;

public class Ejercicio10 {
	/*
	 * 10.	Una cadena de ADN se representa como una secuencia circular de bases (adenina, timina, citosina y guanina) 
	 *      que es única para cada ser vivo, por ejemplo:
			A T G C G T A T
			Se pide diseñar un método booleano que nos devuelva true si dos cadenas de ADN coinciden.
			
			MUY IMPORTANTE: La secuencia de ADN es cíclica, por lo que puede comenzar en cualquier posición. 
			                Por ejemplo, las dos secuencias siguientes coinciden:
							A T G C G T A T
							A T A T G C G T

	 */
	
	
	public static void main(String[] args) {
		
		System.out.println( comprobarADN("ATGCGTAT","ATATGCGT" ) );

	}
	
	
	public static boolean comprobarADN( String primeraMuesta, String segundaMuestra) {
		
		if(primeraMuesta.length() != segundaMuestra.length()) return false;
		
		for (int i = 0; i < primeraMuesta.length(); i++) {
			if(primeraMuesta.equals(segundaMuestra)) {
				return true;
			}
			segundaMuestra  = rotar(segundaMuestra);
		}
		return false;
	}
	
	public static String rotar(String frase) {
		return frase.substring(1) + frase.charAt(0);
	}

}

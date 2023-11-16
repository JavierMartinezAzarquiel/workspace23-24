package pruebas;

public class PruebaString {

	public static void main(String[] args) {
		// probamos un String

		String s = "Hola, que tal";
		String t = "HOla, que tal";
		
		//mostrar la longitud de una frase
		System.out.println("Longitud: " + s.length());
		
		//Letra por posición
		System.out.println("La letra nº7 es: " + s.charAt(7));
		//Sacar la última letra de la frase
		System.out.println("La última letra es: " + s.charAt( s.length()-1 ));
		
		//comparar dos cadenas, strings
		System.out.println( s == t);
		System.out.println( s.equals(t) );
		System.out.println( s.equalsIgnoreCase(t) );
		
		//diferencia entre dos Strings
		System.out.println( s.compareTo(t) );
		
		//comprobar el inicio y el final de una frase
		System.out.println("La frase comienza en <<Hola>>?: " + s.startsWith("Hola"));
		System.out.println("La frase acaba en <<tal>>?: " + s.endsWith("tal"));
		
		//Trozos de frase
		System.out.println("El trozo de la letra 3 a la 11: " + s.substring(3,11) );
		System.out.println("El trozo de la letra 3 hasta el final: " + s.substring(3) );
	
		//Buscar dentro de la frase
		System.out.println("La letra <<q>> está en la posición: " + s.indexOf('q'));
		System.out.println("La letra <<Q>> está en la posición: " + s.indexOf('Q'));
		System.out.println("La palabra <<que>> está en la posición: " + s.indexOf("que"));
		System.out.println("La última <<a>> está en la posición: " + s.lastIndexOf('a'));
	
	}

}










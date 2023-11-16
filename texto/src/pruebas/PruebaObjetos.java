package pruebas;

public class PruebaObjetos {

	public static void main(String[] args) {
		// Probar la diferencia entre un dato primitivo y un objeto
		
		int a = 7;
		
				
		/*
		 * Para cada tipo de dato primitivo existe uno referenciado
		 * 
		 * int		Integer
		 * long		Long
		 * double	Double
		 * float	Float
		 * boolean	Boolean
		 * char	 	Character
		 * short	Short
		 * byte		Byte
		 */
		
		
//		int x = 5, y = 5;
//		
//		System.out.println( x == y );
//		
//		Integer b = new Integer(7);
//		Integer c = new Integer(7);
//		
//		System.out.println( b.intValue() == c.intValue() );
		
		
		//Probar un String
		
		String frase1 = "Hola";
		String frase2 = "Hola";
		
		System.out.println( frase1 == frase2);
		
		StringBuilder frase3 = new StringBuilder("Hola");
		StringBuilder frase4 = new StringBuilder("Hola");
		
		System.out.println( frase3 == frase4);
	}

}








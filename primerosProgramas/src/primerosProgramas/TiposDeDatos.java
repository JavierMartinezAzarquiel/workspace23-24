package primerosProgramas;

public class TiposDeDatos {

	public static void main(String[] args) {
		/*
		 * Programa donde probar los diferentes tipos de datos
		 * Crearemos variables de todos ellos
		 */
		
		//declaro una variable del tipo boolean
		boolean tieneCarnetDeConducir;
		
		//guardo un dato en la variable
		tieneCarnetDeConducir = true;
		
		//Se puede hacer en una sola linea
		boolean hayToner = false;
		
		System.out.println( tieneCarnetDeConducir );
		
		
		/*
		 * Tipos char y String
		 */
		char letra = 'A';
		
		System.out.println( letra ); //imprimimos la letra
		System.out.println( (int) letra); //imprimimos el código ASCII de la letra
		
		letra = '\t';  //guardo la tecla tabulador
		letra = '\n';  //tecla intro (cambio de linea)
		
		String frase = "Buenos días \nclase";
		String vacio = "";
		
		System.out.println( frase );
		
		/*
		 * Variables enteras
		 */
		
		byte pequeña;
		short mediana;
		int grande;
		long familiar;
		
		pequeña = 127;
		mediana = 32000;
		grande = 383874848;
		familiar = 123812862332432678L;
		
		mediana = (short) (32000 + pequeña); //hacer un cast (castear)
		
		/*
		 * variables con decimales
		 */
		
		double muchaPrecision = 2837483.234234;
		float pocaPrecision = 29384823.2323423F;
		
		System.out.println( pocaPrecision + muchaPrecision);
		System.out.println( (int) (pocaPrecision + muchaPrecision) );
	}
	
}










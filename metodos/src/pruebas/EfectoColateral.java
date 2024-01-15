package pruebas;

public class EfectoColateral {

	public static void main(String[] args) {
		// probar que pasa cuando el parámetro en un dato referenciado
		
		StringBuilder frase = new StringBuilder("Hola, buenos dias");
		StringBuilder resultado;
		
		resultado = añadirPuntoFinal2(frase);
		
		System.out.println(resultado);
		System.out.println(frase);
	}

	
	//método que añade un punto al final de la frase
	public static StringBuilder añadirPuntoFinal(StringBuilder texto) {
		texto.append(".");
		return texto;
	}
	
	//el mismo método pero sin que modifique el dato original
	public static StringBuilder añadirPuntoFinal2(StringBuilder texto) {
		StringBuilder nuevo = new StringBuilder(texto);
		nuevo.append(".");
		return nuevo;
	}
	
}
	





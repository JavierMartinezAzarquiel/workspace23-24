package pruebas;

public class Palabras {

	public static void main(String[] args) {
		String frase = "Hola, buenos dias";

		System.out.println("La última palabra es: " + ultimaPalabra(frase) );
//		System.out.println("Total vocales: " + cuentaVocales(frase) );
	}

	
	//método que recibe una frase y retorna la última palabra
	public static String ultimaPalabra(String frase) {
		int lugarUltimoEspacio = frase.lastIndexOf(' ');
		if(lugarUltimoEspacio == -1) {
			return frase;
		}else {
			return frase.substring(lugarUltimoEspacio +1);
		}
	}
	
	//método que recibe una frase y calcula cuantas vocales hay
	
	
}

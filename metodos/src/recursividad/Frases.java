package recursividad;

public class Frases {

	public static void main(String[] args) {
		String frase = "Hola, buenos dias";
		System.out.println("Total vocales: " + cuentaVocales(frase) );
	}

	//método recursivo para contar vocales
	public static int cuentaVocales(String texto) {
		String vocales = "aeiouAEIOU";
		
		if (texto.length() == 0) { //facil
			return 0;
		} else {
			//sacar la primera letra
			char letra = texto.charAt(0);
			//me quedo con el resto de la frase
			String resto = texto.substring(1);
			if(vocales.indexOf(letra) != -1 ){ //si la letra es una vocal
				return 1 + cuentaVocales(resto);
			}else {
				return 0 + cuentaVocales(resto);
			}
		}
	}
	
	//método que recibe una frase y calcula cuantas vocales hay
//	public static int cuentaVocales(String texto) {
//		int contador = 0;
//		String vocales = "aeiouAEIOU";
//		for (int i = 0; i < texto.length(); i++) {
//			if(vocales.indexOf( texto.charAt(i) ) != -1 ) {
//				contador++;
//			}
//		}
//		return contador;
//	}
}

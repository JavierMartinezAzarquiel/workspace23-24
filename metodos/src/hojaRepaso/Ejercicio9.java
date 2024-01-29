package hojaRepaso;

public class Ejercicio9 {

	/*
	 * 9.	Realiza un m�todo que comprueba si una matricula de coche est� bien escrita. 
	 *      Recibir� un String con el texto de la matricula y retornar� verdadero o falso.

			Las matriculas validas son:
			-	Cuatro cifras seguidas de tres letras. 5647FHY
			-	Una letra seguida de cuatro cifras y despu�s una o dos letras. M9483ZD
			-	Dos letras seguidas de cuatro cifras y despu�s una o dos letras. TO4536AC

	 */
	public static void main(String[] args) {
		
		System.out.println( comprobarMatricula( "5647FHY" ) );
		System.out.println( comprobarMatricula( "M9483ZD" ) );
		System.out.println( comprobarMatricula( "TO4536AC" ) );

	}
	
	public static boolean comprobarMatricula(String matricula) {
		
		if(matricula.length()<6 || matricula.length()>8) {
			return false;
		}
		
		if( Character.isDigit(matricula.charAt(0))){ //matricula moderna
			if( sonNumeros(matricula.substring(0,4)) && sonLetras(matricula.substring(4))){
				return true;
			}else {
				return false;
			}
		}else if( sonLetras(matricula.substring(0,2))) { //matricula con dos letras al principio
			if( sonNumeros(matricula.substring(2,6)) && sonLetras(matricula.substring(6))){
				return true;
			}else {
				return false;
			}
		}else { //matricula con una letra al principio
			if( sonLetras(matricula.substring(0,1)) && sonNumeros(matricula.substring(1,5)) 
					&& sonLetras(matricula.substring(5)) ){
				return true;
			}else {
				return false;
			}
		}
	}
	
	public static boolean sonNumeros( String frase) {
		for (int i = 0; i < frase.length(); i++) {
			if(! Character.isDigit( frase.charAt(i)) ) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean sonLetras( String frase) {
		for (int i = 0; i < frase.length(); i++) {
			if(! Character.isLetter( frase.charAt(i)) ) {
				return false;
			}
		}
		return true;
	}

}

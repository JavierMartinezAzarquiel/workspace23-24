package hojaDeEjercicios;

public class Ejercicio9 {

	/*
	 * Escribe el método inverso(), que recibe un numero y retorna el inverso (si recibe
		el 1234 da como retorno el 4321). Prohibido usar método reverse().
	 */
	
	public static void main(String[] args) {
		System.out.println(inverso2(1234));

	}
	
	
	public static int inverso(int numero) {
		return Integer.parseInt(new StringBuilder(String.valueOf(numero)).reverse().toString());
	}

	public static int inverso2(int numero) {
		String texto = String.valueOf(numero);
		String resultado = "";
		
		for (int i = 0; i < texto.length(); i++) {
			resultado = texto.charAt(i) + resultado;
		}
		
		return Integer.parseInt(resultado);
	}
}

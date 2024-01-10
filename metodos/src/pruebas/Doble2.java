package pruebas;

public class Doble2 {

	public static void main(String[] args) {
		int valorResultado;
		
		valorResultado = doble(7);
		System.out.println(valorResultado);
		
		System.out.println( doble(10) );
	}

	
	//método que recibe un dato y calcula el doble
	public static int doble(int dato) {
		int resultado;
		resultado = dato * 2;
		//ahora vuelvo y ofrezco el resultado
		return resultado;
	}
}

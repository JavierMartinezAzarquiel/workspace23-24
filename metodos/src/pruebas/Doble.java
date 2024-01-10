package pruebas;

public class Doble {

	public static void main(String[] args) {
		// Probar un método que calcule el doble de un numero
		int numero = 7;
		PruebaMetodos.saludar();
		doble(5);
		doble(numero);
	}
	
	
	//método que recibe un dato e imprime el doble
	public static void doble(int dato) {
		System.out.println("El doble es: " + (dato*2) );
	}
}

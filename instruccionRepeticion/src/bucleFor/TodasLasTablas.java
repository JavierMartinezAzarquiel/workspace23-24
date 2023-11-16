package bucleFor;

public class TodasLasTablas {

	public static void main(String[] args) {
		// Mostramos todas las tablas del 1 al 10
		
		
		for (int numero = 1; numero <= 10 ; numero++) {
			System.out.println("\nTabla del " + numero);
			for (int i = 0; i <= 10; i++) {
				System.out.println(numero + " x " + i + " = " + numero*i);
			}
		}
		

	}

}

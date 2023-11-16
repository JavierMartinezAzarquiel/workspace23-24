package bucleFor;

public class PruebaFor {

	public static void main(String[] args) {
		/*
		 * Prueba del bucle FOR
		 * 
		 *   for( inicialización ; condición de final ;  incremento){
		 *   		instrucciones;
		 *   }
		 */

		
		//repetición para escribir "Hola" 5 veces
		
//		for (int i = 1; i <= 5 ; i++) {
//			System.out.println("Hola");
//		}
//		
		//Imprimir la vuelta por la que voy
//		for (int i = 0; i <= 5 ; i++) {
//			System.out.println("Vuelta: " + i);
//		}
		
		//Contando del revés
//		for (int i = 5; i >= 1 ; i--) {
//			System.out.println("Vuelta: " + i);
//		}
		
		//contando de 2 en 2
//		for (int i = 1; i <= 10 ; i += 2) {
//			System.out.println("Vuelta: " + i);
//		}
		
		//contando de 0.5 en 0.5
		for (double i = 0; i <= 5 ; i += 0.5) {
			System.out.println("Vuelta: " + i);
		}
		
		for(;;) { //bucle infinito
			
		}
	}

}

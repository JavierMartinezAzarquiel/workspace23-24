package examen1ªEv1ªParte;

public class Ejercicio1 {
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			if(i%5 == 1) {
				continue;
			}
			if(i%7 == 1) {
				break;
			}
			System.out.println(i);
		}
	}

	/*  Soluci�n
	 *  
	 *  Vuelta i=1
	 *  	- primera condici�n i%5 es verdadera, se ejecuta continue y no imprime nada
	 *  Vuelta i=2
	 *  	- no se cumple ninguna condici�n, se imprime 2
	 *  Vuelta i=3
	 *  	- no se cumple ninguna condici�n, se imprime 3
	 *  Vuelta i=4
	 *  	- no se cumple ninguna condici�n, se imprime 4
	 *  Vuelta i=5
	 *  	- no se cumple ninguna condici�n, se imprime 5
	 *  Vuelta i=6
	 *  	- primera condici�n i%5 es verdadera, se ejecuta continue y no imprime nada
	 *  Vuelta i=7
	 *  	- no se cumple ninguna condici�n, se imprime 7
	 *  Vuelta i=8
	 *  	- segunda condici�n i%7 es verdadera, se ejecuta break y todo termina
	 * 
	 */
}

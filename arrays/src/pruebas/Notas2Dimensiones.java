package pruebas;

public class Notas2Dimensiones {

	public static void main(String[] args) {
		// Preparar un array con las notas de las 3 evaluaciones
		
		//Tendríamos 7 notas por 3 evaluaciones, en total 21 notas
//		int[] notas = new int[21];
//		int[][] notas = new int[3][7];
		int[][] notas = { {8, 5, 3, 7, 9, 5, 10}, 
				          {7, 6, 2, 4, 8, 6, 9},
				          {9, 8, 4, 5, 9, 6, 9}};
		
		System.out.println("Tamaño del array: " + notas.length);
		System.out.println("Tamaño de la fila 0: " + notas[0].length);
		System.out.println("Tamaño de la fila 1: " + notas[1].length);
		System.out.println("Tamaño de la fila 2: " + notas[2].length);
//		System.out.println("Tamaño del hueco 0,3:" + notas[0][3]);
		
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.print(notas[i][j] + " ");
			}
			System.out.println();
		}
		
		//Contar cuantos aprobados hay
		int aprobados = 0;
		for (int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					aprobados++;
				}
			}
		}
		System.out.println("Total aprobados: " + aprobados);
		
		/*
		 * Media de cada evaluación
		 *  	Media 1ªEv: 6.8
		 *   	Media 2ªEv: 7.3
		 *    	Media 3ªEv: 7.4
		 */
		
		System.out.println("Media de cada evaluación");
		
	}

}





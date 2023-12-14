package hojaDeEjercicios;

public class Ejercicio8 {

	public static void main(String[] args) {
		/*
		 * 8. Comprobar si un array de 5x5 es un cuadro mágico. Se considera un cuadro
				mágico aquel en el que las filas, las columnas y las diagonales suman igual.

				15 8 1 24 17
				16 14 7 5 23
				22 20 13 6 4
				3 21 19 12 10
				9 2 25 18 11
		 */

		int[][] a = {   {15,  8,  1, 24, 17},
						{16, 14,  7,  5, 23},
						{22, 20, 13,  6,  4},
						{ 3, 21, 19, 12, 10},
						{ 9,  1, 25, 18, 11} };


		boolean magico = true; //flag 

		int diagonalPrincipal = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==j) {
					diagonalPrincipal += a[i][j];
				}
			}
		}
		System.out.println("Diagonal Principal: " + diagonalPrincipal);

		int diagonalSecundaria = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i+j == 4) {
					diagonalSecundaria += a[i][j];
				}
			}
		}
		System.out.println("Diagonal Secundaria: " + diagonalSecundaria);
		//si las dos diagonales no suman lo mismo, bajo la bandera
		if(diagonalPrincipal != diagonalSecundaria) {
			magico = false;  
		}

		//suma filas
		for (int i = 0; i < a.length && magico; i++) {
			int suma = 0;
			for (int j = 0; j < a[i].length; j++) {
				suma += a[i][j];
			}
			System.out.println("Fila " + i + ": " + suma);
			if(suma != diagonalPrincipal) {
				magico = false;
			}
		}
		//suma columnas
		for (int j = 0; j < a[0].length && magico; j++) {
			int suma = 0;
			for (int i = 0; i < a.length; i++) {
				suma += a[i][j];
			}
			System.out.println("Columna " + j + ": " + suma);
			if(suma != diagonalPrincipal) {
				magico = false;
			}
		}

		if(magico) {
			System.out.println("Es cuadro mágico");
		}else {
			System.out.println("No es cuadro mágico");
		}
	}

}

package hojaDeEjercicios;


public class Ejercicio11 {

	public static void main(String[] args) {
		/*
		 * 
		 * Elabora un programa al que se le pasa un array de 2 dimensiones y averigua si es
			simétrica, retornando un valor booleano. Un array es simétrico si contiene los
			mismos valores por encima y por debajo de la diagonal principal.
			
						1 4 6 2 9
						4 8 5 5 3
						6 5 4 7 2
						2 5 7 9 4
						9 3 2 4 3
		 * 
		 */
		
		
		int[][] a={{1,4,6,2,9},
				   {4,8,5,5,3},
				   {6,5,4,7,2},
				   {2,5,7,9,4},
				   {9,3,2,4,3}};
		
		boolean simetrico=true;
	
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j] != a[j][i]){   // si encontramos una pareja diferente
					simetrico=false;
				}
			}
		}

		if(simetrico) {
			System.out.println("SI es simetrico");
		}else {
			System.out.println("No es simetrico");
		}
	}



}

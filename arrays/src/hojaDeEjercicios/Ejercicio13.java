package hojaDeEjercicios;

import java.util.ArrayList;

public class Ejercicio13 {

	public static void main(String[] args) {
		/*
		 * Crea un programa que almacene un array bidimensional (6x6) con pocos valores
			en un array unidimensional. En el array unidimensional vamos almacenando
			cada valor original junto con su fila y columna, es decir por cada valor del array
			original almacenamos tres valores en el resultado.
			
					Array original
					0 0 0 0 0 0
					0 0 0 0 5 0
					0 8 0 0 0 9
					0 0 0 0 0 0
					0 0 0 7 0 0
					0 0 3 0 0 0
					
					Array resultado
					5 1 4 8 2 1 9 2 5 7 4 3 3 5 2
		 */
		
		int[][] a={ {0,0,0,0,0,0},
					{0,0,0,0,5,0},
					{0,8,0,0,0,9},
					{0,0,0,0,0,0},
					{0,0,0,7,0,0},
					{0,0,3,0,0,0}};
		
		ArrayList<Integer> resultado=new ArrayList<Integer>();

		for(int i=0;i<a.length;i++){       //recorrido de filas
			for(int j=0;j<a[i].length;j++){   //recorrido de columnas
				if(a[i][j]!=0){  // si el elemento contiene un valor distinto de cero
					resultado.add(a[i][j]);  //añadimos el valor del elemento
					resultado.add(i);        //añadimos el numero de fila
					resultado.add(j);        //añadimos el numero de columna
				}
			}
		}

		System.out.println(resultado);


	}

}

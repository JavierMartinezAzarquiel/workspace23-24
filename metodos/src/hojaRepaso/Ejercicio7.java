package hojaRepaso;

import java.util.ArrayList;

public class Ejercicio7 {

	public static void main(String[] args) {
		int[][] array ={{7,3,3,0},
						{6,8,5,4},
						{4,9,1,7},
						{4,5,2,4}};
		
		invertirDiagonal2(array);
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}

	}
	
	public static void invertirDiagonal(int[][] array) {
		for (int i = 0; i < array.length/2; i++) {
			int aux=array[i][i];
			array[i][i] = array[array.length-1-i][array.length-1-i];
			array[array.length-1-i][array.length-1-i] = aux;
		}
	}
	
	public static void invertirDiagonal2(int[][] array) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j) {
					lista.add(array[i][j]);
				}
			}
		}
		
		int index=lista.size()-1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if(i==j) {
					array[i][j] = lista.get(index);
					index--;
				}
			}
		}
		
	}

}

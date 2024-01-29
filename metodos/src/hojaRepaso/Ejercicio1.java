package hojaRepaso;

import java.util.Arrays;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		int[][] array = new int[3][5];
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = (i+1)*10 + (j+1);
			}
		}

		for (int[] is : array) {
			System.out.println(Arrays.toString(is));
		}
		
	}

}

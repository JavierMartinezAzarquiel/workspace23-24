package hojaRepaso;

public class Ejercicio3 {

	public static void main(String[] args) {
		int[] original = {32,45,12,95,39,72};
		
		
		insertar(original, 33, 4);
		
		for (int i = 0; i <original.length; i++) {
			System.out.print(original[i]+" ");
		}
	}
	
	public static void insertar(int[] array, int valor, int posicion) {
		
		
		for (int i = array.length-2; i >= posicion; i--) { //copiar los datos que hay detra del punto de insercion
			array[i+1] = array[i];
		}
		array[posicion] = valor;  //inserto el valor
		
		
	}

}

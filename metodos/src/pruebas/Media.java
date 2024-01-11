package pruebas;

public class Media {

	public static void main(String[] args) {
		
		System.out.println(media(5, 4, 6, 8));
	}
	
	//métodos para calcular la media de todos los valores que le pasamos por parámetro
	
	public static double media(int num1, int num2) {
		return (double)(num1 + num2)/2;
	}
	
	public static double media(double num1, double num2) {
		return (num1 + num2)/2;
	}
	
	public static double media(double... numeros) {
		double total = 0;
		for (double d : numeros) {
			total += d;
		}
		return total / numeros.length;
	}
}

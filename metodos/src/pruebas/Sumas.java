package pruebas;

public class Sumas {

	public static void main(String[] args) {
		
		System.out.println( suma(4, 7.46, 8, 4, 3, 9.34, 8) );
	
	}

	
	//método que suma dos números que le paso por parámetro
	public static  int  suma(int num1, int num2) {
		int resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	public static  double  suma(double num1, double num2) {
		double resultado;
		resultado = num1 + num2;
		return resultado;
	}
	
	public static  double  suma(double num1, double num2, double num3) {
		double resultado;
		resultado = num1 + num2 + num3;
		return resultado;
	}
	
	public static double suma(double... numeros) {
		double resultado = 0;
		for (double d : numeros) {
			resultado += d;
		}
		return resultado;
	}
	
}






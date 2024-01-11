package pruebas;

public class MayorDe2 {

	public static void main(String[] args) {
		
		System.out.println( mayor(34, 28, 23.45, 39, 62) );

	}

	
	//método al que pasamos dos números y nos retorna el mayor
	public static double mayor(double numero1, double numero2) {
		if (numero1 > numero2) {
			return numero1;
		} else {
			return numero2;
		}
	}
	
	//mayor de 3
	public static double mayor(double numero1, double numero2, double numero3) {
		return mayor( mayor(numero1, numero2), numero3);
	}
	
	//parámetros infinitos
	public static double mayor(double... numeros) {
		double max = Double.MIN_VALUE;
		for (double d : numeros) {
			if (d > max) {
				max = d;
			}
		}
		return max;
	}
	
	
	
}






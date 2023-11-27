package pruebas;

public class Temperaturas {

	public static void main(String[] args) {
		// Crear un Array con las temperaturas de la semana
		
		double[] temperaturas = {14, 12, 13.4, 16, 11, 14.6, 15};

		
		//calcular la temperatura media de la semana
		double suma = 0;
		for (int i = 0; i < temperaturas.length; i++) {
			suma += temperaturas[i];
		}
		double media = suma / temperaturas.length;
		System.out.println("La media de temperaturas es: " + media);
		
		
		//Averiguar la temperatura máxima
		double maximo = temperaturas[0];  //la máxima de momento es la primera
		for (int i = 1; i < temperaturas.length; i++) {
			if (temperaturas[i] > maximo) {
				maximo = temperaturas[i];
			}
		}
		System.out.println("La temperatura máxima fué: " + maximo);
		
		//Averigura que día fue la temperatura mínima
		int minimo = 0; //de momento, el día mas frio fué el lunes
		for (int i = 1; i < temperaturas.length; i++) {
			if(temperaturas[i] < temperaturas[minimo]) {
				minimo = i;
			}
		}
		System.out.println("El día mas frío fué el: " + minimo);
		String[] dias = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
		System.out.println("El día mas frío fué el: " + dias[minimo]);
	}

}






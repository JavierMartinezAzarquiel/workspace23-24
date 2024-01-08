package pruebaArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Temperaturas {

	public static void main(String[] args) {
		// Guardamos temperaturas en un ArrayList
		
		ArrayList<Double> temperaturas = new ArrayList<Double>(Arrays.asList(8.4, 10.3, 12.5, 11.0, 11.3, 10.6, 9.9)); 

		//Sacar la media de las temperaturas
		double media, suma = 0;
		for (Double double1 : temperaturas) {
			suma += double1;
		}
		media = suma / temperaturas.size();
		System.out.println("Temperatura media: " + media);
		
		//temperatura máxima
		double maximo = Double.MIN_VALUE;
		for (Double valor : temperaturas) {
			if(valor > maximo) {
				maximo = valor;
			}
		}
		System.out.println("La temperatura máxima fué: " + maximo);
		
		//¿Que dia fué el mas caluroso?
		int diaMaximo = 0; //El mas caluroso de momento es el lunes
		for (int i = 1; i < temperaturas.size(); i++) {
			if(temperaturas.get(i) > temperaturas.get(diaMaximo) ) {
				diaMaximo = i;
			}
		}
		ArrayList<String> dias = new ArrayList<String>(Arrays.asList("Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"));
		System.out.println("El dia mas caluroso fué el: " + dias.get(diaMaximo));
		
		
	}

	
	
}








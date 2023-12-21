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
		
		//¿Que dia fué el mas caluroso?
		
	}

}

package pruebaArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class PruebaArrayList {

	
	
	public static void main(String[] args) {
		// probando la estructura dinámica ArrayList

		
		ArrayList lista = new ArrayList();  //creo un ArrayList vacío
		
		lista.add("Hola");
		lista.add(49);
		lista.add(35.23);
		lista.add(true);
		
		System.out.println( lista );
		
		//declarar una lista con un tipo fijo de datos (tipado)
		ArrayList<String> nombres = new ArrayList<String>();
		
		nombres.add("Juan");
		nombres.add("Carla");
		nombres.add("Sandra");
		nombres.add("Raul");
		System.out.println(nombres);
//		ArrayList<Object> datos = new ArrayList<Object>(); //estructura genérica
//		datos.add("Buenos dias");
		
		//añadir nombres en una posición concreta
		nombres.add(2,"Ana");
		System.out.println(nombres);
		
		//quitar un objeto y sustituirlo por otro
		nombres.set(1, "Luis");
		System.out.println(nombres);
		
		//borrar un objeto
		nombres.remove(3);
//		nombres.remove("Ana");
//		nombres.clear();
		System.out.println(nombres);
		
		//recorrer un ArrayList
		for (int i = 0; i < nombres.size(); i++) {
			System.out.println(nombres.get(i));
		}
		
		//foreach
		for (String string : nombres) {
			System.out.println(string);
		}
		
		//con un Iterador
		for (Iterator iterator = nombres.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		
		//ArrayList multimensional
		ArrayList<ArrayList<String>> matriz = new ArrayList<ArrayList<String>>();
		
		
		//buscar dentro de un ArrayList
		System.out.println("Luis está en la posición: " + nombres.indexOf("Luis"));
		System.out.println("¿Está Ana?: " + nombres.contains("Ana"));
		
		//Ordenar un ArrayList
		Collections.sort(nombres);
		System.out.println(nombres);
		
		//convertir un array clásico en un ArrayList
		String[] array = {"Ángel", "Marta", "Carlos"};
		ArrayList<String> listaNombres = new ArrayList<String>( Arrays.asList(array) );
		System.out.println(listaNombres);
		
		//convertir de un ArrayList a un Array clásico
		Object[] array2 = listaNombres.toArray();
	}

}

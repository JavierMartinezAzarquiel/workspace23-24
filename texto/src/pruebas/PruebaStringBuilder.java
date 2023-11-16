package pruebas;

public class PruebaStringBuilder {

	public static void main(String[] args) {
		// Probando la clase StringBuilder
		
		String s = "Hola que tal";
		
		// Lo mismo pero con StringBuilder
		StringBuilder sb1 = new StringBuilder();  //vacío
		StringBuilder sb2 = new StringBuilder("Hola"); //con un texto dentro
		StringBuilder sb3 = new StringBuilder(500); //con una capacidad
		StringBuilder sb4 = new StringBuilder(s); //contiene un String dentro
		
		//comprobar la capacidad de cada variable
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		System.out.println(sb4.capacity());

		//diferencia entre trabajo con String y Strinbuilder
		//para unir dos frases
		String s1 = "Hola";
		String s2 = " que tal";
		
		s1 = s1.concat(s2);  //uno las dos frase, pero tengo que poner donde se guarda
		System.out.println(s1);
		
		sb1 = new StringBuilder("Hola");
		sb2 = new StringBuilder(" que tal");
		
		sb1.append(sb2);  //ahora no hay que poner donde queda, porque se usa el objeto actual
		System.out.println(sb1);
		
		
		//comparar una frase con otra
		s1 = "Hola";
		s2 = "Hola";
		
		if (s1.equals(s2)) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		sb1 = new StringBuilder("Hola");
		sb2 = new StringBuilder("Hola");
		if (sb1.toString().equals(sb2.toString())) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son diferentes");
		}
		
		//convertir una variable en otra
		
		//de String a StringBuilder
		sb1 = new StringBuilder(s1);
		
		//de StringBuilder a String
		s1 = sb1.toString();
	}

}









package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un numero: ");
		float numero = teclado.nextFloat();
		System.out.print("¿Cuantos decimales dejamos?: ");
		int decimales = teclado.nextInt();

		System.out.println("Número redondeado: " + redondear(numero, decimales));
		System.out.println("Número redondeado: " + redondear2(numero, decimales));
	}
	
	/*
	 * Realiza un método redondear() al que se le pasa como parámetro un numero float
		y los decimales que deben quedar después de redondear, y retorna el numero
		redondeado.
		
		Ejemplo: redondear( 234.49234 , 3 )
		Da como resultado : 234.492
	 */
	public static float redondear(float numero, int decimales) {
		String s = String.valueOf(numero);  //convierto el numero en String
		int lugarPunto = s.indexOf('.');  //buscamos la posición del punto
		
		if(lugarPunto + decimales <= s.length()-1) { //si hay decimales suficientes
			String resultado = s.substring(0, lugarPunto + decimales + 1);
			return Float.parseFloat(resultado);
		}else {
			return numero;
		}
	}			

	public static float redondear2(float numero, int decimales) {
		numero *= (float)Math.pow(10, decimales); //multiplico el numero 
		numero = Math.round(numero);
		numero /= (float)Math.pow(10, decimales);
		return numero;
	}
	
	
}

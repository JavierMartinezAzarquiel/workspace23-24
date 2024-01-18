package hojaDeEjercicios;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Teclea un número: ");
		int a = teclado.nextInt();
		System.out.println("En romano es: " + romano2(a));

	}

	
	public static String romano(int numero) {
		String resultado = "";
		
		int decenas = numero/10;
		int unidades = numero%10;
		
		switch (decenas) {
		case 1:resultado = resultado.concat("X");break;
		case 2:resultado = resultado.concat("XX");break;
		case 3:resultado = resultado.concat("XXX");break;
		case 4:resultado = resultado.concat("XL");break;
		case 5:resultado = resultado.concat("L");break;
		case 6:resultado = resultado.concat("LX");break;
		case 7:resultado = resultado.concat("LXX");break;
		case 8:resultado = resultado.concat("LXXX");break;
		case 9:resultado = resultado.concat("XC");break;
		}
		
		switch (unidades) {
		case 1:resultado = resultado.concat("I");break;
		case 2:resultado = resultado.concat("II");break;
		case 3:resultado = resultado.concat("III");break;
		case 4:resultado = resultado.concat("IV");break;
		case 5:resultado = resultado.concat("V");break;
		case 6:resultado = resultado.concat("VI");break;
		case 7:resultado = resultado.concat("VII");break;
		case 8:resultado = resultado.concat("VIII");break;
		case 9:resultado = resultado.concat("IX");break;
		}
		
		return resultado;
	}
	
	public static String romano2(int numero) {
		String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
		String[] decenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
		
		return decenas[numero/10] + unidades[numero%10];
	}
	
}

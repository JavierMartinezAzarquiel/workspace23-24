package hojaDeEjercicios;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Ejercicio10 {

	public static void main(String[] args) {
		/*
		 * Programa que simule el juego del ahorcado. Elegimos una palabra y vamos
			pidiendo letras al usuario. Cada vez mostramos la palabra solo con las letras
			acertadas. Si no acierta todas las letras en 8 intentos, se da el juego por
			perdido.
		 */

		Scanner teclado = new Scanner(System.in);
		String palabra;
		int fallos = 0;
		
		//Pedir la palabra secreta
		JPasswordField jpf = new JPasswordField();
		JOptionPane.showConfirmDialog(null, jpf, "Palabra secreta",JOptionPane.CLOSED_OPTION);
		palabra = String.valueOf(jpf.getPassword());
		
		//variable para poner los guiones
		StringBuilder adivinado = new StringBuilder();
		
		//relleno la variable adivinado con los guiones
		for (int i = 0; i < palabra.length(); i++) {
			adivinado.append("-");
		}
		
		
		// Mientras tenga vidas y no haya acertado la palabra completa
		while ( fallos < 8  &&  !palabra.equalsIgnoreCase(adivinado.toString()) ) {
			
			//muestro los guiones
		    //pido una letra
			//busco la letra en la palabra
			//si la encuentro
				//cambio los guiones por la letra
			//sino
				//un fallo mas
			
		}
		
	}

}








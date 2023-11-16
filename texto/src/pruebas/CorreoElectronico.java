package pruebas;

import java.util.Scanner;

public class CorreoElectronico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		String correo;
		int lugarArroba;
		
		System.out.print("Teclea tu nombre correo: ");
		correo = teclado.nextLine();
		
		//Buscar donde está la arroba
		lugarArroba = correo.indexOf('@');
		
		if (lugarArroba == -1) {
			System.out.println("Error: No hay ninguna @");
		}else if ( correo.substring(0, lugarArroba).length() < 4) {  //comprobar si el nombre tiene minimo 4 letras
			System.out.println("Error: Nombre demasiado corto");
		}else if ( correo.substring(lugarArroba + 1 ).indexOf('.') == -1) { //comprobar si en el dominio hay un punto
			System.out.println("Error: No hay un punto en el dominio");
		}else if (!correo.endsWith(".es") && !correo.endsWith(".com") ) { //comprobar que acaba en ".es" o ".com"
			System.out.println("Error: No acaba bien");
		}else {
			System.out.println("Correo Correcto");
		}
	}

}













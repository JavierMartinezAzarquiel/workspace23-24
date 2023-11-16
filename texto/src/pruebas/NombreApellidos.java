package pruebas;

import java.util.Scanner;

public class NombreApellidos {

	public static void main(String[] args) {
		/* Pido por teclado un nombre completo
		y retorno:
		
		
			Nombre:
			Apellido1:
			Apellido2:
			
			Si solo ha escrito una palabra o dos palabras, dará error
		*/
		
		Scanner teclado = new Scanner(System.in);
		
		String nombreCompleto, nombre, apellido1, apellido2;
		int lugarPrimerEspacio, lugarSegundoEspacio;
		
		System.out.print("Teclea tu nombre completo: ");
		nombreCompleto = teclado.nextLine();
		
		//buscar donde están los espacios
		lugarPrimerEspacio = nombreCompleto.indexOf(' ');
		lugarSegundoEspacio = nombreCompleto.lastIndexOf(' ');
		
		if (nombreCompleto.isEmpty()) {  // .isBlank() para cuando hay espacios
			System.out.println("Error: Campo vacío");
		}else if (lugarPrimerEspacio == -1) {//comprobamos si no hay ningún espacio
			System.out.println("Error: Solo has escrito una palabra");
		}else if (lugarPrimerEspacio == lugarSegundoEspacio) { //solo hay un espacio
			System.out.println("Error: Falta un apellido");
		}else {
			//todo correcto, troceamos la frase
			nombre = nombreCompleto.substring(0, lugarPrimerEspacio);
			apellido1 = nombreCompleto.substring(lugarPrimerEspacio + 1, lugarSegundoEspacio);
			apellido2 = nombreCompleto.substring(lugarSegundoEspacio + 1);
			
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellido1: " + apellido1);
			System.out.println("Apellido2: " + apellido2);
		}

	}

}









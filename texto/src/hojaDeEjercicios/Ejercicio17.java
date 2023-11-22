package hojaDeEjercicios;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Ejercicio17 {

	public static void main(String[] args) {
		/*
		 * Realiza un programa que averigüe cuantas asignaturas tiene aprobadas un
			alumno. El programa debe leer un String con el nombre de las asignaturas y
			después otro String con la lista de sus notas. Debe dar como resultado el
			nombre de las asignaturas aprobadas. Tanto la lista de asignaturas como la
			lista de notas utilizan el símbolo ‘:’ como separador.
					Ejemplo de funcionamiento del programa:
					Escribe la lista de asignaturas: “Matemáticas:Literatura:Historia:Inglés”
					Escribe la lista de notas: 7:4:10:3
					Las asignaturas aprobadas son: Matemáticas Historia
			Suponemos que las listas de asignaturas y de notas están bien formadas, es
			decir siempre habrá unos ‘:’ entre una asignatura y otra o una nota y otra.
			Además siempre existirá el mismo número de notas que de asignaturas. El
			número de asignaturas no es fijo, pueden ser 4, 5, 6 o más.
		 */

		Scanner teclado = new Scanner(System.in);

		String materias, notas, materia, nota, resultado = "";
		
		System.out.print("Escribe la lista de materias: ");
		materias = teclado.nextLine();
		System.out.print("Escribe la lista de notas: ");
		notas = teclado.nextLine();
		
		StringTokenizer listaMaterias = new StringTokenizer(materias, ":");
		StringTokenizer listaNotas = new StringTokenizer(notas, ":");
		
		while (listaNotas.hasMoreTokens()) { //mientras queden notas en la lista
			
			//pido una materia y una nota
			materia = listaMaterias.nextToken();
			nota = listaNotas.nextToken();
			
			//si la nota es >=5 añado la materia a resultado
			if(Integer.parseInt(nota) >= 5) {
				resultado += materia + " ";
			}
		}
		
		System.out.println("Materias aprobadas: " + resultado);
	}

}

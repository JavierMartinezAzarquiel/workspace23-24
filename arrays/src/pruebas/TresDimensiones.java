package pruebas;

import java.util.Iterator;

public class TresDimensiones {

	public static void main(String[] args) {
		/*
		 * Ejemplo de array de tres dimensiones
		 * 
		 * Organizar los datos de los alumnos de la universidad.
		 * Filas: Datos de cada grado
		 * Columna: Cursos de 1º a 4º
		 * Profundidad: Sexo de los alumnos(hombre, mujer)
		 */
		
		int[][][] datos = { { {20,22}, {19,21}, {20,18}, {22,23} },
				            { {23,21}, {18,22}, {19,19}, {20,19} },
				            { {16,19}, {18,20}, {22,24}, {21,16} },
				            { {18,10}, {22,21}, {21,22}, {19,20} },
				            { {20,20}, {19,20}, {20,19}, {17,20} } };
		
		String[] grados = {"Derecho", "Informática", "Magisterio", "Física", "ADE"};
		String[] cursos = {"Primero", "Segundo", "Tercero", "Cuarto"};
		String[] sexo = {"Mujer", "Hombre"};
		
		/*
		 * Total alumnos en la universidad
		 * 
		 * Total: 800
		 */
		System.out.println("Total alumnos en la universidad");
		int suma = 0;
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma += datos[i][j][j2];
				}
			}
		}
		System.out.println("Total: " + suma);
		
		
		
		/*
		 * Listado de cuantos alumnos hay en cada grado
		 * 
		 * Derecho: 170
		 * Informática: 158
		 * ...
		 * ADE: 189
		 */
		System.out.println("Listado de cuantos alumnos hay en cada grado");
		for (int i = 0; i < datos.length; i++) {
			System.out.print(grados[i] + ": ");
			suma = 0;
			for (int j = 0; j < datos[i].length; j++) {
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma += datos[i][j][j2];
				}
			}
			System.out.println(suma);
		}
		
		/*
		 * Listado de alumnos por curso
		 * 
		 * Primero: 200
		 * Segundo: 180
		 * Tercero: 220
		 * Cuarto: 190
		 */
		
		System.out.println("Listado de alumnos por curso");
		for (int j = 0; j < datos[0].length; j++) {
			System.out.print(cursos[j] + ": ");
			suma = 0;
			for (int i = 0; i < datos.length; i++) {
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma += datos[i][j][j2];
				}
			}
			System.out.println(suma);
		}
		
		/*
		 * Alumnos por sexo
		 * 
		 * Mujer: 401
		 * Hombre: 403
		 * 
		 */
		System.out.println("Alumnos por sexo");
		for (int j2 = 0; j2 < datos[0][0].length; j2++) {
			System.out.print(sexo[j2] + ": ");
			suma = 0;
			for (int i = 0; i < datos.length; i++) {
				for (int j = 0; j < datos[i].length; j++) {
					suma += datos[i][j][j2];
				}
			}
			System.out.println(suma);
		}
		
		/*
		 * Lista de alumnos por grado y curso
		 * 
		 * Derecho: Primero: 40 Segundo: 38 Tercero: 39 Cuarto: 42
		 * Informática: Primero: 40 Segundo: 38 Tercero: 39 Cuarto: 42
		 * ....
		 */
		System.out.println("\nLista de alumnos por grado y curso");
		for (int i = 0; i < datos.length; i++) {
			System.out.print(grados[i] + ": ");
			
			for (int j = 0; j < datos[i].length; j++) {
				suma = 0;
				for (int j2 = 0; j2 < datos[i][j].length; j2++) {
					suma += datos[i][j][j2];
				}
				System.out.print(cursos[j] + ": " + suma + " ");
			}
			System.out.println();
		}
		
		/*
		 * Clase con mas diferencia entre Mujeres y Hombres
		 * 
		 * Tercero de Magisterio
		 * 
		 */
		System.out.println("Clase con mas diferencia entre Mujeres y Hombres");
		int iMaxDiferencia = 0, jMaxDiferencia = 0, maxDiferencia = 0; 
		for (int i = 0; i < datos.length; i++) {
			for (int j = 0; j < datos[i].length; j++) {
				if (Math.abs( datos[i][j][0] - datos[i][j][1] ) > maxDiferencia ){
					maxDiferencia = Math.abs( datos[i][j][0] - datos[i][j][1] );
					iMaxDiferencia = i;
					jMaxDiferencia = j;
				}
			}
		}
		System.out.println(cursos[jMaxDiferencia] + " de " + grados[iMaxDiferencia]);
	}

}





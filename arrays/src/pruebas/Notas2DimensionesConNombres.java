package pruebas;

public class Notas2DimensionesConNombres {

	public static void main(String[] args) {
		int[][] notas =  {  {8, 5, 3, 7, 9, 5, 10}, 
		          			{7, 6, 2, 4, 8, 6, 9},
		          			{9, 8, 4, 5, 9, 6, 9}  };
		String[] modulos = {"Leng.Marcas", "Inglés", "Programación", "BBDD", "FOL", "Sistemas", "Entornos"};
		String[] evaluaciones = {"1ªEv", "2ªEv", "3ªEv" };
				
		/*
		 * Listado de módulos aprobados en cada Evaluación
		 * 
		 * 1ªEv: Leng.Marcas Inglés BBDD FOL Sistemas Entornos
		 * 2ªEv: Leng.Marcas Inglés FOL Sistemas Entornos
		 * 3ªEv: Leng.Marcas Inglés BBDD FOL Sistemas Entornos
		 * 
		 */
		
		
		/*
		 * Média de cada módulo
		 * 
		 * Leng.Marcas: 8.0
		 * Inglés: 7.3
		 * Programación: 3.8
		 * ...
		 * Entornos: 9.4
		 * 
		 */
	
	
		/*
		 * Módulo con mejor media
		 * 
		 * Entornos: 9.4
		 * 
		 */
	
		/*
		 * Resultado Final (Si hay alguna evaluación suspensa, queda Pendiente)
		 * 
		 * Leng.Marcas: Aprobado
		 * Inglés: Aprobado
		 * Programación: Pendiente
		 * BBDD: Pendiente
		 * ....
		 * Entornos: Aprobado
		 */
	
	}

}

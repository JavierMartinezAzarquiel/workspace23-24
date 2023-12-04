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
		System.out.println("Listado de módulos aprobados en cada Evaluación");
		for (int i = 0; i < notas.length; i++) {
			System.out.print(evaluaciones[i] + ":");
			for (int j = 0; j < notas[i].length; j++) {
				if (notas[i][j] >= 5) {
					System.out.print(modulos[j] +" ");
				}
			}
			System.out.println();
		}
		
		/*
		 * Media de cada módulo
		 * 
		 * Leng.Marcas: 8.0
		 * Inglés: 7.3
		 * Programación: 3.8
		 * ...
		 * Entornos: 9.4
		 * 
		 */
		System.out.println("\nMedia de cada módulo");
		for (int j = 0; j < notas[0].length; j++){
			System.out.print(modulos[j] + ": ");
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			double media = (double)suma / notas.length;
			System.out.println(media);
		}
	
		/*
		 * Módulo con mejor media
		 * 
		 * Entornos: 9.4
		 * 
		 */
		System.out.println("\nMódulo con mejor media");
		int moduloMejorMedia = 0;
		double mejorMedia = 0;
		for (int j = 0; j < notas[0].length; j++){
			
			int suma = 0;
			for (int i = 0; i < notas.length; i++) {
				suma += notas[i][j];
			}
			double media = (double)suma / notas.length;
			if( media > mejorMedia) {
				mejorMedia = media;
				moduloMejorMedia = j;
			}
		}
		System.out.println(modulos[moduloMejorMedia] + ": " + mejorMedia);
	
		
	
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
	
		System.out.println("\nResultado Final");
		for (int j = 0; j < notas[0].length; j++){
			boolean flag = true;
			for (int i = 0; i < notas.length; i++) {
				if(notas[i][j] < 5) {
					flag = false;
				}
			}
			System.out.print(modulos[j] +": ");
			if (flag) {
				System.out.println("Aprobado");
			}else {
				System.out.println("Pendiente");
			}
		}
	}

}

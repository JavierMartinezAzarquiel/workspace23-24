package pruebas;

public class Notas {

	public static void main(String[] args) {
		// Trabajo con dos arrays simultaneos
		
		int[] notas = {8, 6, 10, 3, 5, 7};
		String[] modulos = {"Leng.Marcas", "Inglés", "Programación", "BBDD", "FOL", "Sistemas"};

		/*Listado de módulos aprobados
		 * 
		 * Módulos aprobados:
		 * 		Leng.Marcas
		 * 		Inglés
		 * 		Programación
		 * 		...
		 */
		System.out.println("Módulos aprobados:");
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= 5) {
				System.out.println("\t" + modulos[i]);
			}
		}
		
		/*Módulo favorito
		 * 
		 * Módulo favorito
		 * 		Programación
		 * 
		 */
		System.out.println("\nMódulo favorito:");
		int posicionMejorNota = 0; //de momento la mejor nota es la primera
		//comparo con el resto desde la 1 a la final
		for (int i = 1; i < notas.length; i++) {
			if (notas[i] > notas[posicionMejorNota]) {
				posicionMejorNota = i;
			}
		}
		System.out.println("\t" + modulos[posicionMejorNota]);
		
		/* Módulos por encima de la media
		 * 
		 * Módulos por encima de la media
		 * 		Leng.Marcas
		 * 		Programación
		 * 		Sistemas
		 */
		double media;
		int suma = 0;
		for (int i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		media = (double)suma / notas.length;
		System.out.println("Módulos por encima de la media: " + media );
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] > media) {
				System.out.println("\t" + modulos[i]);
			}
		}
	}

}







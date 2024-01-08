package hojaDeEjercicios;
import java.util.Arrays;
import java.util.Scanner;


public class Ejercicio14 {

	public static void main(String[] args){
		/*
		 * Programa que simule el juego de las minas. El programa rellenará de forma
			aleatoria un array de 5x5 con 10 minas. Una vez relleno, pedirá que escribamos
			coordenada y mostrará el mensaje MINA, en caso de haber pisado una, o bien un
			numero que indica cuantas minas hay alrededor.
						0 1 1 0 0
						1 0 1 0 1
						1 1 0 0 0
						0 0 0 0 1
						0 0 1 0 1
						
						Ejemplo:
						Coordenada Respuesta
						(1,4) MINA
						(1,1) 6
		 */
		
		Scanner teclado=new Scanner(System.in);
		int[][] tablero=new int[5][5];
		
		//rellenar tablero
		int contador=0;
		
		while( contador < 10 ){
			int fila=(int)(Math.random()*5);
			int columna=(int)(Math.random()*5);
			if(tablero[fila][columna] == 0){
				tablero[fila][columna] = 1;
				contador++;
			}
		}
		
		//imprimo el tablero para ver como ha quedado
		for (int i = 0; i < tablero.length; i++) {
			System.out.println(Arrays.toString(tablero[i]));
		}

		int f,c;
		char respuesta;
		do{
			do{
				System.out.println("\nEscribe una coordenada");
				System.out.print("Fila:");
				f=teclado.nextInt();
				System.out.print("Columna:");
				c=teclado.nextInt();
			}while(f<0||f>4||c<0||c>4);   // pedimos una coordenada

			if(tablero[f][c]==1){    // si esa coordenada esta ocupada
				System.out.print("MINA!!");  // escribimos mina!!
			}else{   // el lugar no esta ocupado
				int cuenta=0;   //al principio no hay ninguna mina

				if(f!=0) cuenta+=tablero[f-1][c];           //superior
				if(f!=tablero.length-1) cuenta+=tablero[f+1][c];  //inferior
				if(c!=0) cuenta+=tablero[f][c-1];           //izquierda
				if(c!=tablero.length-1) cuenta+=tablero[f][c+1];  //derecha
				if(f!=0 && c!=0) cuenta+=tablero[f-1][c-1]; //superior izquierda
				if(f!=0 && c!=tablero.length-1) cuenta+=tablero[f-1][c+1]; //superior derecha
				if(f!=tablero.length-1 && c!=0) cuenta+=tablero[f+1][c-1]; //inferior izquierda
				if(f!=tablero.length-1 && c!=tablero.length-1) cuenta+=tablero[f+1][c+1]; //inferior derecha
				System.out.println("Cuidado: Hay "+cuenta+" minas alrededor" );
			}
			//preguntamos si desea continuar
			System.out.print("\nContinuar(s/n)?:");
			respuesta=Character.toLowerCase(teclado.next().charAt(0));
		}while(respuesta!='n');  //continuamos hasta que contesten no

	}
	
}
package hojaDeEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		/*
		 * Escribe un programa que genere automáticamente un cuadro mágico. Un cuadro
			mágico es aquel en el que todas sus filas, columnas y diagonales suman igual. Se
			debe generar un cuadro de tamaño impar. Ejemplo si elegimos un cuadro de 5x5
			este hay que rellenarlo con los números del 1 al 25.
			El proceso de generación consiste en situar el número 1 en el centro de la
			primera fila, el número siguiente en la casilla situada encima y a la derecha y así
			sucesivamente. Suponemos que el array es cíclico, entonces la casilla encima de
			la primera fila es la última fila, y la casilla a la derecha de la última es la
			primera. En caso de caer en una casilla ya ocupada se coloca el número debajo
			del que acabamos de colocar.
					Este es el cuadro mágico de tamaño 3
								8 1 6
								3 5 7
								4 9 2
		 */
		
		Scanner teclado=new Scanner(System.in);
		int[][] a;
		int tamaño,f,c,nf,nc;

		do{
			System.out.print("Tamaño del cuadro magico:");
			tamaño=teclado.nextInt();
		}while(tamaño<3||tamaño%2==0);  //pedimos tamaño del cuadro
		//mientras que el numero sea menor que 3, y sea par

		a=new int[tamaño][tamaño];  //creación del objeto array

		f=0;c=tamaño/2; // lugar donde colocar el primer numero
		a[f][c]=1;      //colocamos el 1
		for(int i=2;i<=tamaño*tamaño;i++){  // desde el 2 hasta rellenar todo el cuadro
			nf=f-1;  //nueva fila
			nc=c+1;  //nueva columna
			if(nf<0) nf=tamaño-1; //si nos pasamos de fila nos colocamos en la ultima
			if(nc==tamaño) nc=0;  //si nos pasamos de columna; pasamos a la primera

			if(a[nf][nc]==0){ // si el nuevo lugar esta vacio
				a[nf][nc]=i;    // colocamos el numero
			}else{    // el lugar no esta vacio
				nf=f+1;   //fila debajo del numero actual
				nc=c;
				a[nf][nc]=i;   // colocamos el numero
			}
			f=nf;  // cambiamos la fila y la columna
			c=nc;  // para la siguiente vuelta
		}

		//mostramos el resultado
		for(int i=0;i<a.length;i++){
			System.out.println(Arrays.toString(a[i]) );
		}




	}

}

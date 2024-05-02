package ejercicios.examen1;

import java.util.ArrayList;

public class Combinacion {

	private ArrayList<Integer> listaNumeros;

	public Combinacion(ArrayList<Integer> listaNumeros) {
		super();
		this.listaNumeros = listaNumeros;
	}

	public ArrayList<Integer> getListaNumeros() {
		return listaNumeros;
	}

	public void setListaNumeros(ArrayList<Integer> listaNumeros) {
		this.listaNumeros = listaNumeros;
	}
	
	//Método que recibe una combinación ganadora y nos dice cuantos aciertos tenemos
	public int getAciertos(Combinacion combinacionGanadora) {
		int aciertos = 0;
		for (Integer numero : this.listaNumeros) {
			if( combinacionGanadora.getListaNumeros().contains(numero)) {
				aciertos++;
			}
		}
		return aciertos;
	}
}

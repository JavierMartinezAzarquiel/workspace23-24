package vehiculos;

import java.util.ArrayList;

public class Prueba {

	public static void main(String[] args) {

		Coche c1 = new Coche("BMW", 35000, "X3", "Rojo", 2500, "Gasolina", 5);
		Coche c2 = new Coche("Peugeot", 18000, "207", "Blanco", 1100, "Diesel", 5);

		Moto m1 = new Moto("Ducati", 9300, "Monster 821", "Rosa", 800, "Gasolina", "Custom");

		Bicicleta b1 = new Bicicleta("Alpina", 2000, "CBCX", "Rojo", 36);

		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();

		lista.add(c1);
		lista.add(c2);
		lista.add(b1);
		lista.add(m1);

		System.out.println(lista);
		
		System.out.println("Precio total de la tienda: " + precioTotal(lista));
		System.out.println("Cuanto usan gasolina: " + cuantosDeGasolina(lista));
		
	}

	public static int precioTotal(ArrayList<Vehiculo> lista) {
		int total = 0;
		for (Vehiculo vehiculo : lista) {
			total += vehiculo.getPrecio();
		}
		return total;
	}
	
	public static int cuantosDeGasolina(ArrayList<Vehiculo> lista) {
		int contador = 0;
		for (Vehiculo vehiculo : lista) {
			if ( vehiculo instanceof VehiculoConMotor) {//si es un vehiculo con motor le pregunto si usa gasolina
				if( ((VehiculoConMotor)vehiculo).getCombustible().equals("Gasolina")) {
					contador++;
				}
			}
		}
		return contador;
	}
	
}

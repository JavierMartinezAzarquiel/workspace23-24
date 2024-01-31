package clinica;

public class Prueba {

	public static void main(String[] args) {
		ListaDeEspera lista = new ListaDeEspera();
		
		Paciente p1 = new Paciente("039384875J", "Carla", "Adeslas");
		Paciente p2 = new Paciente("474373873K", "Paula", "Sanitas");
		Paciente p3 = new Paciente("029999299M", "Andrés", "Asisa");
		Paciente p4 = new Paciente("112828739W", "María");
		Paciente p5 = new Paciente("238383922N", "Luis", "DKV");
		
		lista.add(p1);
		lista.add(p2);
		System.out.println(lista);
		
		System.out.println("Turno para: " + lista.atender() );
		System.out.println(lista);
		
		lista.add(p3);
		lista.add(p4);
		
		System.out.println(lista);
		
		lista.colar(p5, 1);
		
		System.out.println(lista);
	}

}

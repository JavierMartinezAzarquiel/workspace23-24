package reloj;

public class Prueba {

	public static void main(String[] args) {
		Digital relojD = new Digital();
		Analogico relojA = new Analogico();

		System.out.println(relojD.getHora());
		System.out.println(relojA.getHora());
	}

}

package pandilla;

public class Prueba {

	public static void main(String[] args) {
		Pandilla p = new Pandilla(10);
		
		try {
			p.add(new Amigo("Javier","Profe"));
			p.add(new Amigo("Pedro","Pitu"));
			p.add(new Amigo("Luis","Jhony"));
		} catch (NoMeGustaTuNombreException e) {
			System.out.println(e.getMessage());
		} catch (PandillaCompletaException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(p);
		
	}

}

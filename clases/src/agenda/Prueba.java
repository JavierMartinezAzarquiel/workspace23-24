package agenda;

public class Prueba {

	public static void main(String[] args) {
		
		Contacto javier = new Contacto("Javier", 675754833);
		
		System.out.println(javier);

		
//		AgendaConArray agenda1 = new AgendaConArray();
//		AgendaConArray agenda2 = new AgendaConArray(47);
//		AgendaConArray agenda3 = new AgendaConArray( agenda2.getContactos() );
		
		Agenda agenda = new Agenda();
		
		agenda.add( javier );
		agenda.add(new Contacto("Laura",665748733));
		agenda.add(new Contacto("Carlos",748475985));
		
		System.out.println(agenda);
		
		agenda.delete("Carlos");
		
		System.out.println(agenda);
		
		agenda.update("Laura", "Laurita");

		System.out.println(agenda);
		
	}

}

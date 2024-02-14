package crucero;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Prueba {

	public static void main(String[] args) {
		//Prueba de las clase Crucero.
		//Escala de Ocio
		EscalaOcio o = new EscalaOcio("Atenas", LocalDateTime.parse("2024-04-14T09:00:00"),LocalDateTime.parse("2024-04-14T18:00:00"));
		EscalaCultural c = new EscalaCultural("Genova", LocalDateTime.parse("2024-04-16T08:00:00"),LocalDateTime.parse("2024-04-16T17:30:00"), 150);
	
		Crucero crucero = new Crucero(1, "Islas Griegas", "Liberty of the seas", LocalDate.parse("2024-04-12"), LocalDate.parse("2024-04-18"));
		
		crucero.add(o);
		crucero.add(c);
		
		System.out.println(crucero);
		System.out.println("Coste total: " + crucero.coste());
	}

}

package ejercicios.taller;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class CrearArchivosTaller {

	
	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		File archivoVehiculos=new File("vehiculos.obj");
		File archivoIntervenciones=new File("intervenciones.obj");

		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(archivoVehiculos));
		oos.writeObject(new Vehiculo("7463HFW", "CITROEN", "C4", "JORGE RODRIGUEZ"));
		oos.writeObject(new Vehiculo("1093BMR", "FORD", "KUGA", "MARTA SOLANO"));
		oos.writeObject(new Vehiculo("4738CIP", "HYUNDAI", "IX35", "LUIS GOMEZ"));
		oos.writeObject(new Vehiculo("3320GSR", "PEUGEOT", "3008", "JUAN MORENO"));
		oos.writeObject(new Vehiculo("8584DDZ", "CITROEN", "C3", "CECILIA MARTIN"));
		oos.writeObject(new Vehiculo("5874FGM", "OPEL", "ASTRA", "FRANCISCO PARDO"));
		oos.close();
		
		
		oos=new ObjectOutputStream(new FileOutputStream(archivoIntervenciones));
		SimpleDateFormat fecha=new SimpleDateFormat("dd/MM/yyyy");
		oos.writeObject(new Intervencion(LocalDate.parse("2024-02-17"), "7463HFW", 123.68F, "Cambio de aceite"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-02-17"), "4738CIP", 159.99F, "Cambio de neumatico"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-02-20"), "1093BMR", 292.99F, "Revisión general"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-02-23"), "7463HFW", 45.90F, "Filtro del aire"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-03-21"), "3320GSR", 123.68F, "Cambio de aceite"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-03-24"), "5874FGM", 110.00F, "Cambio de neumatico"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-04-06"), "3320GSR", 489.00F, "Sustitucion Correa de distribución"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-04-15"), "4738CIP", 1240.00F, "Sustitucion embrague"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-04-17"), "8584DDZ", 16.00F, "Reponer lampara fundida"));
		oos.writeObject(new Intervencion(LocalDate.parse("2024-04-19"), "8584DDZ", 99.99F, "Cambio de neumatico"));
		oos.close();

		System.out.println("Archivos creados");
	}


}

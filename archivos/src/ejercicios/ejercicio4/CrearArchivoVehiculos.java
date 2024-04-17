package ejercicios.ejercicio4;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;


public class CrearArchivoVehiculos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		
		File archivo=new File("vehiculos.exp");
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(archivo));
		oos.writeObject(new Vehiculo("6574FDU","OPEL INSIGNIA",15500,LocalDate.parse("2024-04-11")));
		oos.writeObject(new Vehiculo("8584DDZ", "CITROEN C3",9800,LocalDate.parse("2024-04-12")));
		oos.writeObject(new Vehiculo("5874FGM", "OPEL ASTRA",11000,LocalDate.parse("2024-04-12")));
		oos.writeObject(new Vehiculo("9984HET","MERCEDES C270",9500,LocalDate.parse("2024-04-13")));
		oos.writeObject(new Vehiculo("1254BNG","BMW X3",15800,LocalDate.parse("2024-04-16")));
		oos.writeObject(new Vehiculo("0934GXY","NISSAN QASHQAI2 2.0",12800,LocalDate.parse("2024-04-17")));
		
		
		oos.close();
		

	}

}

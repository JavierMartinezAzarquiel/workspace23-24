package reloj;

import java.text.DecimalFormat;
import java.time.LocalTime;

public class Digital implements Reloj {

	@Override
	public String getHora() {
		LocalTime horaDelSistema = LocalTime.now(); //obtiene la hora del sistema
		int hora = horaDelSistema.getHour();
		int minuto = horaDelSistema.getMinute();
		
		DecimalFormat formato = new DecimalFormat("00"); //la cifra siempre tendrá dos numeros 
		return formato.format(hora) + ":" + formato.format(minuto);
	}

}

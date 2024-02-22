package reloj;

import java.time.LocalTime;

public class Analogico implements Reloj{

	@Override
	public String getHora() {
		LocalTime horaDelSistema = LocalTime.now(); //obtiene la hora del sistema
		int hora = horaDelSistema.getHour();
		int minuto = horaDelSistema.getMinute();
		
		String resultado = "";
		
		if(minuto > 30) { //si son mas de 30 minutos ponemos "menos"
			if(hora == 12) {
				resultado="Es la 1 menos ";
			}else {
				resultado="Son las "+(hora+1)+" menos ";
			}
			
			if(minuto == 45) {
				resultado += "cuarto";
			}else {
				resultado += (60-minuto);
			}
			return resultado;
		}else {
			if(hora==1) {
				resultado = "Es la 1";
			}else {
				resultado = "Son las "+ hora;
			}
			
			switch(minuto) {
			case 0: return resultado + " en punto";
			case 15: return resultado + " y cuarto";
			case 30: return resultado + " y media";
			default: return resultado + " y " + minuto;
			}
		}
	}

	
}

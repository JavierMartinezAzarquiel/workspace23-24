package crucero;

import java.time.LocalDateTime;

public class EscalaCultural extends Escala {

	protected float precioGuia;

	public EscalaCultural(String nombreCiudad, LocalDateTime horaBajada, LocalDateTime horaRegreso, float precioGuia) {
		super(nombreCiudad, horaBajada, horaRegreso);
		this.precioGuia = precioGuia;
	}

	public float getPrecioGuia() {
		return precioGuia;
	}

	public void setPrecioGuia(float precioGuia) {
		this.precioGuia = precioGuia;
	}

	@Override
	public String toString() {
		return super.toString() + " Precio Guia: " + precioGuia;
	}
	
	
}

package rectangulo;

import java.util.Iterator;

public class Rectangulo {

	//atributos
	private long alto;
	private long ancho;
	
	//constructores
	public Rectangulo() {
		this.alto = (long)(Math.random()*50);
		this.ancho = (long)(Math.random()*50);
	}
	
	public Rectangulo(long ancho, long alto) {
		if(ancho>0) {
			this.ancho = ancho;
		}else {
			this.ancho = (long)(Math.random()*50);
		}
		if(alto>0) {
			this.alto = alto;
		}else {
			this.alto = (long)(Math.random()*50);
		}
	}

	public long getAlto() {
		return alto;
	}

	public void setAlto(long alto) {
		this.alto = alto;
	}

	public long getAncho() {
		return ancho;
	}

	public void setAncho(long ancho) {
		this.ancho = ancho;
	}
	
	public long area() {
		return this.alto * this.ancho;
	}
	
	public long perimetro() {
		return (this.alto + this.ancho) * 2;
	}
	
	public boolean isVertical() {
		if (this.alto > this.ancho) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isHorizontal() {
		if (this.ancho > this.alto) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
	}
	
	public String dibujar() {
		String resultado = "";
		for (int i = 0; i < this.alto; i++) {
			for (int j = 0; j < this.ancho; j++) {
				resultado += "*";
			}
			resultado += "\n";
		}
		return resultado;
	}
	
}








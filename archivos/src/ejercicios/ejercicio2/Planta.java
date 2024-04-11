package ejercicios.ejercicio2;

import java.io.Serializable;

public class Planta implements Serializable{
    private int codigo;
    private String nombreVulgar;
    private String nombreCientifico;
    private double precio;
    private int cantidad;

    public Planta(int codigo, String nombreVulgar, String nombreCientifico, double precio, int cantidad){
        this.codigo = codigo;
        this.nombreVulgar = nombreVulgar;
        this.nombreCientifico = nombreCientifico;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCodigo(){
        return codigo;
    }

    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public String getNombreCientifico(){
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico){
        this.nombreCientifico = nombreCientifico;
    }

    public String getNombreVulgar(){
        return nombreVulgar;
    }

    public void setNombreVulgar(String nombreVulgar){
        this.nombreVulgar = nombreVulgar;
    }

    public double getPrecio(){
        return precio;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

	@Override
	public String toString() {
		return "Planta [codigo=" + codigo + ", nombreVulgar=" + nombreVulgar + ", nombreCientifico=" + nombreCientifico
				+ ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

}


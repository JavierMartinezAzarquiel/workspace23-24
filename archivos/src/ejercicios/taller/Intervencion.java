
package ejercicios.taller;

import java.io.Serializable;
import java.time.LocalDate;



public class Intervencion implements Serializable {

    private LocalDate fecha;
    private String matricula;
    private float coste;
    private String descripcion;

    public Intervencion(LocalDate fecha, String matricula, float coste, String descripcion){
        this.fecha = fecha;
        this.matricula = matricula;
        this.coste = coste;
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public float getCoste(){
        return coste;
    }

    public void setCoste(float coste){
        this.coste = coste;
    }

    public String getMatricula(){
        return matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public LocalDate getFecha(){
        return fecha;
    }

    public void setFecha(LocalDate fecha){
        this.fecha = fecha;
    }

}

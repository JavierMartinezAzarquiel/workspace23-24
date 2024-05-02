
package ejercicios.hotel;

import java.io.Serializable;

public class Habitacion implements Serializable{

    private int numero;
    private String dni;
    private boolean disponible;

    public Habitacion(int numero){
        this.numero = numero;
        this.dni = null;
        this.disponible=true;
    }


    public String getDni(){
        return dni;
    }

    public void setDni(String dni){
        this.dni = dni;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public boolean isDisponible(){
        return disponible;
    }

    public void setDisponible(boolean disponible){
        this.disponible = disponible;
    }


}

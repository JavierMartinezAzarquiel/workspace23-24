
package ejercicios.taller;

import java.io.Serializable;


public class Vehiculo implements Serializable {

    private String matricula;
    private String marca;
    private String modelo;
    private String propietario;

    public Vehiculo(String matricula, String marca, String modelo, String propietario)
    {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public String getPropietario()
    {
        return propietario;
    }

    public void setPropietario(String propietario)
    {
        this.propietario = propietario;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public void setMatricula(String matricula)
    {
        this.matricula = matricula;
    }

}

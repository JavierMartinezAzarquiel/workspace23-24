
package entidades;

import java.sql.Date;

/**
 *
 * @author javier
 */
public class Ticket{

    private int numero;
    private Date fecha;

    public Ticket(int numero){
        this.numero = numero;
        //para guardar en un objeto sql.Date la fecha actual del sistema
        this.fecha=new java.sql.Date(new java.util.Date().getTime());
    }

    public Ticket(int numero, Date fecha){
        this.numero = numero;
        this.fecha=fecha;
    }

    public Date getFecha(){
        return fecha;
    }

    public void setFecha(Date fecha){
        this.fecha = fecha;
    }

    public int getNumero(){
        return numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

	@Override
	public String toString() {
		return "Ticket [numero=" + numero + ", fecha=" + fecha + "]";
	}
    
    

}

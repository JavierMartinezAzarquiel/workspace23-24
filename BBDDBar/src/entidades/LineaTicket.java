
package entidades;

/**
 *
 * @author javier
 */
public class LineaTicket{

    private int numeroTicket;
    private String codigoProducto;
    private int cantidad;

    public LineaTicket(int numeroTicket, String codigoProducto, int cantidad){
        this.numeroTicket = numeroTicket;
        this.codigoProducto = codigoProducto;
        this.cantidad = cantidad;
    }

    public int getCantidad(){
        return cantidad;
    }

    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }

    public String getCodigoProducto(){
        return codigoProducto;
    }

    public void setCodigoProducto(String codigoProducto){
        this.codigoProducto = codigoProducto;
    }

    public int getNumeroTicket(){
        return numeroTicket;
    }

    public void setNumeroTicket(int numeroTicket){
        this.numeroTicket = numeroTicket;
    }

	@Override
	public String toString() {
		return codigoProducto + " cantidad="+ cantidad ;
	}

    
}


package entidades;

public class Producto{

    private int IdProducto;
    private String NomProducto;
    private int IdGrupo;
    private double Precio;

    public Producto(int IdProducto, String NomProducto, int IdGrupo, double Precio){
        this.IdProducto = IdProducto;
        this.NomProducto = NomProducto;
        this.IdGrupo = IdGrupo;
        this.Precio = Precio;
    }

    public int getIdGrupo(){
        return IdGrupo;
    }

    public void setIdGrupo(int IdGrupo){
        this.IdGrupo = IdGrupo;
    }

    public int getIdProducto(){
        return IdProducto;
    }

    public void setIdProducto(int IdProducto){
        this.IdProducto = IdProducto;
    }

    public String getNomProducto(){
        return NomProducto;
    }

    public void setNomProducto(String NomProducto){
        this.NomProducto = NomProducto;
    }

    public double getPrecio(){
        return Precio;
    }

    public void setPrecio(double Precio){
        this.Precio = Precio;
    }



}


package dao;
import java.sql.*;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Producto;



public class DAOProductos{
    


    public void add(Producto p){
      try{
         Connection conexion=new DBConnection().getConexion();
         
         String sql="INSERT INTO Productos values (?,?,?,?)";

         PreparedStatement sentencia = conexion.prepareStatement(sql);
		 sentencia.setInt(1, p.getIdProducto());
		 sentencia.setString(2, p.getNomProducto());
		 sentencia.setInt(3, p.getIdGrupo());
		 sentencia.setDouble(4, p.getPrecio());
		 			
		 sentencia.executeUpdate();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error insertando Producto");
      }
    }

    public void update(Producto p){
        try{
         Connection conexion=new DBConnection().getConexion();
         
         String sql="UPDATE Productos SET NomProducto=?,IdGrupo=?,Precio=? WHERE IdProducto=?";

         PreparedStatement sentencia = conexion.prepareStatement(sql);
		 sentencia.setInt(4, p.getIdProducto());
		 sentencia.setString(1, p.getNomProducto());
		 sentencia.setInt(2, p.getIdGrupo());
		 sentencia.setDouble(3, p.getPrecio());
		 			
		 sentencia.executeUpdate();
         
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error modificando producto");
         e.printStackTrace();
      }
    }

    public ArrayList<Producto> get(){
      ArrayList<Producto> lista=new ArrayList<Producto>();

      try{
         Connection conexion=new DBConnection().getConexion();
         
         String sql="SELECT * FROM Productos ORDER BY IdProducto";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         sentencia.execute();
         ResultSet resultado=sentencia.getResultSet();

         while(resultado.next()){
            Producto p=new Producto(resultado.getInt("IdProducto"),resultado.getString("NomProducto"),
                          resultado.getInt("IdGrupo"),resultado.getDouble("Precio"));

            lista.add(p);
         }

         resultado.close();
         sentencia.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando productos");
      }

      return lista;
    }

    public Producto get(int idProducto){
     Producto producto = null;

      try{
         Connection conexion=new DBConnection().getConexion();
         
         String sql="SELECT * FROM Productos WHERE IdProducto=?";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         sentencia.setInt(1, idProducto);
         sentencia.execute();
         ResultSet resultado=sentencia.getResultSet();

         if(resultado.next()){
            producto=new Producto(resultado.getInt("IdProducto"),resultado.getString("NomProducto"),
                          resultado.getInt("IdGrupo"),resultado.getDouble("Precio"));

         }

         resultado.close();
         sentencia.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando productos");
      }

      return producto;
    }

    

}


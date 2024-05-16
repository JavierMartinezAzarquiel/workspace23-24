
package dao;
import java.sql.*;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Grupo;


public class DAOGrupos{
 
   
    public ArrayList<Grupo> get(){
      ArrayList<Grupo> lista=new ArrayList<Grupo>();
	  Connection conexion=new DBConnection().getConexion();
      try{
         
         String sql="SELECT * FROM Grupos ORDER BY IdGrupo";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         sentencia.execute();
         ResultSet resultado=sentencia.getResultSet();

         while(resultado.next()){
            Grupo g=new Grupo(resultado.getInt("IdGrupo"),resultado.getString("NombreGrupo"));

            lista.add(g);
         }

         sentencia.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando grupos");
         e.printStackTrace();
      }

      return lista;
    }

    public Grupo get(int IdGrupo){
        Grupo g=null;

        try{
         Connection conexion=new DBConnection().getConexion();
         
         String sql="SELECT * FROM Grupos WHERE IdGrupo=?";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         sentencia.setInt(1, IdGrupo);
         sentencia.execute();
         ResultSet resultado=sentencia.getResultSet();


         if(resultado.next()){
           g=new Grupo(resultado.getInt("IdGrupo"),resultado.getString("NombreGrupo"));
           
         }

         sentencia.close();
         conexion.close();
        }catch(SQLException e){
         System.out.print("Error consultando grupo");
        }

        return g;

    }

    public Grupo get(String nombreDeGrupo){
        Grupo g=null;

        try{
         Connection conexion=new DBConnection().getConexion();
         
         String sql="SELECT * FROM Grupos WHERE NombreGrupo=?";
         PreparedStatement sentencia = conexion.prepareStatement(sql);
         sentencia.setString(1, nombreDeGrupo);
         sentencia.execute();
         ResultSet resultado=sentencia.getResultSet();


         if(resultado.next()){
           g=new Grupo(resultado.getInt("IdGrupo"),resultado.getString("NombreGrupo"));
           
         }

         sentencia.close();
         conexion.close();
        }catch(SQLException e){
         System.out.print("Error consultando grupo");
        }

        return g;

    }
}

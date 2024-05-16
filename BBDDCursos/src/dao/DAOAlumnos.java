package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Alumno;


public class DAOAlumnos {

	
    public DAOAlumnos(){
        
    }
    
	public void add(Alumno a){

		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql = "INSERT INTO Alumnos VALUES(?,?,?,?,?)";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, a.getCodigoAlumno());
			plataforma.setString(2, a.getNombre());
			plataforma.setString(3, a.getApellidos());
			plataforma.setString(4, a.getTelefono());
			plataforma.setDate(5, a.getFechaNacimiento());
			plataforma.executeUpdate();

			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void delete(Alumno a){
		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql = "DELETE FROM Alumnos WHERE CodigoAlumno=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, a.getCodigoAlumno());
			plataforma.executeUpdate();

			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(Alumno a){
		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql="UPDATE Alumnos SET nombre=?,apellidos=?,telefono=?,fechaNacimiento=? WHERE CodigoAlumno=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(5, a.getCodigoAlumno());
			plataforma.setString(1, a.getNombre());
			plataforma.setString(2, a.getApellidos());
			plataforma.setString(3, a.getTelefono());
			plataforma.setDate(4, a.getFechaNacimiento());
			plataforma.executeUpdate();
			
			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

    public ArrayList<Alumno> get(){
        ArrayList<Alumno> lista=new ArrayList<Alumno>();
        try{
         Connection conexion=new DBConnection().getConexion();
        
         String sql="SELECT * FROM Alumnos";
         PreparedStatement plataforma = conexion.prepareStatement(sql);
         plataforma.execute();
         ResultSet resultado=plataforma.getResultSet();

         while(resultado.next()){
            Alumno a=new Alumno(resultado.getInt("CodigoAlumno"),resultado.getString("Nombre"),resultado.getString("Apellidos"),
                             resultado.getString("Telefono"),resultado.getDate("FechaNacimiento"));

            lista.add(a);
         }

         resultado.close();
         plataforma.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando Alumnos");
      }
      return lista;
    }
    
    public Alumno get(int codigoAlumno){
        Alumno al=null;
        try{
         Connection conexion=new DBConnection().getConexion();
        
         String sql="SELECT * FROM Alumnos WHERE CodigoAlumno=?";
         PreparedStatement plataforma = conexion.prepareStatement(sql);
         plataforma.setInt(1, codigoAlumno);
         plataforma.execute();
         ResultSet resultado=plataforma.getResultSet();

         if(resultado.next()){
            al=new Alumno(resultado.getInt("CodigoAlumno"),resultado.getString("Nombre"),resultado.getString("Apellidos"),
                             resultado.getString("Telefono"),resultado.getDate("FechaNacimiento"));

         }
         
         resultado.close();
         plataforma.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando Alumnos");
      }
      return al;
    }
}

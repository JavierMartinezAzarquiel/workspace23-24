package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Curso;

public class DAOCursos {
	
	
    public DAOCursos(){
    
    }
    
    public void add(Curso c){

		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql = "INSERT INTO Cursos VALUES(?,?,?,?,?,?)";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, c.getCodigoCurso());
			plataforma.setString(2, c.getCurso());
			plataforma.setDate(3, c.getFechaInicio());
			plataforma.setDate(4, c.getFechaFin());
			plataforma.setString(5, c.getHoraInicio());
			plataforma.setString(6, c.getHoraFin());
			plataforma.executeUpdate();

			//cerrar conexion
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void delete(Curso c){
		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql = "DELETE FROM Cursos WHERE CodigoCurso=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, c.getCodigoCurso());
			plataforma.executeUpdate();

			//cerrar conexion
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public void update(Curso c){
		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql="UPDATE Cursos SET curso=?,fechaInicio=?,fechaFin=?,horaInicio=?,horaFin=? WHERE CodigoCurso=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(6, c.getCodigoCurso());
			plataforma.setString(1, c.getCurso());
			plataforma.setDate(2, c.getFechaInicio());
			plataforma.setDate(3, c.getFechaFin());
			plataforma.setString(4, c.getHoraInicio());
			plataforma.setString(5, c.getHoraFin());
			plataforma.executeUpdate();
			//cerrar conexion
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
    
    public ArrayList<Curso> get(){
        ArrayList<Curso> lista=new ArrayList<Curso>();
        try{
         Connection conexion=new DBConnection().getConexion();
         Statement sentencia=conexion.createStatement();

         String sql="SELECT * FROM CURSOS";
         PreparedStatement plataforma = conexion.prepareStatement(sql);
         plataforma.execute();
         ResultSet resultado=plataforma.getResultSet();


         while(resultado.next()){
            Curso c=new Curso(resultado.getInt("CodigoCurso"),resultado.getString("Curso"),resultado.getDate("FechaInicio"),
                             resultado.getDate("FechaFin"),resultado.getString("HoraInicio"),resultado.getString("HoraFin"));

            lista.add(c);
         }

         resultado.close();
         plataforma.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando Cursos");
      }
      return lista;
    }
    
    public Curso get(int codigoCurso){
        Curso c=null;
        try{
         Connection conexion=new DBConnection().getConexion();
        
         String sql="SELECT * FROM CURSOS WHERE CodigoCurso=?";
         PreparedStatement plataforma = conexion.prepareStatement(sql);
         plataforma.setInt(1, codigoCurso);
         plataforma.execute();
         ResultSet resultado=plataforma.getResultSet();

         if(resultado.next()){
            c=new Curso(resultado.getInt("CodigoCurso"),resultado.getString("Curso"),resultado.getDate("FechaInicio"),
                             resultado.getDate("FechaFin"),resultado.getString("HoraInicio"),resultado.getString("HoraFin"));

         }

         resultado.close();
         plataforma.close();
         conexion.close();
      }catch(SQLException e){
         System.out.print("Error consultando Cursos");
      }
      return c;
    }

}

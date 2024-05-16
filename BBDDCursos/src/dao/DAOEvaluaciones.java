package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Curso;
import entidades.Evaluacion;


public class DAOEvaluaciones {


	public DAOEvaluaciones(){

	}

	public void add(Evaluacion ev){
		try{
			Connection conexion=new DBConnection().getConexion();
			PreparedStatement plataforma=conexion.prepareStatement("INSERT INTO EVALUACIONES VALUES (?,?,?,?)");
			plataforma.setInt(1, ev.getCodigoAlumno());
			plataforma.setInt(2, ev.getCodigoCurso());
			plataforma.setInt(3, ev.getNota());
			plataforma.setString(4, ev.getObservaciones());
			plataforma.executeUpdate();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error insertando Evaluacion");
			e.printStackTrace();
		}
	}

	public void delete(Evaluacion ev){
		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql = "DELETE FROM Evaluaciones WHERE CodigoAlumno=? AND CodigoCurso=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, ev.getCodigoAlumno());
			plataforma.setInt(2, ev.getCodigoCurso());
			plataforma.executeUpdate();

			//cerrar conexion
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public void update(Evaluacion ev){
		try{	
			//obtengo conexion con la base de datos
			Connection conexion= new DBConnection().getConexion();

			//con plataforma preparada
			String sql="UPDATE Evaluaciones SET nota=?,observaciones=? WHERE CodigoAlumno=? AND CodigoCurso=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(3, ev.getCodigoAlumno());
			plataforma.setInt(4, ev.getCodigoCurso());
			plataforma.setInt(1, ev.getNota());
			plataforma.setString(2, ev.getObservaciones());
			plataforma.executeUpdate();
			//cerrar conexion
			conexion.close();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

	public ArrayList<Evaluacion> get(){
		ArrayList<Evaluacion> lista=new ArrayList<Evaluacion>();
		try{
			Connection conexion=new DBConnection().getConexion();

			String sql="SELECT * FROM EVALUACIONES";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.execute();
			ResultSet resultado=plataforma.getResultSet();

			while(resultado.next()){
				Evaluacion ev=new Evaluacion(resultado.getInt("CodigoAlumno"),resultado.getInt("CodigoCurso"),
						resultado.getInt("NotaFinal"),resultado.getString("Observaciones"));

				lista.add(ev);
			}

			resultado.close();
			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando evaluaciones");
			e.printStackTrace();
		}
		return lista;
	}

	public Evaluacion get(int codigoAlumno, int codigoCurso){
		Evaluacion ev=null;
		try{
			Connection conexion=new DBConnection().getConexion();

			String sql="SELECT * FROM EVALUACIONES WHERE CodigoAlumno=? AND CodigoCurso=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, codigoAlumno);
			plataforma.setInt(2, codigoCurso);
	        plataforma.execute();
	        ResultSet resultado=plataforma.getResultSet();

			if(resultado.next()){
				ev=new Evaluacion(resultado.getInt("CodigoAlumno"),resultado.getInt("CodigoCurso"),
						resultado.getInt("NotaFinal"),resultado.getString("Observaciones"));

			}

			resultado.close();
			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando evaluaciones");
			e.printStackTrace();
		}
		return ev;
	}
}

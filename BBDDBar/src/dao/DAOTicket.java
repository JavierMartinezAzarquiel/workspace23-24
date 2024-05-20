
package dao;
import java.sql.*;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Ticket;

public class DAOTicket{
	public DAOTicket(){

	}

	public void insert(Ticket t){
		try{
			Connection conexion=new DBConnection().getConnection();
			PreparedStatement plataforma=conexion.prepareStatement("INSERT INTO Ticket VALUES (?,?)");
			plataforma.setInt(1, t.getNumero());
			plataforma.setDate(2, t.getFecha());
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error insertando Ticket");
		}
	}

	public void delete(int numero){
		try{
			Connection conexion=new DBConnection().getConnection();

			String sql="DELETE FROM Ticket WHERE Numero=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, numero);
			plataforma.executeUpdate();


			conexion.close();
		}catch(SQLException e){
			System.out.print("Error borrando Ticket");
		}
	}

	public ArrayList<Ticket> get(){
		ArrayList<Ticket> lista=new ArrayList<Ticket>();

		try{
			Connection conexion=new DBConnection().getConnection();

			String sql="SELECT * FROM Ticket";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.executeQuery();
			ResultSet resultado=plataforma.getResultSet();

			while(resultado.next()){
				Ticket t=new Ticket(resultado.getInt("Numero"),resultado.getDate("Fecha"));

				lista.add(t);
			}

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando tickets");
		}

		return lista;
	}

	public Ticket get(int numero){
		Ticket t=null;

		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="SELECT * FROM Ticket WHERE Numero=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, numero);
			plataforma.executeQuery();
			ResultSet resultado=plataforma.getResultSet();


			if(resultado.next()){
				t=new Ticket(resultado.getInt("Numero"),resultado.getDate("Fecha"));

			}


			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando Ticket");
			e.printStackTrace();
		}

		return t;

	}

	public int getUltimoNumeroUsado(){
		int numero=0;
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="SELECT max(Numero) FROM Ticket";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.execute();
			ResultSet resultado=plataforma.getResultSet();

			resultado.next();
			numero=resultado.getInt(1);


			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando Ticket");
		}

		return numero;

	}

}

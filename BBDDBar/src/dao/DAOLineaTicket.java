
package dao;
import java.sql.*;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.LineaTicket;

public class DAOLineaTicket{

	public DAOLineaTicket(){

	}

	public void insert(LineaTicket l){
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="INSERT INTO LineaTicket VALUES (?,?,?)";

			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, l.getNumeroTicket());
			plataforma.setString(2, l.getCodigoProducto());
			plataforma.setInt(3, l.getCantidad());
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error insertando Linea");
			e.printStackTrace();
		}
	}

	public void update(LineaTicket l){
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="UPDATE LineaTicket SET Cantidad=? WHERE NumeroTicket=? AND CodigoProducto LIKE ?";

			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(2, l.getNumeroTicket());
			plataforma.setString(3, l.getCodigoProducto());
			plataforma.setInt(1, l.getCantidad());
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error modificando linea");
		}

	}

	public void delete(int numeroTicket, String codigoProducto){
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="DELETE FROM LineaTicket WHERE NumeroTicket=? AND CodigoProducto LIKE ?";

			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, numeroTicket);
			plataforma.setString(2, codigoProducto);
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error borrando linea");
		}
	}

	public ArrayList<LineaTicket> get(int numeroTicket){
		ArrayList<LineaTicket> lista=new ArrayList<LineaTicket>();

		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="SELECT * FROM LineaTicket WHERE NumeroTicket=?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, numeroTicket);
			plataforma.executeQuery();
			ResultSet resultado=plataforma.getResultSet();

			while(resultado.next()){
				LineaTicket l=new LineaTicket(resultado.getInt("NumeroTicket"),
						resultado.getString("CodigoProducto"),resultado.getInt("Cantidad"));

				lista.add(l);
			}


			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando lineas");
		}

		return lista;
	}

	public LineaTicket get(int numeroTicket, String codigoProducto ){
		LineaTicket l=null;

		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="SELECT * FROM LineaTicket WHERE NumeroTicket=? AND CodigoProducto LIKE ?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setInt(1, numeroTicket);
			plataforma.setString(2, codigoProducto);
			plataforma.executeQuery();
			ResultSet resultado=plataforma.getResultSet();


			if(resultado.next()){
				l=new LineaTicket(resultado.getInt("NumeroTicket"),
						resultado.getString("CodigoProducto"),resultado.getInt("Cantidad"));

			}

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando lineaTicket");
		}

		return l;

	}
}

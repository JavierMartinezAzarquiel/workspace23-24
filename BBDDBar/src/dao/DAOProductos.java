package dao;
import java.sql.*;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Producto;

public class DAOProductos{

	public DAOProductos(){
	}

	public void insert(Producto p){
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="INSERT INTO Productos values (?,?,?,?)";
			
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setString(1, p.getCodigo());
			plataforma.setString(2, p.getNombre());
			plataforma.setDouble(3, p.getPrecio());
			plataforma.setString(4, p.getImagen());
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error insertando Producto");
		}
	}

	public void update(Producto p){
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="UPDATE Productos SET Nombre=? ,Precio=?, Imagen=? WHERE Codigo=?";

			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setString(4, p.getCodigo());
			plataforma.setString(1, p.getNombre());
			plataforma.setDouble(2, p.getPrecio());
			plataforma.setString(3, p.getImagen());
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error modificando producto");
		}

	}

	public void delete(String codigo) {
		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="DELETE FROM Productos WHERE Codigo LIKE ?";

			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setString(1, codigo);
			
			plataforma.executeUpdate();

			conexion.close();
		}catch(SQLException e){
			System.out.print("Error borrando producto");
		}
	}

	public ArrayList<Producto> get(){
		ArrayList<Producto> lista=new ArrayList<Producto>();

		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="SELECT * FROM Productos ORDER BY Nombre";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.executeQuery();
			ResultSet resultado=plataforma.getResultSet();

			while(resultado.next()){
				Producto p=new Producto(resultado.getString("Codigo"),resultado.getString("Nombre"),
						resultado.getFloat("Precio"),resultado.getString("Imagen"));

				lista.add(p);
			}

			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando productos");
		}

		return lista;
	}

	public Producto get(String codigo){
		Producto p=null;

		try{
			Connection conexion=new DBConnection().getConnection();
			
			String sql="SELECT * FROM Productos WHERE Codigo LIKE ?";
			PreparedStatement plataforma = conexion.prepareStatement(sql);
			plataforma.setString(1, codigo);
			plataforma.executeQuery();
			ResultSet resultado=plataforma.getResultSet();


			if(resultado.next()){
				p=new Producto(resultado.getString("Codigo"),resultado.getString("Nombre"),
						resultado.getFloat("Precio"),resultado.getString("Imagen"));
			}

			plataforma.close();
			conexion.close();
		}catch(SQLException e){
			System.out.print("Error consultando productos");
		}

		return p;

	}
}


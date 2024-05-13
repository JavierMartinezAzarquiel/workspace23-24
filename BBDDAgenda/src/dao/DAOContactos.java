package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Contacto;

public class DAOContactos {

	/*
	 * Gestor encargado de la tabla contactos.
	 * Debería saber hacer un INSERT, UPDATE, DELETE, SELECT
	 * Transformará los objetos en sentencias SQL y viceversa
	 */
	
	
	public DAOContactos() {
		// nada
	}
	
	
	//método para guardar un objeto en la tabla
	public void add(Contacto c) {
		//obtener una conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
//			//Preparamos el objeto Sentencia(Statement)
//			Statement sentencia = conexion.createStatement();
//			
//			//Preparar el insert
//			String sql = "INSERT INTO contactos VALUES('"+ c.getNombre() +"', " +c.getTelefono() + ")";
//			sentencia.executeUpdate(sql);

			
			//De otra manera, usando un PreparedStatement
			String sql = "INSERT INTO contactos VALUES(?,?)";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//ahora tengo que decirle que dato va en cada interrogación
			sentencia.setString(1, c.getNombre());
			sentencia.setLong(2, c.getTelefono());
			
			//ejecuto
			sentencia.executeUpdate();
			
			//cerrar conexion
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error insertando contacto");
			e.printStackTrace();
		}
		
		
	}
	
	
	//método para actualizar un objeto en la tabla
	public void update(Contacto c) {
		//obtener una conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//Usando un PreparedStatement
			String sql = "UPDATE contactos SET telefono=? WHERE nombre=?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//ahora tengo que decirle que dato va en cada interrogación
			sentencia.setString(2, c.getNombre());
			sentencia.setLong(1, c.getTelefono());
			
			//ejecuto
			sentencia.executeUpdate();
			
			//cerrar conexion
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error actualizando contacto");
			e.printStackTrace();
		}
		
	}
	
	//método para eliminar un objeto en la tabla
	public void delete(Contacto c) {
		//obtener una conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//Usando un PreparedStatement
			String sql = "DELETE FROM contactos WHERE nombre=?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//ahora tengo que decirle que dato va en cada interrogación
			sentencia.setString(1, c.getNombre());
						
			//ejecuto
			sentencia.executeUpdate();
			
			//cerrar conexion
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error borrando contacto");
			e.printStackTrace();
		}
		
	}
	
	//método para obtener todos los objetos de la tabla
	public ArrayList<Contacto> get(){
		//crear un arrayList para ir guardando los objetos
		ArrayList<Contacto> lista = new ArrayList<Contacto>();
		//obtener una conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//Usando un PreparedStatement
			String sql = "SELECT * FROM contactos";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//ejecuto
			ResultSet resultado = sentencia.executeQuery();
			
			while (resultado.next()) {
				//cada tupla la debo convertir en un objeto
//				new Contacto( resultado.getString("nombre"), resultado.getLong("telefono") );
				
			    lista.add(new Contacto( resultado.getString(1), resultado.getLong(2)) );
			}
			
			//cerrar conexion
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error actualizando contacto");
			e.printStackTrace();
		}
		return lista;
	}
	
	//método para obtener un objeto concreto dado su nombre
	
	public Contacto get(String nombre){
		
		//Variable contacto
		Contacto c = null;
		//obtener una conexion a la BBDD
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//Usando un PreparedStatement
			String sql = "SELECT * FROM contactos WHERE nombre=?";
			//Creo el Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			//ejecuto
			ResultSet resultado = sentencia.executeQuery();
			
			if (resultado.next()) {
			    c = new Contacto( resultado.getString(1), resultado.getLong(2));
			}
			
			//cerrar conexion
			conexion.close();
		} catch (SQLException e) {
			System.out.println("Error buscando contacto");
			e.printStackTrace();
		}
		return c;
	}
	
}



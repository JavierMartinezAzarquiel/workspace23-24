package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Poblacion;

public class DAOPoblacion {

	public void add(Poblacion poblacion) {
		//obtener una conexion
		Connection conexion = new DBConnection().getConexion();
		//preparar el INSERT

		try {
			//Otra manera de preparar el INSERT
			String sql = "INSERT INTO Poblacion VALUES(?,?)";
			//Crear el objeto Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Y ahora relleno las 2 interrogaciones
			sentencia.setString(1, poblacion.getNombre());
			sentencia.setInt(2, poblacion.getNumeroHabitantes());
			
			//ejecutamos
			sentencia.executeUpdate();

			//cierro la conexion
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error insertando una poblacion");
		}
	}
	public void delete(Poblacion poblacion) {
		//obtener una conexion
		Connection conexion = new DBConnection().getConexion();
		//preparar el DELETE

		try {

			//Otra manera de preparar el DELETE
			String sql = "DELETE FROM Poblacion WHERE Nombre=?";
			//Crear el objeto Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Y ahora relleno la interrogacion
			sentencia.setString(1, poblacion.getNombre());

			//ejecutamos
			sentencia.executeUpdate();

			//cierro la conexion
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error borrando una poblacion");
		}
	}
	public void update(Poblacion poblacion) {
		//obtener una conexion
		Connection conexion = new DBConnection().getConexion();
		//preparar el UPDATE

		try {

			//Otra manera de preparar el UPDATE
			String sql = "UPDATE Poblacion SET NumeroHabitantes=?  WHERE Nombre=?";
			//Crear el objeto Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//Y ahora relleno las 3 interrogaciones
			sentencia.setInt(1, poblacion.getNumeroHabitantes());
			sentencia.setString(2, poblacion.getNombre());
			
			//ejecutamos
			sentencia.executeUpdate();

			//cierro la conexion
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error actualizando una Poblacion");
		}
	}
	public ArrayList<Poblacion> get(){
		//Preparar un lista vacía 
		ArrayList<Poblacion> lista = new ArrayList<Poblacion>();
		//obtener una conexion
		Connection conexion = new DBConnection().getConexion();
		try {
			String sql = "SELECT * FROM Poblacion";
			//Crear el objeto Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);

			//ejecutamos la query
			ResultSet resultado = sentencia.executeQuery();

			//recorro el resultado y voy creando objetos
			while (resultado.next()) {
				lista.add(new Poblacion(resultado.getString("Nombre"), resultado.getInt("NumeroHabitantes")));
			}
			//cierro la conexion
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error consultando poblaciones");
		}
		return lista;
	}
	public Poblacion get(String nombre) {
		//Preparar una variable donde guardaré la poblacion que busco
		Poblacion p = null;
		//obtener una conexion
		Connection conexion = new DBConnection().getConexion();
		try {
			String sql = "SELECT * FROM Poblacion WHERE Nombre=?";
			//Crear el objeto Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1, nombre);
			//ejecutamos la query
			ResultSet resultado = sentencia.executeQuery();

			//si he encontrado la tupla, creo el objeto poblacion
			if (resultado.next()) {
				p = new Poblacion(resultado.getString("Nombre"), resultado.getInt("NumeroHabitantes"));
			}
			//cierro la conexion
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error consultando poblaciones");
		}
		return p;
	}
	//método para obtener las poblaciones que no tienen ningun habitante
	public ArrayList<Poblacion> getPoblacionesVacias(){
		//Preparar un lista vacía 
		ArrayList<Poblacion> lista = new ArrayList<Poblacion>();
		//obtener una conexion
		Connection conexion = new DBConnection().getConexion();
		try {
			String sql = "SELECT * FROM Poblacion WHERE NumeroHabitantes = 0";
			//Crear el objeto Statement
			PreparedStatement sentencia = conexion.prepareStatement(sql);

			//ejecutamos la query
			ResultSet resultado = sentencia.executeQuery();

			//recorro el resultado y voy creando objetos
			while (resultado.next()) {
				lista.add(new Poblacion(resultado.getString("Nombre"), resultado.getInt("NumeroHabitantes")));
			}
			//cierro la conexion
			conexion.close();

		} catch (SQLException e) {
			System.out.println("Error consultando poblaciones");
		}
		return lista;
	}
}




package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.DBConnection;
import entidades.Habitante;

public class DAOHabitante {
	
	public void add(Habitante h){
		
		//OBTENER CONEXION CON LA BASE DE DATOS
		Connection conexion = new DBConnection().getConexion();
		
		try {
			String sql="INSERT INTO habitante VALUES (?,?,?,?)";
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			sentencia.setString(1,h.getNombre());
			sentencia.setString(2, h.getEmail());
			sentencia.setInt(3, h.getEdad());
			sentencia.setString(4, h.getPoblacion());
			
			sentencia.executeUpdate();
			
			conexion.close();
			
		} catch (SQLException e) {
			System.out.println("Error añadiendo persona: "+e.getMessage());
		}
		
	}
	public void delete(Habitante h){
		//OBTENER LA CONEXION CON LA BASE DE DATOS
		Connection conexion = new DBConnection().getConexion();
		
		try {
			String sql = "DELETE FROM habitante WHERE nombre=?";//LA INTERROGACION ES PARA METER UN VALOR
			//CREAR SENTENCIA
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			
			//TRABAJAR CON LA SENTENCIA
			sentencia.setString(1, h.getNombre());
			//ACTUALIZAMOS LA BBDD
			sentencia.executeUpdate();
			
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error borrando persona: "+e.getMessage());
		}
		
	}
	public void update(Habitante h){
		
		//CREAMOS LA CONEXION
		Connection conexion = new DBConnection().getConexion();
		
		
		String sql = "UPDATE habitante SET email=?, edad=?, poblacion=? WHERE nombre=?";
		
		try {
			//CREAMOS LA SENTENCIA
			PreparedStatement sentencia = conexion.prepareStatement(sql);
			//TRABAJAMOS CON LA SENTENCIA
			sentencia.setString(1, h.getEmail());
			sentencia.setInt(2, h.getEdad());
			sentencia.setString(3, h.getPoblacion());
			sentencia.setString(4, h.getNombre());
			//ACTUALIZAMOS BBDD
			sentencia.executeUpdate();
			
			//CERRAMOS LA CONEXION
			conexion.close();
			
		} catch (SQLException e) {
			System.out.println("Error al actualizar la BBDD");
		}
	}
	public ArrayList<Habitante> get(){
		
		//CREAR LA LISTA DE HABITANTES
		ArrayList<Habitante> listaHabitantes = new ArrayList<Habitante>();
		
		
		//ESTABLECER LA CONEXIOM
		Connection conexion = new DBConnection().getConexion();
		
		try {
			//CREAMOS LA SENTENCIA
			//PARA QUERY SE CREA UN STAMENT
			Statement sentencia = conexion.createStatement();
			String sql = "SELECT * FROM habitante";
			//EJECUTAR QUERY
			ResultSet resultado = sentencia.executeQuery(sql);
			
			//RECORRER EL RESULTSET Y GENERAR LOS OBJETOS
			while (resultado.next()) {
				Habitante habitante = new Habitante(resultado.getString("nombre"),resultado.getString("email"),resultado.getShort("edad"),resultado.getString("poblacion"));
				listaHabitantes.add(habitante);
			}
			
			conexion.close();
			
			
		} catch (SQLException e) {
			System.out.println("Error en la seleccion de habitantes");
		}
		return listaHabitantes;
	}
	public Habitante get(String nombre){
		//CREAR LA VARIABLE PARA EL OBJETO DESEADO
		Habitante habitante=null;
		//ESTABLECER LA CONEXION
		Connection conexion = new DBConnection().getConexion();
		try {
			//CREAR LA SENTENCIA
			Statement sentencia = conexion.createStatement();
			
			//EJECUTAR QUERY
			String sql = "SELECT * FROM habitante WHERE nombre LIKE '"+nombre+"'";
			ResultSet resultado = sentencia.executeQuery(sql);
			
			//RECORRER EL RESULSET Y GENERAR LOS OBJETOS
			//LO HACEMOS CON IF PORQUE SABEMOS QUE CON ESE EMAIL SOLO HAY UN HABITANTE
			//GENERAR EL OBJETO
			if (resultado.next()) {
				habitante = new Habitante(resultado.getString("nombre"), resultado.getString("email"),resultado.getShort("edad"),  resultado.getString("poblacion"));
			}
			//CERRAMOS LA CONEXION
			conexion.close();
			
		} catch (SQLException e) {
			System.out.println("Error en la seleccion del habitante a traves del email");
		}
		return habitante;
	}
	public ArrayList<Habitante> getHabitantesDeUnaPoblacion(String nombrePoblacion){
		//CREAMOS EL ARRAY DE HABITANTES
		ArrayList<Habitante> listaDeHabitantes = new ArrayList<Habitante>();
		
		//OBTENEMOS LA CONEXION
		Connection conexion = new DBConnection().getConexion();

		try {
			//CREAMOS LA SENTENCIA
			Statement sentencia = conexion.createStatement();
			//EJECUTAMOS EL QUERY
			String sql = "SELECT * FROM habitante WHERE poblacion = '"+nombrePoblacion+"'";
			ResultSet resultado = sentencia.executeQuery(sql);
			//RECORREMOS EL RESULTSET Y GENERAMOS LOS OBJETOS
			//RECORREMOS CON UN WHILE PORQUE HAY MUCHOS HABITANTES
			while (resultado.next()) {
				Habitante h = new Habitante(resultado.getString("nombre"), resultado.getString("email"),resultado.getShort("edad"),  resultado.getString("poblacion"));
				listaDeHabitantes.add(h);
			}
			
			//CERRAMOS CONEXION 
			conexion.close();
			
		} catch (SQLException e) {
			System.out.println("Error al obtener la listaDeHabitantes de una Poblacion");
		}
		return listaDeHabitantes;
	}
	
}

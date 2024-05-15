package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private static String URL="jdbc:mysql://localhost/verduleros";
	private Connection conexion = null;
	
	public DBConnection(){
		
		try {
			 Class.forName("com.mysql.jdbc.Driver");
			this.conexion = DriverManager.getConnection(URL,"root","");
		} catch (ClassNotFoundException e) {
			System.out.println("No encuentra el driver");
		} catch (SQLException e) {
			System.out.println("Error estableciendo conexion");
		}
	}
	public Connection getConexion(){
		return conexion;
	}
}

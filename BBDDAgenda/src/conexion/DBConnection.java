package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection conexion;

	public DBConnection() {
		try {
			//cargar el driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar con la BBDD
			//Primero preparamos la url de conexión
			String url = "jdbc:mysql://localhost/agenda";
			//Creo el objeto conexión::: Ponemos la url, el usuario , la contraseña
			Connection conexion = DriverManager.getConnection(url, "root", "");
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en sentencia SQL");
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}
	
	
}

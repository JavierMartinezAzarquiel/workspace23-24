package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	private Connection conexion;
	
	public DBConnection() {
		try {
			//Cargar el Driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar con la BBDD
			//Primero preparo un String de conexión, una url
			String url = "jdbc:mysql://localhost/censo";
			//ahora creo el objeto conexión con la BBDD --> Ponemos la url, el usuario y la contraseña
			this.conexion = DriverManager.getConnection(url, "root", "");
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en una instrucción SQL");
			e.printStackTrace();
		}
	}

	public Connection getConexion() {
		return conexion;
	}
	
	
}

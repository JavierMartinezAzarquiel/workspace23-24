package pruebas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PruebaConexionBBDD {

	public static void main(String[] args) {
		// Probamos la conexión con BBDD mysql
		
		
		try {
			//cargar el driver JDBC
			Class.forName("com.mysql.jdbc.Driver");
			
			//Conectar con la BBDD
			//Primero preparamos la url de conexión
			String url = "jdbc:mysql://localhost/agenda";
			//Creo el objeto conexión::: Ponemos la url, el usuario , la contraseña
			Connection conexion = DriverManager.getConnection(url, "root", "");
			
			//Ahora lo que tenemos que hacer es lanzar sentencias SQL
			//Preparamos el objeto Sentencia(Statement)
			Statement sentencia = conexion.createStatement();
			
			//Preparar el insert
//			String sql = "INSERT INTO contactos VALUES('Javier', 657383732)";
//			sentencia.executeUpdate(sql);
//			String sql = "INSERT INTO contactos VALUES('María', 603939833)";
//			sentencia.executeUpdate(sql);
//			sql = "INSERT INTO contactos VALUES('Luis', 66656443)";
//			sentencia.executeUpdate(sql);
			
			
			//Lanzar un UPDATE
//			String sql = "UPDATE contactos SET telefono=66666666 WHERE nombre='Javier'";
//			sentencia.executeUpdate(sql);
			
			//deberíamos hacer un COMMIT para validar los cambios
//			conexion.commit();//no lo usamos porque tenemos autocommit
			
			//lanzar un SELECT
			String sql = "SELECT * FROM contactos";
			ResultSet resultado = sentencia.executeQuery(sql);
			
//			resultado.next(); //avanzo y me situo en la primera tupla
//			System.out.println( resultado.getString("nombre") );
//			System.out.println( resultado.getLong("telefono") );
//			resultado.next();
//			System.out.println( resultado.getString(1) );
//			System.out.println( resultado.getLong(2) );
//			resultado.next();
//			System.out.println( resultado.getString(1) );
//			System.out.println( resultado.getLong(2) );
//			resultado.next();
//			System.out.println( resultado.getString(1) );
//			System.out.println( resultado.getLong(2) );
			
			while (resultado.next()) {
				System.out.println(resultado.getString(1) + " " +resultado.getLong(2));
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error cargando el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error en sentencia SQL");
			e.printStackTrace();
		}
	}

}

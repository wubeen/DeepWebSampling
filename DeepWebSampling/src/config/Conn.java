package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
	public Connection connection = null;
	public Conn ()
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");

			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost/", "rokeer",
					"enjoylove");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection ()
	{		
		return connection;
	}
}

package model;

import java.sql.Connection;
import java.sql.DriverManager;


public class DbManager {
	public static Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsdemo","tcsdemo","password");  
		return connection;	
	}
}

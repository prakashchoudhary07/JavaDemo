package model;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.User;

public class UserDAO {
	public static List<User> getUser() throws Exception{
		List<User> user = new ArrayList<User>();
		Connection connection = null;
		Statement statement = null;
		ResultSet resultSet = null;
		try{
			connection = (Connection)DbManager.getConnection();
			statement = connection.createStatement();			
			resultSet = statement.executeQuery("SELECT * FROM tcsdemo.tcsdemo;");
			while(resultSet.next()){
				User userDetail = new User(resultSet.getInt(1),resultSet.getString(2));
				user.add(userDetail);
				System.out.println(userDetail);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			throw e;
		}finally{
			if(connection != null)
				connection.close();
		}
		return user;
	}
}

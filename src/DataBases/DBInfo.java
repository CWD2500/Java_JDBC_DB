
package DataBases;

import java.sql.Connection;
import java.sql.DriverAction;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBInfo {

	private static 	String userName = "java";
	private static	String password = "dbjava";
	private static String con ="jdbc:mysql://localhost/christiane"; //Database

	
	
	public static Connection connectDB() throws SQLException 
	{

		//Connect DataBase
		return  DriverManager.getConnection(con , userName , password); 
	}
	
}

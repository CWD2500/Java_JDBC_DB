package DataBases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {



	public static void main(String[] args) throws SQLException, IOException {
		
		try (
			
				Connection con = DBInfo.connectDB();
					Statement state = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
	
				
				
				) {
			
			//createTabe(state);
			InserDataUser(state);
			//insertDataBase(state);
			
		//	String update = "update `personals` set preosnID='2'  ";
		//	state.executeUpdate(update);
			
			//System.out.println("Donn update Data on personals");

			

		} catch (SQLException e) {
			System.out.println(e.getMessage());
	
	  }

	}

	
	private static void  InserDataUser(Statement state) throws SQLException, IOException
	{
	
		BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Id Name :");
		String insert = s.readLine();

		System.out.print("Enter First Name :");
		String insert2 = s.readLine();
		System.out.print("Enter last Name :");
		String insert3 = s.readLine();
		System.out.print("Enter address Name :");
		String insert4 = s.readLine();
		String insertData = "insert into `christiane` "+
				"(`preosnID`, `firstName`, `lastName`, `address`)"+ 
					" values ("+insert +","+insert2+","+insert3 +","+ insert4 +")";
			state.executeUpdate(insertData);
			System.out.println("Donn Insert Data on personals");
	} 
	
//	private static void insertDataBase(Statement state) throws SQLException {
//		String insertData = "insert into `personals` "+
//			"(`preosnID`, `firstName`, `lastName`, `address`)"+ 
//				" values (1 , 'Christiane' , 'soliman' ,'syaria alepp')";
//		state.executeUpdate(insertData);
//		System.out.println("Donn Insert Data on personals");
//	}

	private static void createTabe(Statement state) throws SQLException , IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Name Table : ");
		String newTable  =reader.readLine();
		//System.err.println(newTable);
	
		state.executeUpdate("DROP TABLE IF EXISTS  " +newTable );
		String sql = "CREATE TABLE `"+newTable+"`("
				+ "preosnID int  , firstName varchar(255),"+
				"lastName varchar(255) ,address Text)";
		state.executeUpdate(sql);
		System.out.println("Don Created ..!");
	}
	
	
}

package DataBases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StringBuliderssDataBase {

	public static void main(String[] args) {

		//		Closeded
		
		try(
				Connection con = DBInfo.connectDB();
				Statement  state =  con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet  result = state.executeQuery("select * from `job`");		
				) 
		{
			//redData(result);
			RetriveRedData.redData(result);


			//	result.last();
			//	System.out.println(result.getRow());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}



}

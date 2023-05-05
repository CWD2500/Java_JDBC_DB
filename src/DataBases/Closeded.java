package DataBases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.NumberFormat;

public class Closeded {

	public static void main(String[] args)throws SQLException {




		//		Closeded
		
		try(
				Connection con = DBInfo.connectDB();
				Statement  state =  con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
				ResultSet  result = state.executeQuery("select * from `job`");		
				) 
		{
			while(result.next()) 
				
			{
//				NumberFormat nF = NumberFormat.getCurrencyInstance();
//				Double  d = result.getDouble("salart");
//				String salary = nF.format(d);
				
				System.out.println("jobs :" + result.getInt("jobID")+" "+"-> " 
			+ result.getString("jobTitle") 
			+ " !  Description ?" + result.getString("jobDescription") +
			" "  );	
			}
			



			//			result.last();
			//			System.out.println(result.getRow());
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}

}

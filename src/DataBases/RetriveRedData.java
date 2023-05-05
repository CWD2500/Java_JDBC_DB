package DataBases;

import java.sql.ResultSet;
import java.sql.SQLException;

// Result Set
public class RetriveRedData {
	
	
	public static void redData(ResultSet result) throws SQLException {
		while(result.next()) 
			
		{

			StringBuilder sb = new StringBuilder();
			sb.append("jobs :" + result.getInt("jobID") + "->");
			sb.append("jobs :" + result.getString("jobTitle")+ "->");
			sb.append("jobs :" + result.getString("jobDescription")+ "->");
//				sb.append(" " + salary + " ");  // conver to String  Donn  ? ("  "  + int + " ")
			System.out.println(sb.toString());
		}
	}
}

package DataBases;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main  {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Connection con = DBInfo.connectDB();
	//	System.out.println("Connected ..!");
		
		Statement state = null;
		ResultSet result = null;
		
		try {
			state = con.createStatement(result.TYPE_SCROLL_SENSITIVE , result.CONCUR_READ_ONLY);
			String sql = "select  * from `job`";
			result = state.executeQuery(sql);
			
			result.last();
			System.out.println(result.getRow());
			System.out.println("Don ...! ");
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			if (result != null)
				result.close();
			if (result !=null)
				state.close();
			if (result !=null)
				con.close();
			
			
		}
		
		
		
		
	}

}

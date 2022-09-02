package eecs3421A2;
import java.sql.*;



public class A02MiddleTier {
	
	private static String dbUrl = "jdbc:mysql://127.0.0.1:3306/a02schema";
	private static String dbUsername = "root";
	private static String dbPassword = "root1234";
	//This class will contain your code for interacting with Database, acquire the query result and display it in the GUI text area.

	public static String getoutput(String query) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Connection conn = null;
				String out = "";
				try {
					conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
					System.out.println("Database connection established");
			        Statement stmt=conn.createStatement();  
			        ResultSet rs=stmt.executeQuery(query);
			        out = "Query:\n" + query + "\n\nOutput:\n";
			        while(rs.next())  
			        	out = out + String.valueOf((rs.getInt(1)))+ "  "+rs.getString(2)+"  "+rs.getString(3) + "\n";                    
			        conn.close ();
			        System.out.println("Database connection closed");
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e);
				}
				return out;
	}

}
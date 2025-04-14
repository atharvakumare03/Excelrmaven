package sql_connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class sql_setup {
	
	public static void main(String args[])
	{	 String url = "jdbc:mysql://localhost:3306/atharva";
     String user = "root";
     String password = "root";

     try (Connection conn = DriverManager.getConnection(url, user, password)) {
         System.out.println("Connected to MySQL!");

         String query = "SELECT * from employee"; // Adjust according to your table
         try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(query)) {
             System.out.println("Users in the database:");
             while (rs.next()) {
                 System.out.println("- " + rs.getString("First Name"));
             }
         }

     } catch (SQLException e) {
         e.printStackTrace();
     }

}
}

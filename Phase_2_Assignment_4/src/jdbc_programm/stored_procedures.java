package jdbc_programm;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class stored_procedures 
{
	static String url = "jdbc:mysql://localhost:3306/db_world";
    static String user = "root";
    static String password = "Siddesha@123";
    static String sql = "{call PRODUCT_PROC(?,?,?,?,?)}";
    private static Connection con;

	public static void main(String[] args) 
	{
		try {
	    	  
	    	  //STEP 2: Register JDBC driver
		      try {
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      con = DriverManager.getConnection(url, user, password);
		      
		      CallableStatement stmt=con.prepareCall(sql);
	         
	         //Set IN parameter
	         stmt.setInt(1, 2);  
	         stmt.setInt(2, 4);
	         stmt.setInt(3, 700);
	         System.out.println("hi");
	         
	         //Set OUT parameter
	         stmt.registerOutParameter(4, Types.VARCHAR);
	         stmt.registerOutParameter(5, Types.BIGINT);
	         
	         
	         
	         //Execute stored procedure
	         stmt.execute();
	         
	         // Get Out and InOut parameters
	         System.out.println("book Name = "+stmt.getString(4));
	         System.out.println("Product Old Price = "+stmt.getInt(5));
	         
	      } catch (SQLException e) {
	         e.printStackTrace();
	         e.getErrorCode();
	      }
	   }
		

	}



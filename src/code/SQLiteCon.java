/*
 * Add this file to every java project where you want to
 * connect to a SQLite database
 */


package code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
//import java.sql.ResultSet;

public class SQLiteCon {
	
	static Connection conn = null;
	
	public static Connection sqLiteGetConnect() {
	
		if (conn == null) {
			//String url = "jdbc:sqlite:C:/sqlite/databases/chinook.db";
			
			//Works!!
			String url = 
					"jdbc:sqlite:C:/Users/Jalen/Desktop/JavaPersonalWorkspace/loginSystem/src/tables/accounts.db";
			//Change this line to wherever the database is in sqLite
			// C:/sqlite/databases/chinook.db <-- Didnt work??
			try {
				conn = DriverManager.getConnection(url);
			}
			catch (SQLException e) {
				System.out.println(e);
				System.out.println("No Connection");
			}
		}
		else {
			System.out.println("Already Connected!");
		}
		return conn;
	}
	
	public static void sqLiteCloseConnect( ) {
		if (conn != null) {
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				System.out.println("error!");
			}
		}
		else {
			System.out.println("Connection already closed!");
		}
	}
	
}

package code;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Main {
	
	//Don't repeatedly open the database, create one connection only.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userChoice = 0;
				
		while (userChoice != 3) {
			
			ExtraMethods.printMenu();
			userChoice = ExtraMethods.getRequiredUserChoice();
			
			System.out.println(userChoice);
			
			switch(userChoice) {
			
				// Create New Account
				case 1:
					break;
					
				// Login
				case 2:
					break;
					
				// Exit
				case 3:
					System.out.println("Goodbye!");
					break;
			}
		}
		
		
		// Call function to close the scanner
		ExtraMethods.closeScanner();
		
		/* Create new Account option 
		 * (doesnt create the Account object)
		 *
		 * Account not created 
		 * 		get new username, password, and account name
		 * 		create new accountKey to connect all the database tables 
		 * 
		 * Account already created
		 * 		accept username 
		 * 		if username doesnt exist in database 
		 * 			"Account with username doesnt exist"
		 * 			loop back to accept username
		 * 		else 
		 * 			accept password
		 * 			if password doesnt exist in database
		 * 				"Username and Password dont match"
		 * 				loop back to accept password
		 * 			else 
		 * 				"Account opened!!"
		 * 
		 */
		
		/*
		 * Could create an account object for easy access and storage
		 * 		Could also add other values later as the account
		 * 		grows to hold different things
		 * 
		 * public class Account
		 * 
		 * - private AccountKey variable
		 * 		(dont know the type yet)
		 * - private String username
		 * - private String password
		 * - private String accountName
		 * 
		 * - default constructor
		 * - parameterized constructor 
		 * 
		 * - getAccountKey
		 * - getAccountName
		 * - getAccountUsername
		 * - getAccountPassword
		 * 
		 * - setAccountName
		 * - setAccountUsername
		 * - setAccountPassword
		 * 
		 */
		
		/*
		 * Other things to add later
		 * 	- once new account is created "Open it?"
		 *  - 
		*/
		
		/*
		//works!
		String sql =
				//"drop table if exists Username;\n"
				"Create table if not exists Username\n "
				+ "(\n"
				//+ "ID\tINT\tPRIMARY KEY\tAUTO_INCREMENT,\n"
				+ "NAME\tSTRING\n"
				+ ");";
		
		try {
			
			// Holds Connection (Acts as an abbreviation)
			Connection abrCon = SQLiteCon.sqLiteGetConnect();
			//Drops and Creates Table
			PreparedStatement pState =
					abrCon.prepareStatement(sql);
			//ResultSet returnSet = pState.executeQuery();
			pState.executeUpdate();
			//executeQuery() is when you need to return results from the sql commands
			//executeUpdate() just updates the sqlite files
			
			
			//Adds a value to the column "Name" of table "Username"
			//(does this each time code is run)
			sql = 
				"insert into Username(NAME) " 
				+ "values(\"James\");";
			pState = abrCon.prepareStatement(sql);
			pState.executeUpdate();
			
			
			//Retrieves all columns from table "Username"
			sql =
				"select * from Username;";
			
			pState = abrCon.prepareStatement(sql);
			ResultSet rs = pState.executeQuery();
			
			
			while(rs.next()) {
				System.out.println(rs.getString("NAME"));
			}
			
			
			// Closes database connection
			SQLiteCon.sqLiteCloseConnect();
			
		}
		catch (SQLException | NullPointerException e) {
			System.out.println(e);
			System.out.println("Didnt work.");
		}
		*/
	}

}

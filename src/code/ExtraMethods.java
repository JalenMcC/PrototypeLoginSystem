package code;

import java.util.Scanner;

//Exceptions
import java.util.InputMismatchException;

public class ExtraMethods {

	private static Scanner sc = new Scanner(System.in);
	
	public static void resetDatabase() {
		
	}
	
	//Prints the menu
	public static void printMenu() {
		System.out.println();
		System.out.println("1) Create Account");
		System.out.println("2) Login");
		System.out.println("3) Exit");
		System.out.println();
	}
	
	
	// Gets a number from the user
	public static int getRequiredUserChoice() {
		int userChoice;
		while (true) {
			try {
				// Gets number 
				System.out.print("Enter a selection: ");
				userChoice = sc.nextInt();
				//sc.nextLine();
				
				// Defines menu bounds
				if ((userChoice < 1) || (userChoice > 3)) {
					throw new InputMismatchException();
				}
				break;
			}
			
			// Deals with incorrect input
			catch(InputMismatchException e) {
				System.out.println("\nA number between 0 and 4 (non-inclusive) is required");
				sc.nextLine();			}	
		}
		
		//sc.nextLine();
		return userChoice;
	}
 
	// Closes the scanner object
	public static void closeScanner() {
		sc.close();
	}
	
	//
	public static void createNewAccount() {
		
	}
	
	//
	public static void loadNewAccount() {
		
	}
}

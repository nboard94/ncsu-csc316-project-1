package edu.ncsu.csc316.grocerystore.ui;

import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.manager.GroceryStoreManager;

/**
 * Interacts with the user via command line in order
 * to retrieve filepath input.
 * @author Nicholas Board (ndboard)
 */
public class CommandPromptUI {

	/** The single instance of the GroceryStoreManager. */
	GroceryStoreManager manager;
	/** The filepath for the customer file. */
	String customerFile;
	/** The filepath for the product file. */
	String orderFile;
	/** Any other user input. */
	String command = "";
	/** Name of the product to look up. */
	String brandName = "";
	/** Description of the product to look up. */
	String productDescription = "";
	
	/**
	 * CommandPrompt constructor, does nothing.
	 */
	public CommandPromptUI() {
		// This constructor is intentionally empty. Nothing special is needed here.
	}
	
	/**
	 * Where the program starts.
	 * @param args Would contain arguments.
	 */
	public static void main(String args[]) {
		CommandPromptUI commandLine = new CommandPromptUI();
		Scanner commandScan = new Scanner(System.in);
		
		//TODO take out these hard strings
		System.out.println("Please provide the filepath for the customerFile:");
		//setCustomerFile(commandScan.next());
		commandLine.setCustomerFile("input/customers_small.txt");
		
		System.out.println("Please provide the filepath for the orderFile:");
		//setOrderFile(commandScan.next());
		commandLine.setOrderFile("input/order_small.txt");
		
		commandLine.manager = new GroceryStoreManager(commandLine.getOrderFile(), commandLine.getCustomerFile());
		
		while (!commandLine.command.equals("exit")) {
			System.out.println("Enter 'c' to print out customers in order."
							+	"\nEnter 'p' to look up a product."
							+	"\nEnter 'exit' to quite the program.");
			
			commandLine.command = commandScan.nextLine();
			
			if (commandLine.command.equals("c")) {
				commandLine.manager.getCustomerData();
			}
			else if (commandLine.command.equals("p")) {
				System.out.println("Name of brand to lookup:");
				commandLine.brandName = commandScan.nextLine();
				System.out.println("Description of product to lookup:");
				commandLine.productDescription = commandScan.nextLine();
				
				commandLine.manager.getProduct(commandLine.brandName, commandLine.productDescription);
			}
			else if (commandLine.command.equals("exit")) {
				System.exit(0);
			}
			else {
				System.out.println("Invalid input");
			}
		}
		
		commandScan.close();
	}
	
	/**
	 * Sets the filepath for the customer file.
	 * @param fileName User-input filepath for the customer file.
	 */
	private void setCustomerFile(String fileName) {
		customerFile = fileName;
	}
	
	/**
	 * Sets the filepath for the product file.
	 * @param fileName User-input filepath for the product file.
	 */
	private void setOrderFile(String fileName) {
		orderFile = fileName;
	}
	
	/**
	 * Getter for the customer filepath.
	 * @return customerFile the path of the customer file.
	 */
	public String getCustomerFile() {
		return customerFile;
	}
	
	/**
	 * Getter for the product filepath.
	 * @return orderFile the path of the product file.
	 */
	public String getOrderFile() {
		return orderFile;
	}
}

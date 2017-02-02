package edu.ncsu.csc316.grocerystore.ui;

import java.util.Scanner;

/**
 * Interacts with the user via command line in order
 * to retrieve filepath input.
 * @author Nicholas Board (ndboard)
 */
public class CommandPromptUI {

	/** The filepath for the customer file. */
	String customerFile;
	/** The filepath for the product file. */
	String orderFile;
	
	/**
	 * CommandPrompt constructor, does nothing.
	 */
	public CommandPromptUI() {
		// This constructor is intentionally empty. Nothing special is needed here.
	}
	
	/**
	 * Prints queries and takes input via command line.
	 */
	public void interact() {
		Scanner commandScan = new Scanner(System.in);
		
		System.out.println("Please provide the filepath for the customerFile:\n\t");
		setCustomerFile(commandScan.next());
		
		System.out.println("\n\nPlease provide the filepath for the orderFile:\n\t");
		setOrderFile(commandScan.next());
		
		System.out.println("\n\nThank you!\n");
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

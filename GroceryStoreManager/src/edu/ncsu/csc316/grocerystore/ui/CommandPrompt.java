package edu.ncsu.csc316.grocerystore.ui;

import java.util.Scanner;

public class CommandPrompt {

	String customerFile;
	String orderFile;
	
	public CommandPrompt() {
		// This constructor is intentionally empty. Nothing special is needed here.
	}
	
	public void interact() {
		Scanner commandScan = new Scanner(System.in);
		
		System.out.println("Please provide the filepath for the customerFile:\n\t");
		setCustomerFile(commandScan.next());
		
		System.out.println("\n\nPlease provide the filepath for the orderFile:\n\t");
		setOrderFile(commandScan.next());
		
		System.out.println("\n\nThank you!\n");
		commandScan.close();
	}
	
	private void setCustomerFile(String fileName) {
		customerFile = fileName;
	}
	
	private void setOrderFile(String fileName) {
		orderFile = fileName;
	}
	
	public String getCustomerFile() {
		return customerFile;
	}
	
	public String getOrderFile() {
		return orderFile;
	}
}

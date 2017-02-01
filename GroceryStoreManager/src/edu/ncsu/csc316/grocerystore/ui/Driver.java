package edu.ncsu.csc316.grocerystore.ui;

import edu.ncsu.csc316.grocerystore.manager.GroceryStoreManager;

public class Driver {
	
	static String customerFile;
	static String orderFile;
	
	public static void main(String args[]) {
		
		CommandPrompt cp = new CommandPrompt();
		cp.interact();
		
		
		
	}

}

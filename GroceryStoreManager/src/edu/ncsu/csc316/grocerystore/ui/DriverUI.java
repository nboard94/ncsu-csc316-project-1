package edu.ncsu.csc316.grocerystore.ui;

/**
 * Contains the main method that starts the program
 * and the GroceryStoreManager object.
 * @author Nicholas Board (ndboard)
 */
public class DriverUI {
	
	/** The filepath for the customer file. */
	static String customerFile;
	/** The filepath for the product file. */
	static String orderFile;
	
	/**
	 * Where the program starts.
	 * @param args Would contain arguments.
	 */
	public static void main(String args[]) {
		
		CommandPromptUI cp = new CommandPromptUI();
		cp.interact();
		
	}
}

package edu.ncsu.csc316.grocerystore.customer.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

/**
 * Class to read in the data from a customer file.
 * @author Nicholas Board (ndboard)
 */
public class CustomerFileReader {
	
	/** The customer data. */
	private ArrayBasedList<Customer> data = new ArrayBasedList<Customer>();
	/** The current customer while looping. */
	private Customer currentCust = new Customer("", "", "", 0);
	
	private String currentLine;
	
	private String[] currentData;

	/**
	 * Scans in a file, adding customer data to the ArrayBasedList.
	 * @param filePath The path to the customer file.
	 * @throws FileNotFoundException 
	 */
	public CustomerFileReader(String filePath) {
		
		File file = new File(filePath);
		Scanner scan;
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			throw new RuntimeException();
		}
		
		
		while (scan.hasNextLine()) {
			currentLine = scan.nextLine();
			currentData = currentLine.split(",");
			
			for(int i = 0; i < currentData.length; i++) {
				currentData[i] = currentData[i].trim();
			}
			
			currentCust.setCustomerID(currentData[0]);
			currentCust.setCustomerName(currentData[1]);
			currentCust.setCustomerState(currentData[2]);
			currentCust.setCustomerZipcode(Integer.valueOf(currentData[3]));
			
			data.add(currentCust);
		}
		
		scan.close();
		
	}
	
	/**
	 * Getter method for the data.
	 * @return data The customer data in an ArrayBasedList.
	 */
	public ArrayBasedList<Customer> getData() {
		return data;
		
	}
}

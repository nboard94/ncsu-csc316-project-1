package edu.ncsu.csc316.grocerystore.customer.io;

import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

/**
 * @author Nicholas Board (ndboard)
 * Class to read in the data from a customer file.
 */
public class CustomerFileReader {
	
	/** The customer data. */
	private ArrayBasedList<Customer> data = new ArrayBasedList<Customer>();
	/** The current customer while looping. */
	private Customer currentCust;

	/**
	 * Scans in a file, adding customer data to the ArrayBasedList.
	 * @param filePath The path to the customer file.
	 */
	public CustomerFileReader(String filePath) {
		
		Scanner scan = new Scanner(filePath);
		scan.useDelimiter(",");
		
		while (scan.hasNextLine()) {
			currentCust.setCustomerID(scan.next());
			currentCust.setCustomerName(scan.next());
			currentCust.setCustomerState(scan.next());
			currentCust.setCustomerZipcode(Integer.valueOf(scan.next()));
			
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

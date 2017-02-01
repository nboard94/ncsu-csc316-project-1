package edu.ncsu.csc316.grocerystore.customer.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

public class CustomerFileReader {
	
	private ArrayBasedList<Customer> data = new ArrayBasedList<Customer>();
	private Customer currentCust;

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
	
	public ArrayBasedList<Customer> getData() {
		return data;
		
	}
	
	
	
	
}

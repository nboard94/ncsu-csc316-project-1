package edu.ncsu.csc316.grocerystore.io;

import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

public class CustomerReader {

	private ArrayBasedList<Customer> tempList = new ArrayBasedList<Customer>();
	private String file;
	private Customer tempCustomer;
	private String[] tempLine;
	
	public CustomerReader(String filePath) {
		file = filePath;
	}
	
	public ArrayBasedList<Customer> readCustomerData() {
		
		Scanner fileScan = new Scanner(file);
		
		while ( fileScan.hasNextLine() ) {
			tempLine = fileScan.nextLine().split(",");
			
			for ( int i = 0; i < tempLine.length; i++) {
				tempLine[i] = tempLine[i].trim();
			}
			
			tempCustomer.setCustomerID(tempLine[0]);
			tempCustomer.setCustomerName(tempLine[1]);
			tempCustomer.setCustomerState(tempLine[2]);
			tempCustomer.setCustomerZipcode(Integer.valueOf(tempLine[3]));
			
			tempList.add(tempCustomer);
		}
		
		fileScan.close();
		return tempList;
	}
}

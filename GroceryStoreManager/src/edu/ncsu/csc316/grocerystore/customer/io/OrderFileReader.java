package edu.ncsu.csc316.grocerystore.customer.io;

import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;

/**
 * Class to read in the data from an order file.
 * @author Nicholas Board (ndboard)
 */
public class OrderFileReader {

	/** The product data. */
	private ArrayBasedList<Product> data = new ArrayBasedList<Product>();
	/** The current product while looping. */
	private Product currentProd = new Product("", "");

	/**
	 * Scans in a file, adding product data to the ArrayBasedList.
	 * @param filePath The path to the order file.
	 */
	public OrderFileReader(String filePath) {
		 
		Scanner scan = new Scanner(filePath);
		
		while (scan.hasNextLine()) {
			currentProd.setBrand(scan.nextLine());
			
			data.add(currentProd);
		}
		
		scan.close();
		
	}
	
	/**
	 * Getter method for the data.
	 * @return data The customer data in an ArrayBasedList.
	 */
	public ArrayBasedList<Product> getData() {
		return data;
		
	}
	
}

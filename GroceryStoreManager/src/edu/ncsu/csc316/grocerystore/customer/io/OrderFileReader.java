package edu.ncsu.csc316.grocerystore.customer.io;

import java.io.File;
import java.io.FileNotFoundException;
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
	/** The current line. */
	private String currentLine;
	/** The current product's brand. */
	private String currentBrand;
	/** The current product's description. */
	private String currentDescription;

	/**
	 * Scans in a file, adding product data to the ArrayBasedList.
	 * @param filePath The path to the order file.
	 * @throws FileNotFoundException 
	 */
	public OrderFileReader(String filePath) throws FileNotFoundException {
		
		File file = new File(filePath);
		Scanner scan = new Scanner(file);
		
		while (scan.hasNextLine()) {
			
			currentLine = scan.nextLine();
			currentBrand = currentLine.substring(0, currentLine.indexOf(' '));
			currentDescription = currentLine.substring(currentLine.indexOf(' '));
			
			currentBrand = currentBrand.trim();
			currentDescription = currentDescription.trim();
			
			currentProd.setBrand(currentBrand);
			currentProd.setDescription(currentDescription);
			
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

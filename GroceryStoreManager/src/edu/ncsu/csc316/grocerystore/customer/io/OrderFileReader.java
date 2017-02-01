package edu.ncsu.csc316.grocerystore.customer.io;

import java.util.Scanner;

import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;

public class OrderFileReader {

	private ArrayBasedList<Product> data = new ArrayBasedList<Product>();
	private Product currentProd;

	public OrderFileReader(String filePath) {
		 
		Scanner scan = new Scanner(filePath);
		
		while (scan.hasNextLine()) {
			currentProd.setBrand(scan.nextLine());
			
			data.add(currentProd);
		}
		
		scan.close();
		
	}
	
	public ArrayBasedList<Product> getData() {
		return data;
		
	}
	
}

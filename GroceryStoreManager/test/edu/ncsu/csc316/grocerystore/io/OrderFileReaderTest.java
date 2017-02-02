package edu.ncsu.csc316.grocerystore.io;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;

import org.junit.Test;

import edu.ncsu.csc316.grocerystore.customer.io.OrderFileReader;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;

/**
 * Testing class for the OrderFileReader object.
 * @author Nicholas Board (ndboard)
 */
public class OrderFileReaderTest {

	/** Filepath of the small order testing file. */
	String testFile = "input/order_small.txt";
	
	@Test
	public void testOrderFileReader() throws FileNotFoundException {
		
		OrderFileReader ordReadTest = new OrderFileReader(testFile);
		
		ArrayBasedList<Product> data = ordReadTest.getData();
		
		assertEquals(50000, data.size());
	}
}

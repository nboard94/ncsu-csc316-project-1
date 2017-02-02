package edu.ncsu.csc316.grocerystore.io;

import static org.junit.Assert.*;

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
	
	/**
	 * Tests the functionality of the OrderFileReader.
	 */
	@Test
	public void testOrderFileReader() {
		
		OrderFileReader ordReadTest = new OrderFileReader(testFile);
		
		ArrayBasedList<Product> data = ordReadTest.getData();
		
		assertEquals(50000, data.size());
		
		try {
			ordReadTest = new OrderFileReader("bologna");
			fail();
		} catch (RuntimeException e) {
			assertEquals(50000, data.size());
		}
	}
}

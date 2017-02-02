package edu.ncsu.csc316.grocerystore.io;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.customer.io.CustomerFileReader;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

/**
 * Testing class for the CustomerFileReader object.
 * @author Nicholas Board (ndboard)
 */
public class CustomerFileReaderTest {

	/** Filepath of the small customers testing file. */
	String testFile = "input/customers_small.txt";
	
	/**
	 * Tests the functionality of the CustomerFileReader.
	 */
	@Test
	public void testCustomerFileReader() {
		
		CustomerFileReader custReadTest = new CustomerFileReader(testFile);
		
		ArrayBasedList<Customer> data = custReadTest.getData();
		
		assertEquals(50000, data.size());
		
		try {
			custReadTest = new CustomerFileReader("bologna");
			fail();
		} catch (RuntimeException e) {
			assertEquals(50000, data.size());
		}
	}
	
	

}

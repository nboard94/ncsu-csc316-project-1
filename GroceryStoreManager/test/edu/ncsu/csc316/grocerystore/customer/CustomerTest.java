package edu.ncsu.csc316.grocerystore.customer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class for testing the Customer object and associated methods.
 * @author Nicholas Board (ndboard)
 */
public class CustomerTest { 
	
	/**
	 * Method for testing the construction, getters, and setters for customer.
	 */
	@Test
	public void testCustomer() {
		Customer testCust = new Customer( "testID", "testName", "testState", 27511);
		
		assertEquals( "testID", testCust.getCustomerID() );
		assertEquals( "testName", testCust.getCustomerName() );
		assertEquals( "testState", testCust.getCustomerState() );
		assertEquals( 27511, testCust.getCustomerZipcode() );
		
	}
	
}

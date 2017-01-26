package edu.ncsu.csc316.grocerystore.customer;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Nicholas Board (ndboard)
 * Class for testing the Customer object and associated methods.
 */
public class CustomerTest { 
	
	/**
	 * Method for testing the construction, getters, and setters for customer.
	 */
	@Test
	public void testCustomer() {
		Customer testCust = new Customer( "testID", "testName", "testState", 27511);
		
		assertEquals( "testID", testCust.getCustomerID());
		assertEquals( "testName", testCust.getCustomerName() );
		assertEquals( "testState", testCust.getCustomerState() );
		assertEquals( 27511, testCust.getCustomerZipcode() );
		
	}
	
}

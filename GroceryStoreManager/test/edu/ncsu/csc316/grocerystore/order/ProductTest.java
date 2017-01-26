package edu.ncsu.csc316.grocerystore.order;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Nicholas Board (ndboard)
 * Class for testing the Product object and associated methods.
 */
public class ProductTest {

	/**
	 * Method for testing the construction, getters, and setters for product.
	 */
	@Test
	public void testProduct() {
		Product testProd = new Product( "testBrand", "testDescription" );
		
		assertEquals( "testBrand", testProd.getBrand() );
		assertEquals( "testDescription", testProd.getDescription() );
	}
}

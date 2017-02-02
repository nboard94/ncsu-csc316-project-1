package edu.ncsu.csc316.grocerystore.order;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Class for testing the Product object and associated methods.
 * @author Nicholas Board (ndboard)
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

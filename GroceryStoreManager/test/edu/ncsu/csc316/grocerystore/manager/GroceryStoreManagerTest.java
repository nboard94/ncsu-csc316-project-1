package edu.ncsu.csc316.grocerystore.manager;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;

/**
 * Tests for the GroceryStoreManager class.
 * @author Nicholas Board (ndboard)
 */
public class GroceryStoreManagerTest {
	
	String prodPath = "input/unitTestProducts";
	String custPath = "input/unitTestCustomers";
	
	ArrayBasedList<Customer> custList = new ArrayBasedList<Customer>();
	ArrayBasedList<Product> prodList = new ArrayBasedList<Product>();
	
	/**
	 * Tests the GroceryStoreManager.
	 */
	@Test
	public void testGroceryStoreManager() {
		
		GroceryStoreManager store = new GroceryStoreManager(prodPath, custPath);
		
		Customer oneCust = store.getCustomerData().get(0);
		Product oneProd = store.getProductData().get(0);
		
		custList.add(oneCust);
		prodList.add(oneProd);
		
		String prodExpect = "Product [brand=Wolf, description=mustard, frequency=2]";
		assertEquals(prodExpect, store.getProduct("Wolf", "mustard"));
		
		//String custExpect = "Customer [id=C1657233, company=U-Krop, state=IL, zipcode=88295]\n ";
		store.getCustomers();
	
	}
}

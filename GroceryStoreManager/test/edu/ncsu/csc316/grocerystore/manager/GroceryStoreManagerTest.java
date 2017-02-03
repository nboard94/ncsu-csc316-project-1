package edu.ncsu.csc316.grocerystore.manager;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.customer.io.CustomerFileReader;
import edu.ncsu.csc316.grocerystore.customer.io.OrderFileReader;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;

public class GroceryStoreManagerTest {
	
	String custFile = "input/unitTestProducts";
	String prodFile = "input/unitTestCustomers";
	
	private ArrayBasedList<Customer> customerList = new ArrayBasedList<Customer>();
	private ArrayBasedList<Product> productList = new ArrayBasedList<Product>();


	@Test
	public void testGroceryStoreManager() {
		GroceryStoreManager store = new GroceryStoreManager(prodFile, custFile);
		
		CustomerFileReader cr = new CustomerFileReader(custFile);
		
		OrderFileReader pr = new OrderFileReader(prodFile);
		
		for (int i = 0; i < customerList.size(); i++) {
			assertEquals(customerList.get(i).getCustomerID(), store.getCustomerData().get(i).getCustomerID());
		}
		
		for (int i = 0; i < productList.size(); i++) {
			assertEquals(productList.get(i).getBrand(), store.getProductData().get(i).getBrand());
	
		assertEquals(customerList, store.getCustomerData());
		assertEquals(productList, store.getProductData());
		}
		
		
	}
	
	@Test
	public void getCustomersTest() {
		GroceryStoreManager store = new GroceryStoreManager(prodFile, custFile);

		String getCustomersExpected = "Customer [id=" + "C9093150"
				+ ", company=" + "Alberto's Son's"
				+ ", state=" + "HI"
				+ ", zipcode=" + "17190"
				+ "\n"
				+ "Customer [id=" + "C3850344"
				+ ", company=" + "Smith's"
				+ ", state=" + "PA"
				+ ", zipcode=" + "14071";
		
		assertEquals(getCustomersExpected, store.getCustomers());
	}
}

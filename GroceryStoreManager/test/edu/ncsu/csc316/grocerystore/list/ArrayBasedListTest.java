package edu.ncsu.csc316.grocerystore.list;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.order.Product;

/**
 * Tests the ArrayBasedList data structure.
 * @author Nicholas Board (ndboard)
 */
public class ArrayBasedListTest {

	/** The ArrayBasedList to use when testing. */
	ArrayBasedList<Object> smallList;
	/** A Customer object to use when testing. */
	Customer testCust;
	/** A Product object to use when testing. */
	Product testProd;
	
	/**
	 * Tests the constructor of the ArrayBasedList.
	 */
	@Before
	public void testArrayBastList() {
		smallList = new ArrayBasedList<Object>();
		testCust = new Customer("testID", "testName", "testState", 0);
		testProd = new Product("testBrand", "testDesc");
		
	}
	
	/**
	 * Tests the size getter for ArrayBasedList.
	 */
	@Test
	public void testSize() {
		assertEquals(0, smallList.size());
	}
	
	/**
	 * Tests adding objects to the ArrayBasedList.
	 */
	@Test
	public void addTest() {
	    smallList.add(testCust);
	    
	    assertEquals(1, smallList.size());
	    assertEquals(testCust, smallList.get(0));
	    
	    smallList.add(testProd);
	    assertEquals(2, smallList.size());
	    assertEquals(testProd, smallList.get(1));
	    
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    smallList.add(testCust);
	    
	    assertEquals(11, smallList.size());
	}
	
	/**
	 * Tests the swap method in ArrayBasedList.
	 */
	@Test
	public void swapTest() {
		ArrayBasedList<Customer> list = new ArrayBasedList<Customer>();
		
		Customer cust1 = new Customer("doe", "rae", "mii", 100);
		Customer cust2 = new Customer("a", "b", "c", 5);
		
		list.add(cust1);
		list.add(cust2);
		
		assertEquals(cust1, list.get(0));
		assertEquals(cust2, list.get(1));
		
		list.swap(0, 1);
		
		assertEquals(cust2, list.get(0));
		assertEquals(cust1, list.get(1));
	}
}

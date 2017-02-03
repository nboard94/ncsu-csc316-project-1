package edu.ncsu.csc316.grocerystore.sorter;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.customer.io.CustomerFileReader;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

/**
 * Tests the functionalist of the Sorted class.
 * @author Nicholas Board (ndboard)
 */
public class SortedTest {

	@Test
	public void testSorted() {
		
		ArrayBasedList<Customer> customerList = new ArrayBasedList<Customer>();		
		Sorted sortMan = new Sorted();
		
		CustomerFileReader custReader = new CustomerFileReader("input/customers_small.txt");
        customerList = custReader.getData();

        customerList = sortMan.quicksort(customerList, 0, customerList.size() - 1);
	
        assertEquals(50000, customerList.size());
	}
}

package edu.ncsu.csc316.grocerystore.manager;

import java.io.FileNotFoundException;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.customer.io.CustomerFileReader;
import edu.ncsu.csc316.grocerystore.customer.io.OrderFileReader;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;

/**
 * The GroceryStoreManager handles the customer and
 * product data, as well as provides operations for
 * sort customers and looking up products.
 * @author Nicholas Board (ndboard)
 */
public class GroceryStoreManager {

	/** The list of customer data. */
	private ArrayBasedList<Customer> customerList = new ArrayBasedList<Customer>();
	/** The list of product data. */
	private ArrayBasedList<Product> productList = new ArrayBasedList<Product>();
	
    /**
     * Constructs a new GroceryStoreManager object using
     * the two input files of customers and products
     *  
     * @param pathToProductFile - the path to the product file
     * @param pathToCustomerFile - the path to the customer file
     */
    public GroceryStoreManager(String pathToProductFile, String pathToCustomerFile) {
        CustomerFileReader custReader = new CustomerFileReader(pathToCustomerFile);
        customerList = custReader.getData();
        
        OrderFileReader orderReader = new OrderFileReader(pathToProductFile);
        productList = orderReader.getData();
        
        System.out.print(this.getCustomers());
    }
    
    /**
     * Returns the list of customers sorted in ascending order by customer ID 
     * as a String in the following format:
     * 
     * Customer [id=C0000473, company=Wigmann's, state=DE, zipcode=45272]
     * Customer [id=C0000646, company=Super Food, state=CA, zipcode=22962]
     * Customer [id=C0000679, company=Martino's, state=SD, zipcode=05989]
     * ... and so on
     * 
     * @return the sorted list of customers
     */
    public String getCustomers()
    {
    	Customer currentCustomer;
    	String output = "";
    	
    	for (int i = 0; i < customerList.size(); i++) {
    		currentCustomer = customerList.get(i);
    		
    		output += "Customer [id=" + currentCustomer.getCustomerID()
    					+ ", company=" + currentCustomer.getCustomerName()
    					+ ", state=" + currentCustomer.getCustomerState()
    					+ ", zipcode=" + currentCustomer.getCustomerZipcode()
    					+ "\n";
    	}
    	
		return output;
    }
    
    /**
     * Returns the product as a String in the following format:
     * Product [brand=Wolf, description=soda, frequency=698]
     * 
     * @param brand - the brand of the product to lookup
     * @param description - the description of the product to lookup
     * @return the full product information
     */
    public String getProduct(String brand, String description)
    {

        //TODO your code here
		return description;
    }
    
    /**
     * Getter method for the customerList.
     * @return customerList the list of customer data.
     */
    public ArrayBasedList<Customer> getCustomerData() {
    	return customerList;
    }
    
    /**
     * Getter method for the productList.
     * @return productList the list of product data.
     */
    public ArrayBasedList<Product> getProductData() {
    	return productList;
    }
    
    /**
     * Setter method for the customerList.
     * @param newData the new version of the customerList.
     */
    private void setCustomerData(ArrayBasedList<Customer> newData) {
    	customerList = newData;
    }
    
    /**
     * Setter method for the productList.
     * @param newData the new version of the productList.
     */
    private void setProductData(ArrayBasedList<Product> newData) {
    	productList = newData;
    }
}

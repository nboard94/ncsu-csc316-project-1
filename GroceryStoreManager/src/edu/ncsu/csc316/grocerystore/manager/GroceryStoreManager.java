package edu.ncsu.csc316.grocerystore.manager;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.customer.io.CustomerFileReader;
import edu.ncsu.csc316.grocerystore.customer.io.OrderFileReader;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;
import edu.ncsu.csc316.grocerystore.order.Product;
import edu.ncsu.csc316.grocerystore.sorter.Sorted;

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
        this.setCustomerData(custReader.getData());
        
        OrderFileReader orderReader = new OrderFileReader(pathToProductFile);
        this.setProductData(orderReader.getData());
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
    	StringBuilder sb = new StringBuilder(output);
    	Sorted sortGuy = new Sorted();
    	
    	
    	//long startTime = System.nanoTime();
    	customerList = sortGuy.quicksort(customerList, 0, customerList.size() - 1);
    	//long time = System.nanoTime() - startTime;
    	
    	
    	int topad;
    	String curzip;
    	
    	for (int i = 0; i < customerList.size(); i++) {
    		currentCustomer = customerList.get(i);
    		
//    		topad = Integer.toString(currentCustomer.getCustomerZipcode());
//    		while (topad.length() < 5) {
//    			topad = "0" + topad;
//    		}
//    		curzip = Integer.valueOf(topad);
    		//String.format("%05d",number);
    		
    		topad = currentCustomer.getCustomerZipcode();
    		curzip = String.format("%05d", topad);
    		
    		
    		sb.append("Customer [id=" + currentCustomer.getCustomerID()
			+ ", company=" + currentCustomer.getCustomerName()
			+ ", state=" + currentCustomer.getCustomerState()
			+ ", zipcode=" + curzip
			+ "]\n");
    	}
    	
    	output = sb.toString();
    //	output += "\n" + "Total time: " + time * Math.pow(10, -9);
    	
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
    	int frequency = 0;
    	for (int i = 0; i < productList.size(); i++) {
    		if (productList.get(i).getBrand().equals(brand) && productList.get(i).getDescription().equals(description)) {
    			frequency++;
    		}
    	}
    	
    	return "Product [brand=" + brand + ", description=" + description + ", frequency=" + frequency + "]";
    	
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

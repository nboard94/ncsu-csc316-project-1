package edu.ncsu.csc316.grocerystore.manager;

public class GroceryStoreManager {

    /**
     * Constructs a new GroceryStoreManager object using
     * the two input files of customers and products
     * 
     * @param pathToProductFile - the path to the product file
     * @param pathToCustomerFile - the path to the customer file
     */
    public GroceryStoreManager(String pathToProductFile, String pathToCustomerFile)
    {
        //TODO your code here    	
    	
    	
    	
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
		return null;
        //TODO your code here
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
}

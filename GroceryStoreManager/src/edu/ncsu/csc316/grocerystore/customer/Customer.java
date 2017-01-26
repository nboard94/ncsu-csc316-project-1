package edu.ncsu.csc316.grocerystore.customer;

/**
 * @author Nicholas Board (ndboard)
 * Handles the creation and methods of Customer objects.
 */
public class Customer {

	/** A customer's ID */
	String customerID;
	
	/** A customer's name */
	String customerName;
	
	/** A customer's state */
	String customerState;
	
	/** A customer's zipcode */
	int customerZipcode;
	
	/**
	 * Constructor for a customer object.
	 * @param newID id of the new customer.
	 * @param newName name of the new customer.
	 * @param newState state of the new customer.
	 * @param newZipcode zipcode of the new customer.
	 */
	public Customer( String newID, String newName, String newState, int newZipcode ) {
		this.setCustomerID(newID);
		this.setCustomerName(newName);
		this.setCustomerState(newState);
		this.setCustomerZipcode(newZipcode);
	}

	/**
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * @return the customerState
	 */
	public String getCustomerState() {
		return customerState;
	}

	/**
	 * @param customerState the customerState to set
	 */
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	/**
	 * @return the customerZipcode
	 */
	public int getCustomerZipcode() {
		return customerZipcode;
	}

	/**
	 * @param customerZipcode the customerZipcode to set
	 */
	public void setCustomerZipcode(int customerZipcode) {
		this.customerZipcode = customerZipcode;
	}
}

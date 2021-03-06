package edu.ncsu.csc316.grocerystore.customer;

/**
 * Handles the creation and methods of Customer objects.
 * @author Nicholas Board (ndboard)
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
	 * Getter for customerID.
	 * @return the customerID
	 */
	public String getCustomerID() {
		return customerID;
	}

	/**
	 * Setter for customerID.
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	/**
	 * Getter for customerName.
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}

	/**
	 * Setter for customerName.
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	/**
	 * Getter for customerState.
	 * @return the customerState
	 */
	public String getCustomerState() {
		return customerState;
	}

	/**
	 * Setter for customerState.
	 * @param customerState the customerState to set
	 */
	public void setCustomerState(String customerState) {
		this.customerState = customerState;
	}

	/**
	 * Getter for customerZipcode.
	 * @return the customerZipcode
	 */
	public int getCustomerZipcode() {
		return customerZipcode;
	}

	/**
	 * Setter for customerZipcode.
	 * @param customerZipcode the customerZipcode to set
	 */
	public void setCustomerZipcode(int customerZipcode) {
		this.customerZipcode = customerZipcode;
	}
}

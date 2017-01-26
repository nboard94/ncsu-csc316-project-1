package edu.ncsu.csc316.grocerystore.customer;

public class Customer {

	int customerID;
	
	String customerName;
	
	String customerState;
	
	int customerZipcode;
	
	public Customer( int newID, String newName, String newState, int newZipcode ) {
		this.setCustomerID(newID);
		this.setCustomerName(newName);
		this.setCustomerState(newState);
		this.setCustomerZipcode(newZipcode);
	}

	/**
	 * @return the customerID
	 */
	public int getCustomerID() {
		return customerID;
	}

	/**
	 * @param customerID the customerID to set
	 */
	public void setCustomerID(int customerID) {
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

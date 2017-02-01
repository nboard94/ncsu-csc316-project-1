package edu.ncsu.csc316.grocerystore.order;

/**
 * @author Nicholas Board (ndboard)
 * Handles the creation and methods of a product object.
 */
public class Product {

	/** A product's brand. */
	String brand;
	
	/** A product's description. */
	String description;
	
	/**
	 * Constructor for a product object.
	 * @param newBrand brand for a new product.
	 * @param newDescription description for a new product.
	 */
	public Product( String newBrand, String newDescription ) {
		this.setBrand(newBrand);
		this.setDescription(newDescription);
	}

	/**
	 * The getter for the brand.
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}

	/**
	 * The setter for the brand.
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

	/**
	 * The getter for the description.
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * The setter for the description.
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}

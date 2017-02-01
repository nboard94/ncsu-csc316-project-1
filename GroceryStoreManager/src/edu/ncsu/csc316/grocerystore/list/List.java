package edu.ncsu.csc316.grocerystore.list;

/**
 * @author Nicholas Board (ndboard)
 * @param <E> Generic data type.
 * Interface for the ArrayBasedList and LinkedList in this project.
 */
public interface List<E> {
	
	/**
	 * Getter for the data structure's size.
	 * @return number of objects in the structure.
	 */
	int size();
	
	/**
	 * Add an object to the structure.
	 * @param item The object to be added.
	 */
	void add(Object item);
	
	/**
	 * Retrieves objects from the structure.
	 * @param slot The slot of retrieve from.
	 * @return The object in that slot.
	 */
	E get(int slot);
}

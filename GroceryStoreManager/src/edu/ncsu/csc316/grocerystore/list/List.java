package edu.ncsu.csc316.grocerystore.list;

public interface List {
	
	//TODO change these descriptions, from Dr. David Wright's list interface used in previous project
	
	/**
     * @return the number of elements in this list
     */
    int size();

    /**
     * @return true if this list contains no elements
     */
    boolean isEmpty();

    /**
     * @param o element whose presence in this list is to be tested
     * @return true if this list contains the specified element
     */
    boolean contains(Object o);

    /**
     * @param o element to be appended to this list
     * @return True if the object is added to the list
     */
    boolean add(Object o);
    
    /**
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    Object get(int index);
  
    /**
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws NullPointerException if the specified element is null and
     *         this list does not permit null elements
     * @throws IllegalArgumentException if some property of the specified
     *         element prevents it from being added to this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    void add(int index, Object element);

    /**
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    Object remove(int index);

    /**
     * @param o element to search for
     * @return the index of the first occurrence of the specified element in
     *         this list, or -1 if this list does not contain the element
     */
    int indexOf(Object o);
}

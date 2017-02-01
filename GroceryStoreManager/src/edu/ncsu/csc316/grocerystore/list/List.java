package edu.ncsu.csc316.grocerystore.list;

public interface List<E> {
	
	int size();
	
	void add(Object item);
	
	E get(int slot);
}

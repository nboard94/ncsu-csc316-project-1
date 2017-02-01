package edu.ncsu.csc316.grocerystore.list;

public class ArrayBasedList<E> implements List<E> {

	private static final int RESIZE = 10;
	private int size;
	
	private E[] items = (E[]) new Object[ RESIZE ];

	@SuppressWarnings("unchecked")
	public ArrayBasedList() {
		size = 0;
		
	}
	
	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add( Object newItem ) {

		if ( items.length <= size ) {
			
			E[] largerItems = (E[]) new Object[ size + RESIZE ];
			
			for ( int i = 0; i < size; i++ ) {
				
				largerItems[i] = items[i];
			}
			
			items = largerItems;
		}
		
		items[ size ] = (E) newItem;
		
		size++;
		
	}

	@Override
	public E get(int slot) {
		
		return items[ slot ];
	}
	
}

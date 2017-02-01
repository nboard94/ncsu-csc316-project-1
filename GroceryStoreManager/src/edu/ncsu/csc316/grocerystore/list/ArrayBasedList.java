package edu.ncsu.csc316.grocerystore.list;

public class ArrayBasedList<E> implements List<E> {

	static final int RESIZE = 10;
	int size;
	
	@SuppressWarnings("unchecked")
	E[] items = (E[]) new Object[ RESIZE ];

	@Override
	public int size() {
		return size;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void add( Object newItem ) {

		if ( items.length >= size ) {
			
			E[] largerItems = (E[]) new Object[ size + RESIZE ];
			
			for ( int i = 0; i < size; i++ ) {
				
				largerItems[i] = items[i];
			}
			
			items = largerItems;
		}
		
		items[ size ] = (E) newItem;
		
	}

	@Override
	public E get(int slot) {
		
		return items[ slot ];
	}
	
}

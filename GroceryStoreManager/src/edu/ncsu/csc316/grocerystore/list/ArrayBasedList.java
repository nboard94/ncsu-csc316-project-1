package edu.ncsu.csc316.grocerystore.list;

/**
 * An Array Based Data Structure that automatically
 * resizes when needed.
 * @author Nicholas Board (ndboard)
 * @param <E> Generic data type.
 */
public class ArrayBasedList<E> implements List<E> {

	/** The initial size of the array and the amount that is added when needed. */
	private static final int RESIZE = 10;
	/** The number of objects in the array. */
	private int size;
	/** The generic array of objects. */
	private E[] items = (E[]) new Object[ RESIZE ];

	/**
	 * Constructor of the ArrayBasedList.
	 */
	@SuppressWarnings("unchecked")
	public ArrayBasedList() {
		size = 0;
		
	}
	
	/* (non-Javadoc)
	 * @see edu.ncsu.csc316.grocerystore.list.List#size()
	 */
	@Override
	public int size() {
		return size;
	}

	/* (non-Javadoc)
	 * @see edu.ncsu.csc316.grocerystore.list.List#add(java.lang.Object)
	 */
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

	/* (non-Javadoc)
	 * @see edu.ncsu.csc316.grocerystore.list.List#get(int)
	 */
	@Override
	public E get(int slot) {
		
		return items[ slot ];
	}
}

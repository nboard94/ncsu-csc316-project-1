package edu.ncsu.csc316.grocerystore.list;

public class LinkedList<E> implements List<E> {

	private ListNode front;
	private ListNode back;
	private int size;
	
	@Override
	public int size() {
		return size;
	}

	@Override
	public void add(Object item) {
		
		back.next = new ListNode((E) item, back, null);
		back = back.next;
	}

	@Override
	public E get(int slot) {
		
		ListNode current = front;
		
		if ( slot == 0 ) {
			return (E) front;
		}
		
		else if ( slot == size ) {
			return (E) back;
		}
		
		else {
			
			for ( int i = 1; i < slot; i++ ) {
				
				current = current.next;
			}
			
			return (E) current;
		}
	}


	private class ListNode {
		
		public E data;
		public ListNode next;
		public ListNode prev;
		
		public ListNode(E data, ListNode previous, ListNode next) {
			this.data = data;
			this.next = next;
			this.prev = previous;
		}
		
	}

}


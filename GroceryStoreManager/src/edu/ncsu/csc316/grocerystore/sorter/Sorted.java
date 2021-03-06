package edu.ncsu.csc316.grocerystore.sorter;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

/**
 * A sorting algorithm based off the quicksorting technique.
 * @author Nicholas Board (ndboard)
 */
public class Sorted {

	int pivotLoc;
	int leftWall;
	Customer pivot;
	
	/**
	 * Constructor for the Sorted object.
	 */
	public Sorted() {
		//This constructor intentionally left blank.
	}

	/**
	 * Non-recursive quicksorting algorithm.  Implemented referencing
	 * pseudocode from http://csg.sph.umich.edu/abecasis/class/2008/615.07.pdf
	 * @param arr The ArrayBasedList to perform the sort on.
	 * @param floor The lower boundary of the sort.
	 * @param ceiling The higher boundary of the sory.
	 * @return arr The sorted version of the ArrayBasedList initially passed in.
	 */
	public ArrayBasedList<Customer> quicksort(ArrayBasedList<Customer> arr, int floor, int ceiling) {
		int i, s = 0;
		int[] stack = new int[ceiling + 1];
		stack[s++] = floor;
		stack[s++] = ceiling;
		while (s > 0) {
			ceiling = stack[--s];
			floor = stack[--s];
			if (floor >= ceiling)
				continue;
			i = partition(arr, floor, ceiling);
			if (i - floor > ceiling - i) {
				stack[s++] = floor;
				stack[s++] = i - 1;
				stack[s++] = i + 1;
				stack[s++] = ceiling;
			} else {
				stack[s++] = i + 1;
				stack[s++] = ceiling;
				stack[s++] = floor;
				stack[s++] = i - 1;
			}
		}
		return arr;
	}

	/**
	 * Creates the partition around the pivot point in the quicksort,
	 * narrowing down the current set of data.
	 * @param arr The ArrayBasedList the quicksort is being performed on.
	 * @param start The start of the partition.
	 * @param stop Where the partition stops.
	 * @return up Moving an object up through the ArrayBasedList.
	 */
	public int partition(ArrayBasedList<Customer> arr, int start, int stop) {
		int up = start, down = stop - 1;
		Customer part = arr.get(stop);
		if (stop <= start)
			return start;
		while (true) {
			while (arr.get(up).getCustomerID().compareTo(part.getCustomerID()) < 0)
				up++;
			while ((part.getCustomerID().compareTo(arr.get(down).getCustomerID()) < 0) && (up < down))
				down--;
			if (up >= down)
				break;
			arr.swap(up, down);
			up++;
			down--;

		}
		arr.swap(up, stop);
		return up;
	}

}

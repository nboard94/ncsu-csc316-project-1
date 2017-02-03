package edu.ncsu.csc316.grocerystore.sorter;

import edu.ncsu.csc316.grocerystore.customer.Customer;
import edu.ncsu.csc316.grocerystore.list.ArrayBasedList;

public class Sorted {

	int pivotLoc;
	int leftWall;
	Customer pivot;
	Customer temp = new Customer("", "", "", 0);
	Customer temp2 = new Customer("", "", "", 0);

	public Sorted() {

	}

	//TODO Am I allowed to use online sources?
	/**
	 * Non-recursive quicksorting algorithm.  Implemented referencing
	 * pseudocode from http://csg.sph.umich.edu/abecasis/class/2008/615.07.pdf
	 * @param arr
	 * @param low
	 * @param high
	 * @return
	 */
	public ArrayBasedList<Customer> quicksort(ArrayBasedList<Customer> arr, int low, int high) {
		int i, s = 0;
		int[] stack = new int[high + 1];
		stack[s++] = low;
		stack[s++] = high;
		while (s > 0) {
			high = stack[--s];
			low = stack[--s];
			if (low >= high)
				continue;
			i = partition(arr, low, high);
			if (i - low > high - i) {
				stack[s++] = low;
				stack[s++] = i - 1;
				stack[s++] = i + 1;
				stack[s++] = high;
			} else {
				stack[s++] = i + 1;
				stack[s++] = high;
				stack[s++] = low;
				stack[s++] = i - 1;
			}
		}
		return arr;
	}

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

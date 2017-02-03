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
	
	public ArrayBasedList<Customer> quickSort(ArrayBasedList<Customer> arr, int low, int high) {
		if (low < high) {
			pivotLoc = partition(arr, low, high);
			quickSort(arr, low, pivotLoc);
			quickSort(arr, pivotLoc + 1, high);
		}
		
		return arr;
	}
	
	private int partition(ArrayBasedList<Customer> arr, int low, int high) {
		pivot = arr.get(low);
		leftWall = low;
		
		for (int i = low + 1; i < high; i++ ) {
			if (arr.get(i).getCustomerID().compareTo(pivot.getCustomerID()) < 0) {
				temp = arr.get(i);
				arr.set(i, arr.get(leftWall));
				arr.set(leftWall, temp);
				leftWall++;
			}
			
			temp2 = pivot;
			pivot = arr.get(leftWall);
			arr.set(leftWall, pivot);
		}
		
		return leftWall;
	}
}

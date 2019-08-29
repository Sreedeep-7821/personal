package collectionsframework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExaple {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> cars = new LinkedList<String>();
		// Adding elements in the array
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");

		// Size of the array
		int size = cars.size();
		System.out.println("The size of the arry list is " + size);

		// Get the item
		System.out.println("The item of the index is " + cars.get(2));

		// Iteration over the array
		for (int i = 0; i < size; i++) {
			System.out.println("Item on the index" + i + " is:" + cars.get(i));
		}

		System.out.println("\nFor-Each loop example");
		for (String car : cars) {
			System.out.println("The item is :" + car);
		}

		// Remove the items
		cars.remove(size - 1);
		System.out.println("\nFor-Each loop example after removing");
		for (String car : cars) {
			System.out.println("The item is :" + car);
		}

	}

	/***
	 * Array List - array based - {1,2,3,4,5,6} Linked List - [0] > [1] > [2] -
	 * reference to previous element
	 * 
	 * Array List - When we have to add at the end, and remove from the end and
	 * getting it fast Linked List - When we have to add at the beginning and remove
	 * from the beginning
	 */

	List<Integer> lList = new LinkedList<Integer>();
	List<Integer> alist = new ArrayList<Integer>();

	public static void runDuration(List<Integer> list, String listType) {
		System.out.println("Beginning of the duration method " + listType);

		long startTime = System.currentTimeMillis();

		for (int i = 0; i < 10000; i++) {
			list.add(i);
		}

		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of the list:" + listType + "is" + duration + "ms");

	}
}

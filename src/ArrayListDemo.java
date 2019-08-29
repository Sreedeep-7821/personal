package collectionsframework;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cars = new ArrayList<String>();
		//Adding elements in the array
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		// Size of the array
		int size = cars.size();
		System.out.println("The size of the arry list is " +size);
		
		//Get the item
		System.out.println("The item of the index is " +cars.get(2));
		
		
		//Iteration over the array
		for (int i=0;  i< size; i++) {
			System.out.println("Item on the index" + i + " is:" + cars.get(i));
		}
		
		System.out.println("\nFor-Each loop example");
		for (String car :cars) {
			System.out.println("The item is :" +car);
		}
		
		
		//Remove the items
		cars.remove(size-1);
		System.out.println("\nFor-Each loop example after removing");
		for (String car :cars) {
			System.out.println("The item is :" +car);
		}
		
		

	}

}

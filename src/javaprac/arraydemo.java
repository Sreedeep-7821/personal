package javaprac;

import java.util.*;


public class arraydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Integer Array
		
		int[] myIntArray1;
		myIntArray1 = new int [10]; // means it can hold 10 integer values in the array
		
		myIntArray1[0] = 100;
		myIntArray1[1] = 90;
		System.out.println("0th index " + myIntArray1[0]);
		System.out.println("1st index " + myIntArray1 [1]);
		System.out.println("2nd index " + myIntArray1 [2]);//assigned default value
		
		String[] myStringArray1 = {"Audi", "Honda", "TVS"};
		System.out.println("0th index " + myStringArray1[0]);
		System.out.println("1st index " + myStringArray1 [1]);
		System.out.println("2nd index " + myStringArray1 [2]);
		
		//lenghth of array
		int len1 = myIntArray1.length;
		int len2 = myStringArray1.length;
		
		System.out.println(len1);
		System.out.println(len2);
		
		
		
		for (int i=0; i<len1; i++)
			
		{
			System.out.println(myIntArray1[i]);
			
			//Check copy of Array function 	, copying the array using assignment
			int [] a = {1,2, 3};
			int [] b = a;
			
			b[0]++;
			System.out.println("Scenario 1: ");
		    System.out.print("Array a: ");
		    printArray(a);
		    System.out.print("Array b: ");
		    printArray(b);
			
		}
	}
	
	 public static void printArray(int[] a) {
	      System.out.print("[ ");
	      for (int i = 0; i < a.length; i++) {
	         System.out.print(a[i] + " ");
	      }
	      System.out.println("]");
	   }
	}


package excercises;

import java.util.Scanner;

public class Reversechars {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a string");
		String original = scan.nextLine();
		
		while (original.isEmpty() || original == null)
		{
			System.out.println("Please enter a vald String");
			original = scan.nextLine();
		}
		scan.close();
		Reversechars output = new Reversechars();
		String revchars = output.reversechars(original);
		System.out.println(revchars);
		
	}
	
	
	private String reversechars(String original)
	{ 
		String reverse = "";
		
		for (int i = original.length() - 1; i >= 0;  i --) {
			reverse = reverse +original.charAt(i);
		}
		return reverse;
		
	}

}

package excercises;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		
		String str, rev  = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string that you want to check");
		str = sc.nextLine();
		
		int length = str.length();
		
		for (int i = length-1; i>=0; i--)
			rev = rev + str.charAt(i);
			
			if (str.equals(rev)) {
				System.out.println(str + "is palindrome");
			}
			else
			{
				System.out.println(str + "is not a palindrome");
			}
		}
				
	}


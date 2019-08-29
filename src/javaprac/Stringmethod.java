package javaprac;

public class Stringmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "This is the test string";
		String str1 = "           Spaces all around     ";
		String st2 = "Hello";
		
		System.out.println(str.length());
		System.out.println(str.charAt(9));
		System.out.println(str.concat( " This is the appended string"));
		System.out.println(str.contains("is"));
		System.out.println(str.contains("si"));
		System.out.println(str1.trim());
		
		System.out.println(st2.replace("e", "a"));
		System.out.println("Substring example 1" + str.substring(5));
		System.out.println("Substring example 2" + str.substring(5, 10));
		
		//char array
		char [] charArray = str.toCharArray();
		for (int i =0; i<charArray.length; i++)
		{
			System.out.println("Index" + i + charArray[i]);
		}
		
		//Lower case
		System.out.println("Lower case " + str.toLowerCase());
		
		//Upper case
         System.out.println("Upper Case "+ str.toUpperCase());		
			
		
	}

}

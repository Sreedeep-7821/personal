package excercises;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "this is a test string";
		String output = reverse(input);
		System.out.println(output);
		

	}

	private static String reverse(String input) {
		// TODO Auto-generated method stub
		String reverse = "";
		//Logic
		if (input.isEmpty() || input == null)
		{
			System.out.println("Empty string is not accepted");
		}
		if (input.length() <=1) {
			reverse = input;
		}
		else
		{
			String[] originalarray= input.split("\\s+");
			for (String item: originalarray)
			{
				reverse = item + " " + reverse;
			}
		}
		return reverse.trim();
	}

}

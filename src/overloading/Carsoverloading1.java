package overloading;

/*
 * 
 *  Different Number of 	parameters in the arguement list
 */

public class Carsoverloading1 {
	
	// 1. Number of parameters could be different
	// 2. Data types of parameters could be  different
	// 3. Sequence of data types is different
	// 4. VVI - We cannot overload just on return types

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseseatheight(2);
		increaseseatheight(4, true);

	}
	
	public static void increaseseatheight(int heightoincrease) {
		
		System.out.println("The height of the seat is increased by " + heightoincrease + "inches");
		
		
	}
	
   public static void increaseseatheight(int heightoincrease, boolean rememberheight) {
		
		System.out.println("The height of the seat is increased by " + heightoincrease + "inches");
		if(rememberheight) {
			System.out.println("The selection is saved");
		}
		else
		{
			System.out.println("No saved");
		}
		
		
	}

}

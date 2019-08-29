package overloading;
/***
 * Difference in data type arguements
 * @author sreedeepdas
 *
 */
	public class Carsoverloading2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseseatheight(3);
		increaseseatheight("6");

	}
	
	public static void increaseseatheight(int heightoincrease) {
		
		System.out.println("The height of the seat is increased by " + heightoincrease + "inches, I am the integer");
		
		
	}
	public static void increaseseatheight(String heightoincrease) {
		
		System.out.println("The height of the seat is increased by " + heightoincrease + "inches, I am the String");
		
		
	}

}

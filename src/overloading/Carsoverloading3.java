package overloading;

/***
 * Sequence of data types of arguements
 * @author sreedeepdas
 *
 */
public class Carsoverloading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseseatheight("100", 8766);
		increaseseatheight(4, "8");
		

	}
	
	
	public static void increaseseatheight(String variable1, int variable2) {
		
		System.out.println("I am the first overload");
		
	}
	public static void increaseseatheight(int variable2, String variable1) {
		
		System.out.println("I am the second overload");
		
	}
	

}

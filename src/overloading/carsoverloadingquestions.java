package overloading;

public class carsoverloadingquestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		increaseseatheight("100", 977);

	}

	public static void increaseseatheight(String variable1, int variable2) {

		System.out.println("I am the first overload");

	}

	public static int increaseseatheight(String variable1, String variable2) {

		System.out.println("I am the second overload");
		return 0;

	}
}


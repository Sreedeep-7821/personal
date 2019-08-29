package staticpackage;

public class StaticKeynotedemo {

	// Static method cannot use the non static variable or method directly
	//This and super caanot be used in static context
	
	public static int addNum = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int output = sum(20);
		System.out.println("The output is " +output);

	}
	
	public static int sum(int num)
	{
		return num + addNum;
	}

}

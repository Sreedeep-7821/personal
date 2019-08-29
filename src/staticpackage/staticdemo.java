package staticpackage;

public class staticdemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		staticexamplesclass s1 = new staticexamplesclass("bmw");
		System.out.println("Make of the car is " + s1.getMake());
		System.out.println("This is instance no" +staticexamplesclass.getInstanceNum());
		
		
		staticexamplesclass s2 = new staticexamplesclass("benz");
		System.out.println("Make of the car is " + s2.getMake());
		System.out.println("This is instance no" +staticexamplesclass.getInstanceNum());

	}

}

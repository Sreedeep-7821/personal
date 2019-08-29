package oopsconcepts;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car bmw = new Car();//Create and initialize the object
		bmw.setMake("BMW");
		System.out.println("Make of the BMW is:" + bmw.getMake());
		
		
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println("Make of the Benz is " + benz.getMake());
		
		benz.setModel("c300");
		System.out.println("Model of the Benz is " + benz.getModel());
		
		benz.setYear(1800);
		System.out.println("Year of the Benz is " + benz.getYear());
	}

}

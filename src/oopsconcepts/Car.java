package oopsconcepts;
//Class is actually a template/buleprint which we used to objects

public class Car {
	//color
	private String color;
	
	//make
	private String make;
	
	//model
	private String model;
	
	//year of the product 
	private int year;
	
	//basically all the attributes of the object
	
	public void increaseSpeed() {
		System.out.println("Increasing the speed");
	}
// Setter means to set the value of field or variable
	
	public void setMake(String make) {
		this.make = make;
	}
	
	public String getMake() 
	{
		return this.make;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year > 1900)
		{
			this.year = year;

		}
		else 
		{
			System.out.println("This year is not valid");
		}
	}
}

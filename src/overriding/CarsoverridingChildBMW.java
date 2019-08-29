package overriding;

public class CarsoverridingChildBMW extends Carsoverridingparent{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarsoverridingChildBMW c1 = new CarsoverridingChildBMW();
		c1.Enginestart(9);

	}
	
	@Override
	public void Enginestart(int cyl)
	
	{
		super.Enginestart(2);
		System.out.println("I m from the child class");
		
	}

}

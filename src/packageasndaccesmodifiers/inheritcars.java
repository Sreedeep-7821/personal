package packageasndaccesmodifiers;

public class inheritcars {
	//No modifier - access in the same package
		int speed;
	// Private variables and methods are only avalaible in class
	// We can only acces if we create a public method
		private int privatespeed;
		
	// Public Speed
	// Anywhere in the Java world with importing the package and the class
		public int publicspeed;
		int speedlimit = 100;
		
	//Protected
	//accessible to any subclass even outside the package
		protected int protectedspeed;

	public inheritcars()
	{
		this(0);
	}
	
	
	public inheritcars(int startSpeed) {
		// TODO Auto-generated constructor stub
		speed = startSpeed;
	}
	
	//to access private class
	
	public 	void setPrivateSpeed(int pspeed)
	{
		privatespeed = pspeed;
	}


	public void increasespeed()
	{
		speed ++ ;
		System.out.println("Increasing speed");
	}
	
	protected void decreasespeed()
	{
		speed --;
		System.out.println("Decreasing the speed");
	}
}

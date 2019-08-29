package packageasndaccesmodifiers;
// We cannot insantiate the abstract class, if there is a single abstract method the class needs to be abstract

public abstract class Abstractcars {
 
	private int privatespeed;
	protected int protectedspeed;
	
	
	public Abstractcars()
	{
		this(0);
	}
	
	
	public Abstractcars(int startSpeed) {
		// TODO Auto-generated constructor stub
		this.privatespeed= startSpeed;
	}
	
	public 	void setPrivateSpeed(int pspeed)
	{
		this.privatespeed = pspeed;
		
		
	}
	
	public void enginestart()
	{
		System.out.println("The engine is started");
	}

	
}

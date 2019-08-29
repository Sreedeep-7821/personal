package packageasndaccesmodifiers;

public class AbstractBMW extends Abstractcars
{

	public 	void setPrivateSpeed(int pspeed)
	{
		super.setPrivateSpeed(10);
	}
	
	public void enginestart() {
		super.enginestart();
		System.out.println("BMW has keyless engine start");
	}

}

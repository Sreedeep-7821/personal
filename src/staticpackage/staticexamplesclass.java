package staticpackage;

public class staticexamplesclass {
// static filed are always associated with the class instead of the object of the class
	private String  make;
	private static int wheelscount = 4;
	private static int instanceNum = 0;
	
	public staticexamplesclass(String make) {
		this.make = make;
		instanceNum++;
		
	}
	
	public String getMake()
	{
		return make;
	}
	
	public static int getInstanceNum()
	{
		return instanceNum;
	}
}

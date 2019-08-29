package overriding;
/***
 * 
 * Rules
 * 1. Arguement list: Arguement lost in the overridng method should be same as same parent class overriden method
 * 2. Access Modifier: Access modifier of the overriden method cannot be more restrictive than overriden method 
 * 3. private, static and final cannot be overriden as they are local to the class
 * @author sreedeepdas
 *
 */
public class Carsoverridingparent {

	public void Enginestart(int cyl)
	
	{
		System.out.println("I m from the parent class");
		
	}

}

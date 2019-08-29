package packageasndaccesmodifiers;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritcars c1 = new inheritcars();
		c1.increasespeed();
		c1.speed = 10;
		c1.setPrivateSpeed(10);
		c1.publicspeed = 100;	
		c1.protectedspeed = 100;
		c1.decreasespeed();

	}

}

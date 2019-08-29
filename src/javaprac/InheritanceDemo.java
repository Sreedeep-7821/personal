package javaprac;

import packageasndaccesmodifiers.inheritbmw;
import packageasndaccesmodifiers.inheritcars;

public class InheritanceDemo {

	public static void main(String[] args) {
		int speed = 0;
		// TODO Auto-generated method stub
		inheritcars c1 = new inheritcars(speed);
		c1.increasespeed();
		
		inheritbmw c2 = new inheritbmw(speed);
		c2.increasespeed();

	}

}

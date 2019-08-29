package packageasndaccesmodifiers;

// Sub-clas has the opportunity to use the parent class methods but parent class can't utilise the subclass methods

public class inheritbmw  extends inheritcars{

	public inheritbmw (int startspeed) {
		super(startspeed);
	}

	@Override
	public void increasespeed() {
		// TODO Auto-generated method stub
		System.out.println("Increasing spped of BMW: ");
		super.increasespeed();
	}
	
}

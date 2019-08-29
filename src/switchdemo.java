
public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	 static int numDays(int year, int month) {
		 int numDays = 0;
		 switch (month)
		 {
		 case 1:
			 numDays = 31;
			 break;
			 
		 case 2:
			 if (year % 400 == 0)
			 {
				 numDays = 29;
			 }
			 break;
		 case 3:
		
			 
		 }
		 
		 return numDays;
	 }
}

import javax.sound.midi.Synthesizer;

public class forloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (initialization; boolean expression; update)
		for (int i = 0; i < 10; i++) {
			System.out.println("The value of i " +i);

		}
		
		int[] numbers = {10, 20, 30};
		for (int i=0; i<numbers.length; i++)
		{
			System.out.println("The value of index" +i + "is: " + numbers[i]);
		}
		//enhanced for loop/ for-each loop
		for (int number: numbers) {
			System.out.println("The value is " +number);
			
		}
		String[] cars = {"bmw", "honda", "audi"};
		for (String car: cars)
		{
			System.out.println(car);
		}
		

	}

}

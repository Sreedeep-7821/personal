package oopsconcepts;

public class AddingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String grade;
		String studentname;
		
		studentname = "John";
		grade = findGrades(90);
		displayGrades(studentname, grade);
		
	    studentname = "Tom";
		grade = findGrades(80);
		displayGrades(studentname, grade);
		
	}
		
		public static String findGrades(int score) //if method has no return type then we used void
		{
			String grade;
			if (score >=90 && score <=100) 
			{
				grade = "A";
			}
			else if (score >=80 && score < 90)
			{
				grade = "B";
				
			}
			else if (score >= 70 && score < 80)
			{
				grade = "C";
				
			}
			else {
				
				grade = "D";

		    }
			return grade;
		}
		
		public static void displayGrades(String studentname, String grade)
		{
			System.out.println("**********************************");
			System.out.println("Grade of " + studentname + " is: " + grade);
			System.out.println("**********************************");

		}
	     
}

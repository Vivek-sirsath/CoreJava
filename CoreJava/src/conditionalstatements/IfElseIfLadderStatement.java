package conditionalstatements;

public class IfElseIfLadderStatement {

	public static void main(String[] args) {
		
		int weekDay = 7;
		
		if (weekDay == 1) 
		{
			System.out.println("Sunday");
		}
		else if (weekDay == 2) 
		{
			System.out.println("Monday");
		}
		else if (weekDay == 3) 
		{
			System.out.println("Tuesday");
		}
		else if (weekDay == 4) 
		{
			System.out.println("Wednesday");
		}
		else if (weekDay == 5) 
		{
			System.out.println("Thursday");
		}
		else if (weekDay == 6) 
		{
			System.out.println("Friday");
		}
		else if (weekDay == 7) 
		{
			System.out.println("Saturday");
		}
		else 
		{
			System.out.println("Invalid week number");
		}		
		
	}

}

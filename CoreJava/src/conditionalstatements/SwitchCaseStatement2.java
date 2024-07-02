
// Q. Print day of the week based on week day number.
// Switch case conditional statement reduces the code length as compare to if-else ladder

package conditionalstatements;

public class SwitchCaseStatement2 {

	public static void main(String[] args) {
		
		int weekDay = 2;
		
		switch(weekDay) {
		case 1 : System.out.println("Sunday");
		break;
		
		case 2 : System.out.println("Monday");
		break;
		
		case 3 : System.out.println("Tuesday");
		break;
		
		case 4 : System.out.println("Wednesday");
		break;
		
		case 5 : System.out.println("Thursday");
		break;
		
		case 6 : System.out.println("Friday");
		break;
		
		case 7 : System.out.println("Saturday");
		break;
		
		default : System.out.println("Invalid week day");
		
		}
	}
}

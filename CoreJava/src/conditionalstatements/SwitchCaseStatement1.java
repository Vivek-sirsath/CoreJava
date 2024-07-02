
// Q. Print number of the day in a week based on week day.
// Switch case conditional statement reduces the code length as compare to if-else ladder

package conditionalstatements;

public class SwitchCaseStatement1 {

	public static void main(String[] args) {
		
		String day = "Sunday"; // Case sensitive
		
		switch(day) {
		case "Sunday" : System.out.println("1"); break;
		case "Monday" : System.out.println("2"); break;
		case "Tuesday" : System.out.println("3"); break;
		case "Wednesday" : System.out.println("4"); break;
		case "Thursday" : System.out.println("5"); break;
		case "Friday" : System.out.println("6"); break;
		case "Saturday" : System.out.println("7"); break;	
		default : System.out.println("Invalid week day");
		
		}
	}
}

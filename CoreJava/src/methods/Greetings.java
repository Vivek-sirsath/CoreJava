package methods;

public class Greetings {

	//Case-1 : Method with No parameter and No return value
	public void greetingForDay() {
		System.out.println("Good Morning !!");
	}

	//Case-2 : Method with No parameter but returns a value
	public String greetingForNoon() {
		return "Good Afternoon !!";
	}

	//Case-3 : Method with parameter and No return value
	public void greetingForEvening(String msg) {
		System.out.println(msg);
	}

	//Case-4 : Method with parameter and return value
	public String greetingForNight(String msg) {
		return ("Good Night,  " + msg);

	}
}

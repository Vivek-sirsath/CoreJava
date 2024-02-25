package methods;

public class GreetingsMain {

	public static void main(String[] args) {
		Greetings greet = new Greetings();
		
		//Case-1 : Calling Method with No parameter and No return value
		greet.greetingForDay();
		
		//Case-2 : Calling Method with No parameter but returns a value
		String greetMessage1 = greet.greetingForNoon();
		System.out.println(greetMessage1);
		
		//Case-3 : Calling Method with parameter and No return value
		greet.greetingForEvening("Good Evening !!");
		
		//Case-4 : Calling Method with parameter and return value
		String greetMessage2 = greet.greetingForNight("Sleep Well");
		System.out.println(greetMessage2);
	}

}

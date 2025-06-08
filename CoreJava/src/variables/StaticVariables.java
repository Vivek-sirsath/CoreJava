package variables;

public class StaticVariables {
	//Static Variable Creation
	// If we declare the static variable as public. It can be accessed in another package too.
	public static String staticVariable = "I am a static Variable";

	public static void main(String[] args) {

		// Calling Static Variable - Static variables are called directly without object instance of class
		// They can be called directly using Class name in any class in the same package.
		System.out.println(StaticVariables.staticVariable);

	}
}

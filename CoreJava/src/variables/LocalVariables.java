package variables;

public class LocalVariables {

	public static void main(String[] args) {

		//Local Variable Creation
		String localVariable = "I am a Local Variable";

		//Calling Local Variable - Local variables can only be used inside the block it is created
		System.out.println(localVariable);
		
		// We can call static variable from another class in the same package but using the class name as a reference.
		System.out.println(StaticVariables.staticVariable);

	}
}

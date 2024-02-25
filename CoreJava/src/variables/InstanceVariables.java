package variables;

public class InstanceVariables {

	//Instance Variable Creation
	String instanceVariable = "I am a instance Variable";

	public static void main(String[] args) {

		//Calling instance variable - Instance variables cannot be used directly 
		//System.out.println(instanceVariable);

		//Calling instance variable - Instance variables can only be accessed by Object instance of class
		InstanceVariables obj = new InstanceVariables();
		System.out.println(obj.instanceVariable);

	}
}

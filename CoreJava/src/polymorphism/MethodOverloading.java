package polymorphism;
/*
 * Rule-1: Method name should be same
 * Rule-2: No. of parameters should be different
 * Rule-3: Data type of parameters should be different
 * Rule-4: Order of parameters should be different
 */
public class MethodOverloading {

	public int addition(int a, int b) {
		int result = a+b;
		System.out.println("Sum of two Numbers is: " +result);
		return result;
	}

	//Overloading method with different number of parameters
	public int addition(int a, int b, int c) {
		int result = a+b+c;
		System.out.println("Sum of three Numbers is: " +result);
		return result;
	}

	//Overloading method with different data type of parameters
	public float addition(float a, float b, int c) {
		float result = a+b+c;
		System.out.println("Sum of three floating Numbers is: " +result);
		return result;
	}

	//Overloading method with different order of parameters
	public float addition(int c, float b, float a) {
		float result = a+b+c;
		System.out.println("Sum of three Numbers is: " +result);
		return result;
	}
}

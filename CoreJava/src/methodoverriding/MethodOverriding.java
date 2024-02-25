package methodoverriding;
/*
 * Rule-1: Possible only in multiple classes following inheritance
 * Rule-2: Definition of method should be same but body should be changed
 * Rule-3: Method names are same
 */
public class MethodOverriding {

	public int method(int a, int b) {
		int result = a+b;
		System.out.println("Sum of two Numbers is: " +result);
		return result;
	}
}

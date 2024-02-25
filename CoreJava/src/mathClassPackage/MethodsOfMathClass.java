package mathClassPackage;

public class MethodsOfMathClass {
	
	public static void main(String[] args) {
		
		// The Math.max(x,y) method can be used to find the highest value of x and y:
		System.out.println("The maximum number is: " + Math.max(9, 7));
		
		// The Math.min(x,y) method can be used to find the lowest value of x and y:
		System.out.println("The minimum number is: " + Math.min(5, 10));
		
		// The Math.sqrt(x) method returns the square root of x:
		System.out.println("The square root of the number is: " + Math.sqrt(64));
		
		// The Math.abs(x) method returns the absolute (positive) value of x:
		System.out.println("The absolute (positive) of the number is: " + Math.abs(-4.7));
		
		// Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
		System.out.println("The random number between 0 and 1 is: " + Math.random());
		
		// if you only want a random number between 0 (inclusive) and 1000 (exclusive):
		int randomNum = (int)(Math.random() * 1001);
		System.out.println("The random number between 0 and 1000 is: " + randomNum);
		
	}

}

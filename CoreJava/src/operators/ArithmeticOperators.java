package operators;

public class ArithmeticOperators {

	public static void main(String[] args) {
		//Arithmetic Operators : +, -, *, /, %

		int num1 = 100;
		int num2 = 20;

		// 1. Addition
		int sum = num1+num2;
		System.out.println("Sum of two numbers: " + sum);

		// 2. Subtraction
		int diff = num1-num2;
		System.out.println("Difference of two numbers: " + diff);

		// 3. Multiplication
		int multi = num1*num2;
		System.out.println("Multiplication of two numbers: " + multi);

		// 4. Division
		int div = num1/num2;
		System.out.println("Division of two numbers: " + div);

		// 5. Modular Division
		int rem = num1%num2;
		System.out.println("Remainder on division of two numbers: " + rem);
	}
}

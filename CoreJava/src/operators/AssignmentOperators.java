package operators;

public class AssignmentOperators {

	public static void main(String[] args) {

		// Assignment Operators : =, +=, -=, *=, /=, %=

		// '=' Operator just assigns value to a variable
		int a = 5;

		// '+=' Operator
		int addEquals = a+=5;
		System.out.println("Result of adding 5 in number: " + addEquals);

		// '-=' Operator
		int diffEquals = a-=2;
		System.out.println("Result of subtracting 2 from number: " + diffEquals);

		// '*=' Operator
		int multiEquals = a*=5;
		System.out.println("Result of multiplying number with 5: " + multiEquals);

		// '/=' Operator
		int divEquals = a/=4;
		System.out.println("Result of dividing number by 4: " + divEquals);

		// '%=' Operator
		int modEquals = a%=3;
		System.out.println("Remainder of dividing number with 3: " + modEquals);
	}

}

package operators;

public class TernaryOperator {

	public static void main(String[] args) {
		//Ternary or Conditional Operator

		int a = 200;
		int b = 100;

		int trueResult = a>b ? a : b;
		System.out.println("Greater of two numbers: " + trueResult);

		a = 100;
		b = 500;

		int falseResult = a>b ? a : b;
		System.out.println("Greater of two numbers: " + falseResult);

		System.out.println("********************************");

		int age=18;
		String eligibility = (age>=18) ? "Eligible for vote" : "Not Eligible for vote";

		System.err.println(eligibility);
	}

}

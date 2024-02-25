package operators;

public class IncrementAndDecrementOperators {

	public static void main(String[] args) {

		//Increment and Decrement Operators : ++, --

		// 1.Increment Operator - Pre increment and Post increment

		//Pre Increment
		int a = 10;
		int preInc = ++a;
		System.out.println("Value after pre increment: " + preInc);

		//Post Increment - Returning value without incrementing bcz it is first stored and than incremented
		int b = 10;
		int postInc = b++;
		System.out.println("Value after post increment: " + postInc);

		// 2.Decrement Operator - Pre decrement and Post decrement

		//Pre Decrement
		int x = 100;
		int preDec = --x;
		System.out.println("Value after pre decrement: " + preDec);

		//Post Increment - Returning value without decrementing bcz it is first stored and than decremented
		int y = 100;
		int postDec = y--;
		System.out.println("Value after post decrement: " + postDec);
	}
}

package conditionalstatements;

public class ElseIfStatement {

	public static void main(String[] args) {

		//Example -1  Positive , Negative , Zero
		int num = -10;

		if(num>0) {
			System.out.println(num + " is Positive Number");
		}

		else if(num<0) {
			System.out.println(num + " is Negative Number");
		}

		else {
			System.out.println(num + " is equals to zero");
		}

		//Example -2 Largest of three numbers
		int num1 = 10;
		int num2 = 50;
		int num3 = 2;

		if(num1>num2 && num1>num3) {
			System.out.println(num1 + " is greatest of all");
		}

		else if(num2>num1 && num2>num3) {
			System.out.println(num2 + " is greatest of all");
		}

		else {
			System.out.println(num3 + " is greatest of all");
		}
	}
}

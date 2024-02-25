package conditionalstatements;

public class IfElseStatement {

	public static void main(String[] args) {

		//Example -1 Voting Eligibility
		String personName = "Himanshu";
		int personAge = 24;

		if(personAge>=18) {
			System.out.println(personName + " is Eligible for voting");
		}

		else {
			System.out.println(personName + " is not Eligible for voting");
		}

		//Example -2 Even Odd
		int num = 5;

		if(num%2==0) {
			System.out.println(num + " is even Number");
		}

		else {
			System.out.println(num + " is odd Number");
		}
	}
}

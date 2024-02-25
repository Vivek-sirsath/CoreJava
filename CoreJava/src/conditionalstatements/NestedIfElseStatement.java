package conditionalstatements;

public class NestedIfElseStatement {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 50;
		int num3 = 2;
		
		if(num1>num2) {
			if(num1>num3) {
				System.out.println(num1 + " is greatest of all");
			}
			else {
				System.out.println(num3 + " is greatest of all");
			}
		}
		else {
			if(num2>num3) {
				System.out.println(num2 + " is greatest of all");
			}
			
			else {
				System.out.println(num3 + " is greatest of all");
			}
		}

	}

}

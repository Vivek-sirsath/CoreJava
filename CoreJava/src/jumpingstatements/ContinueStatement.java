package jumpingstatements;

public class ContinueStatement {

	public static void main(String[] args) {
		//Continue Statement
		System.out.println("Continue command used at 5");
		for(int i=1; i<=10; i++) {
			if(i==5) {
				System.out.print("skip ");
				continue;
			}
			System.out.print(i + " ");
		}
	}
}

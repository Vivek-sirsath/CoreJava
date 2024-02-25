package jumpingstatements;

public class BreakStatement {

	public static void main(String[] args) {
		//Break Statement
		System.out.println("Break command used at 5");
		for(int i=1; i<=10; i++) {
			if(i==5) {
				break;
			}
			System.out.print(i + " ");
		}
	}
}

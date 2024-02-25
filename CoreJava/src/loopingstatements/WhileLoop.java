package loopingstatements;

public class WhileLoop {

	public static void main(String[] args) {
		//1. Print numbers from 1 to 10

		//Initialization
		int i=1;
		System.out.println("Numbers from 1 to 10");
		//Condition
		while(i<=10) {
			System.out.print(i + " ");
			//Increment
			i++;
		}
		System.out.println();
		System.out.println("*************");
		
		//2. Even Number between 1 to 10
		int j=1;
		System.out.println("Even Number between 1 to 10");
		while(j<=10) {
			if(j%2==0) {
				System.out.print(j + " ");
			}
			j++;
		}
		System.out.println();
		System.out.println("*************");
		
		//3. Odd Number between 1 to 10
		int k=1;
		System.out.println("Odd Number between 1 to 10");
		while(k<=10) {
			if(k%2!=0) {
				System.out.print(k + " ");
			}
			k++;
		}
		System.out.println();
		System.out.println("*************");
		
		//4. Print numbers from 10 to 1
		int l=10;
		System.out.println("Numbers from 10 to 1");
		//Condition
		while(l>=1) {
				System.out.print(l + " ");
			l--;
		}
	}
}

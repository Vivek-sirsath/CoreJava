package loopingstatements;

public class ForLoop {

	public static void main(String[] args) {

		//Print numbers between 1 to 10
		System.out.println("Number from 1 to 10");
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();

		//Print even numbers between 1 to 10
		System.out.println("Even Numbers between 1 to 10");
		for(int j=1; j<=10; j++) {
			if(j%2==0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();

		//Print odd numbers between 1 to 10
		System.out.println("Odd Numbers between 1 to 10");
		for(int k=1; k<=10; k++) {
			if(k%2!=0) {
				System.out.print(k + " ");
			}
		}
		System.out.println();

		//Print odd numbers between 1 to 10
		System.out.println("Numbers from 10 to 1");
		for(int l=10; l>=1; l--) {
			System.out.print(l + " ");
		}

	}
}

package loopingstatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		//Print numbers from 1 to 10
		int i =1;
		System.out.println("Numbers from 1 to 10");
		do {
			System.out.print(i + " ");
			i++;
		}
		while(i<=10);
		
		System.out.println();
		
		//Print numbers from 1 to 10 - Negative case for do while
				int j =11;
				System.out.println("Numbers from 1 to 10, negative case for do while");
				do {
					System.out.print(j + " ");
					i++;
				}
				while(j<=10);
	}
}

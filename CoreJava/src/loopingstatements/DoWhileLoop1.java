package loopingstatements;

import java.util.Scanner;

public class DoWhileLoop1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int input;
		do {
			System.out.println("Enter an integer (0 to exit):");
			input = in.nextInt();
		} while (input != 0);
		
		System.out.println("0 entered and loop exited");

	}

}

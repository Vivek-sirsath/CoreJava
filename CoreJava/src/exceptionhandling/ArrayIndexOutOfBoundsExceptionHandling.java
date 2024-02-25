package exceptionhandling;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		int a[] = new int[5];

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Number");
		int number = s.nextInt();
		System.out.println("Enter a Position between 0-4");
		int pos = s.nextInt();

		try {
			a[pos] = number;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("Please enter a valid position");
		}

		s.close();

		System.out.println("Program is Completed");
		System.out.println("Program is exited");

	}
}

package exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a Number");
		int number = s.nextInt();
		
		try {
			System.out.println(100/number);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Please enter a Valid Input");
		}

		s.close();

		System.out.println("Program is Completed");
		System.out.println("Program is exited");
	}
}

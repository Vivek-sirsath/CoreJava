package exceptionhandling;

import java.util.Scanner;

public class NumberFormatExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a Numberic String");
		String str = s.nextLine();
		try {
		int number = Integer.parseInt(str);
		System.out.println(number);
		}
		catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("Enter a Valid String");
		}
		s.close();

		System.out.println("Program is Completed");
		System.out.println("Program is exited");

	}
}

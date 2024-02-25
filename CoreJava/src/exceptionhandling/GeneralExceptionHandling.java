package exceptionhandling;

import java.util.Scanner;

public class GeneralExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		Scanner s1 = new Scanner(System.in);

		System.out.println("Enter a Number");
		int num1 = s1.nextInt();

		try {
			System.out.println(100/num1);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Please enter a Valid Input");
		}
		s1.close();
		System.out.println("Program is Completed");
		System.out.println("Program is exited");
	}
}

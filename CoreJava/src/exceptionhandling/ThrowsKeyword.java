package exceptionhandling;


public class ThrowsKeyword {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		Thread.sleep(5000);

		System.out.println("Program is Completed");
		System.out.println("Program is exited");
	}
}

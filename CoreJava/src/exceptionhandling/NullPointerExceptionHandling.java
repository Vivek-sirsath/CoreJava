package exceptionhandling;


public class NullPointerExceptionHandling {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		System.out.println("Program is started");
		System.out.println("Program is in progress");

		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(NullPointerException e) {
			e.printStackTrace();
			System.out.println("Please enter a Valid Input");
		}
		
		System.out.println("Program is Completed");
		System.out.println("Program is exited");

	}
}

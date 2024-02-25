package string;

public class StringComparison {

	public static void main(String[] args) {

		String s1 = "welcome";
		String s2 = "welcome";
		
		//Preferably used to compare primitive data types bcz == compare objects
		System.out.println(s1==s2);
		
		//Preferably used to compare non-primitive data types bcz equals compare value of objects
		System.out.println(s1.equals(s2));
		
		String s3 = "welcome";
		String s4 = new String("welcome");
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}

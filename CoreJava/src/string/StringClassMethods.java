package string;

public class StringClassMethods {

	public static void main(String[] args) {
		
		String s = "Welcome to string class...";

		//Print Output in console
		System.out.println(s);

		//length() - Length of a string 
		int lengthOfString = s.length();
		System.out.println("Length of String is: " + lengthOfString);

		//concat() - Joining two strings
		String msg = " Happy Learning";
		System.out.println("Concatenated string: " + s.concat(msg));

		//trim() - Remove spaces in start & end of string
		String text = "    I am trimmed string    ";
		System.out.println(text.trim());

		//charAt() - Returns a single character based on index
		System.out.println("Character at 5th index: " + s.charAt(5));

		//contains() -  Presence of substring in main string (Case Sensitive)
		System.out.println("'Welcome' presence in string?: " + s.contains("Welcome"));  // true
		System.out.println("'welcome' presence in string?: " + s.contains("welcome"));  // false

		//equalsIgnoreCase() - compare strings
		String s1 = "zzzzzzz";
		String s2 = "ZZZZZZZ";
		System.out.println("Comparing s1 and s2: " + s1.equals(s2));
		System.out.println("Comparing s1 and s2 ignoring case: " + s1.equalsIgnoreCase(s2));

		//replace() - replace single/multiple characters in string 
		System.out.println("class is replaced with lecture: " + s.replace("class", "lecture"));

		//subSequence() - extract substring from main string based on index
		System.out.println("SubSequence: " + s.subSequence(10, 17));

		//split() - Divide string into multiple parts using delimiter
		String mail = "abc@gmail.com";
		System.out.println("First part of splitted string: " + mail.split("@")[0]);
		System.out.println("First part of splitted string: " + mail.split("@")[1]);

		//toUpperCase(),toLowerCase() - change the case of string
		String caseText = "hELp";
		System.out.println(caseText.toUpperCase());
		System.out.println(caseText.toLowerCase());

	}
}

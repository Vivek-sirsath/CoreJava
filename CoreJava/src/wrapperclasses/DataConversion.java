package wrapperclasses;

public class DataConversion {

	public static void main(String[] args) {
		
		String s1 = "10";
		String s2 = "20";
		
		//If we want to add above string value, we need to convert into integer
		int str1 = Integer.parseInt(s1);
		int str2 = Integer.parseInt(s2);
		System.out.println(str1+str2);
		
		
		long phoneNumber = 9911603137L;
		
		//If we want to convert above Phone number value into string to avoid manipulation.
		String phoneNo = String.valueOf(phoneNumber);
		System.out.println(phoneNo);
	}
}

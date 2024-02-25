package keywords;

public class StaticKeyword {

	static int staticVariable = 10;
	int nonStaticVariable = 20;

	static void employee() {
		System.out.println("Static Method");
	}

	void employee2() {
		System.out.println("Non-Static Method");
	}

	public static void main(String[] args) {
		//Static variables and methods can be accessed directly without creating object
		System.out.println(StaticKeyword.staticVariable);   
		StaticKeyword.employee();
		
		//Non-Static variables and methods can only be accessed with creating object
		StaticKeyword obj = new StaticKeyword();
		System.out.println(obj.nonStaticVariable);
		obj.employee2();
		
	}
}

package abstraction;

interface Shape{
	int length = 10;
	int width = 5;

	void circle();

	default void square() {
		System.out.println("This is a Square");
	}

	static void rectangle() {
		System.out.println("This is a Rectangle");
	}
}

public class InterfaceDemoClass implements Shape{
	@Override
	public void circle() {
		System.out.println("This is a Circle");
	}
	public static void main(String[] args) {
		InterfaceDemoClass obj = new InterfaceDemoClass();
		obj.circle();
		obj.square();
		Shape.rectangle();
	}


}

package polymorphism;

public class ConstructorOverloadingMain {

	public static void main(String[] args) {
		ConstructorOverloading co1 = new ConstructorOverloading();
		co1.display();

		System.out.println();

		ConstructorOverloading co2 = new ConstructorOverloading(10,20);
		co2.display();

		System.out.println();

		ConstructorOverloading co3 = new ConstructorOverloading(1,49.99);
		co3.display();
		
		System.out.println();

		ConstructorOverloading co4 = new ConstructorOverloading(99.99,1);
		co4.display();
	}
}

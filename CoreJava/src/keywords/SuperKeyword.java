package keywords;

class Animal {

	String color = "white";

	void eat() {
		System.out.println("Animal is eating");
	}
}

class Dog extends Animal {

	String color = "black";

	void displaycolor() {
		System.out.println("Color is: " + color);
		System.out.println("Color is: " + super.color);
	}

	void eat() {
		System.out.println("Dog is eating bread");
		super.eat();
	}
}

public class SuperKeyword {

	public static void main(String[] args) {

		Dog d = new Dog();
		
		d.displaycolor();   
		
		d.eat();
	}
}

package inheritance;

//Extending classes in different levels i.e. child1-->parent, child2-->parent, child3-->parent,

class child1 extends ParentClass{
	void child1Method() {
		System.out.println("I am a method from child class 1");
	}
}

class child2 extends ParentClass{
	void child2Method() {
		System.out.println("I am a method from child class 2");
	}
}

class child3 extends ParentClass{
	void child3Method() {
		System.out.println("I am a method from child class 3");
	}
}

public class HeirarchialInheritance {

	public static void main(String[] args) {
		child1 c1 = new child1();
		c1.parentClassMethod();
		c1.child1Method();
		
		child2 c2 = new child2();
		c2.parentClassMethod();
		c2.child2Method();
		
		child3 c3 = new child3();
		c3.parentClassMethod();
		c3.child3Method();

	}

}

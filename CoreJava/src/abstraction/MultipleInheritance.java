package abstraction;


interface A{
	int x = 100;
	void m1();
}

interface B{
	int y = 200;
	void m2();
}

class C{
	int z = 300;
	void m3() {
		System.out.println("Method m3");
	}
}

public class MultipleInheritance extends C implements A,B{

	@Override
	public void m1() {
		System.out.println("Method m1");	
	}

	@Override
	public void m2() {
		System.out.println("Method m2");
	}

	public static void main(String[] args) {
		MultipleInheritance obj = new MultipleInheritance();
		obj.m1();
		obj.m2();
		obj.m3();
	}

}

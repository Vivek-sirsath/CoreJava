package polymorphism;

public class MethodOverloadingMain {

	public static void main(String[] args) {
		MethodOverloading add = new MethodOverloading();
		add.addition(5, 10);
		add.addition(5, 10, 20);
		add.addition(5.80f, 10.20f, 20);
		add.addition(80, 18.5f, 1.5f);
	}
}

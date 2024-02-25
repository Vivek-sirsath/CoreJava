package keywords;

final class Test1{
	final int x =100;
	
	final void m() {
		System.out.println("This is method m from test1 class");
	}
}

/*
 * class Test2 extends Test1{ 		Final Class cannot be inherited
	m() {                    		Final Method cannot be override
		System.out.println("This is method m from test2 class");
	}
}
*/

public class FinalKeyword {
	public static void main(String[] args) {
		Test1 t = new Test1();
		//t.x=200;                	value of Final Variable cannot be changed
		System.out.println(t.x);
	}
}

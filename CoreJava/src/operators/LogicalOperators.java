package operators;

public class LogicalOperators {

	public static void main(String[] args) {

		//Logical Operators : &&, ||, ! : Can be used on boolean values and returns boolean output

		int a= 10 ;
		int b= 20 ;
		int c= 30 ;

		// 1.Both values are true
		//Logical AND-&&
		System.out.println(a<b && b<c);  //true

		//Logical OR-||
		System.out.println(a<b || b<c);	 //true

		System.out.println("******************************");

		// 2.Either of values is true
		//Logical AND-&&
		System.out.println(a<b && b>c);  //false

		//Logical OR-||
		System.out.println(a<b || b>c);  //true

		System.out.println("******************************");

		// 3.Both values are false
		//Logical AND-&&
		System.out.println(a>b && b>c);  //false

		//Logical OR-||
		System.out.println(a>b || b>c);  //false

		System.out.println("******************************");

		boolean x =true;
		boolean y =false;

		//4. Not operator
		System.out.println(!x);  //false
		System.out.println(!y);  //true

	}

}

package methodoverriding;

public class MethodOverridingMain extends MethodOverriding{
	
	public int method(int a, int b) {
		int result = a*b;
		System.out.println("Multiplication of two Numbers is: " +result);
		return result;
	}
	
	public static void main(String[] args) {
		MethodOverridingMain obj = new MethodOverridingMain();
		obj.method(5, 10);
		
		MethodOverriding obj2 = new MethodOverriding();
		obj2.method(5, 10);
	}
}

package constructors;

public class ParameterizedConstructor {

	int x,y;
	String s;

	//Parameterized Constructor - With Parameters
	ParameterizedConstructor(int a, int b, String str){
		x=a;
		y=b;
		s=str;
	}

	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}

	public static void main(String[] args) {
		ParameterizedConstructor con = new ParameterizedConstructor(100,200,"Himanshu");
		con.displayData();
	}
}

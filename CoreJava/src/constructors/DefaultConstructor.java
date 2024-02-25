package constructors;

public class DefaultConstructor {

	int x,y;
	String s;
	
	//Default Constructor - No Parameters
	DefaultConstructor(){
		x=100;y=200;
		s="Himanshu";
	}

	void displayData() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
	}

	public static void main(String[] args) {
		DefaultConstructor con = new DefaultConstructor();
		con.displayData();
	}
}

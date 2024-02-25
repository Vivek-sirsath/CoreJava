package polymorphism;
/*
 * Rule-1: Constructor name should be same
 * Rule-2: No. of parameters should be different
 * Rule-3: Data type of parameters should be different
 * Rule-4: Order of parameters should be different
 */
public class ConstructorOverloading {
	
	int x;
	int y;
	double d;
	
	ConstructorOverloading() {
		x=10;
		y=40;
	}

	//Overloading constructor with different number of parameters
	ConstructorOverloading(int a, int b) {
		x=a;
		y=b;
	}

	//Overloading constructor with different data type of parameters
	ConstructorOverloading(int a, double b) {
		x=a;
		d=b;
	}

	//Overloading constructor with different order of parameters
	ConstructorOverloading(double b, int a) {
		x=a;
		d=b;
	}
	
	public void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
}

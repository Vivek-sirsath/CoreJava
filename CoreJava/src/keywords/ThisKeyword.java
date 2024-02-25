package keywords;

public class ThisKeyword {
	/*
	 * To use same variables as instance and local variables , this keyword is used to avoid confusion
	 */

	int x,y;  //Instance variables

	void setData(int x, int y) {   //Local Variables
		this.x=x;
		this.y=y;
	}

	void getData() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		ThisKeyword th = new ThisKeyword();
		th.setData(10, 20);
		th.getData();
	}
}

package classandobject;

public class StudentMainClass {

	public static void main(String[] args) {
		//Object of Student Class
		StudentClass stu = new StudentClass();

		//Calling method of class using object instance
		System.out.print("Student1 details: ");
		stu.stuDetails(100, "ANUSHKA", "B.tech");

		System.out.print("Student2 details: ");
		stu.stuDetails(101, "PARNIKA", "B.tech");

		System.out.print("Student3 details: ");
		stu.stuDetails(102, "BABU", "M.tech");

	}

}

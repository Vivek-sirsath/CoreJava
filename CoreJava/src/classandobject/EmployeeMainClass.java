package classandobject;

public class EmployeeMainClass {

	public static void main(String[] args) {

		//Object of Employee Class
		EmployeeClass emp = new EmployeeClass();

		//Calling variables of class using object instance
		emp.empId=1018386;
		emp.empName="Himanshu";
		emp.empDesignation="QAA-2";
		emp.empSalary=800000;

		//Calling method of class using object instance
		emp.empDetails();
	}
}

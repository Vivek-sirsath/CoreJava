package classandobject;

//Employee Class having variables and method
public class EmployeeClass {

	int empId;
	String empName;
	String empDesignation;
	int empSalary;

	public void empDetails() {
		System.out.println("Employee ID is: " + empId);
		System.out.println("Employee Name is: " + empName);
		System.out.println("Employee Designation is: " + empDesignation);
		System.out.println("Employee Salary is: " + empSalary);
	}
}

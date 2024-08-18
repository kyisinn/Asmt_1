package Week3Day3;

public class Employee {
	private String name;
	private int employeeId;
	private double basicSalary;
	private static int count=0;
	public Employee() {
		
	}
	public Employee(String name, int employeeId, double basicSalary) {
		this.name = name;
		this.employeeId = employeeId;
		this.basicSalary = basicSalary;
		count++;
	}
	public double calculateSalary() {
		return this.basicSalary;
		
	}
	public double getBasicSalary() {
		return basicSalary;
		
	}
	public static int getLCount() {
		return count;
		
	}
	public void display() {
		System.out.println("Employee name :"+this.name);
		System.out.println("Employee ID : "+this.employeeId);
		System.out.println("Basic Salary :"+this.basicSalary);
		System.out.println("Total Salary :"+this.calculateSalary());
		System.out.println();
	}

}

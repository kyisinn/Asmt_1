package Week3Day3;

public class PartTimeEmployee extends Employee {
	private int hoursWorked;
	private double hourlyRate;
	private static int count=0;
	public PartTimeEmployee(String name,double basicSalary,int hoursWorked, double hourlyRate) {
		super(name,basicSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
		count++;
	}
	@Override
	public double calculateSalary() {
		return this.hourlyRate*this.hoursWorked;	
	}
	public static int getLCount() {
		return count;
		
	}
	
	@Override
	public void display() {
		System.out.println("****PartTime Employee****");
		System.out.println("PartTimeEmployeeCount: "+getLCount());
		super.display();
		
	}

}

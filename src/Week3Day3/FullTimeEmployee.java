package Week3Day3;

public class FullTimeEmployee extends Employee {
	private double allowence;
	private double bonus;
	private static int count=0;
	public FullTimeEmployee(String name,double basicSalary,double allowence, double bonus) {
		super(name,basicSalary);
		this.allowence = allowence;
		this.bonus = bonus;
		count++;
	}
	@Override
	public double calculateSalary() {
		return this.allowence+this.bonus+this.getBasicSalary();
	
	
	}
	public static int getLCount() {
		return count;
		
	}
	@Override
	public void display() {
		System.out.println("****fullTime Employee****");
		//System.out.println();
		System.out.println("FullTimeEmployeeCount:"+getLCount());
		super.display();
		
	}
	
}

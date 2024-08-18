package Week3Day3;

public class ContractEmployee extends Employee{
	private int contractDuration;
	private double contractAmount;
	private static int count;
	
	public ContractEmployee(String name,int employeeId,double basicSalary,int contractDuration, double contractAmount) {
		super(name,employeeId,basicSalary);
		this.contractDuration = contractDuration;
		this.contractAmount = contractAmount;
		count++;
	}
	@Override
	public double calculateSalary() {
		return this.contractAmount/this.contractDuration;
		
	}
	
	public static int getLCount() {
		return count;
		
	}
	@Override
	public void display() {
		System.out.println("****Contract Employee****");
		System.out.println("ContractEmployeeCount: "+getLCount());
		super.display();
		
	}

}

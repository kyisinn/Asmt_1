package Week3Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeRegisterationService {
	public Employee[] employeeDataB = new Employee[1000];
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	private String name;
	private double basicSalary;
	private String type;
	
	public void   getEmoloyeesInfo() throws IOException {
		String flag;
		do {
	
		this.commonEmployeeInfo();
		
		if ("contract".equalsIgnoreCase(this.type)) {
			
			employeeDataB[Employee.getLCount()]=this.getContractEmployeeInfo();//store the array
			
	
			
		}else if("fulltime".equalsIgnoreCase(this.type)) {
			employeeDataB[Employee.getLCount()]=this.getFullTimeEmployeeInfo();
			
			
			
		}else if("parttime".equalsIgnoreCase(this.type)) {
			employeeDataB[Employee.getLCount()]=this.getPartTimeEmployeeInfo();
			
		}
		System.out.println("Do u want to add new Employee (yes/no) ? ");
		flag= br.readLine();
		}while(flag.equalsIgnoreCase("yes"));
		
		
	}
	public void commonEmployeeInfo() throws IOException{
		System.out.println("Enter Emp Name: ");
		this.name = br.readLine();
		
		System.out.println("Enter Emp Basic Salary : ");
		this.basicSalary = Double.parseDouble(br.readLine());
		
		
		System.out.println("Enter Emp Type (contract/fulltime/partime)? ");
		 this.type =br.readLine();

		
	}
	public ContractEmployee getContractEmployeeInfo() throws IOException{
		
		System.out.println("Enter constract Duaration : ");
		int duration =Integer.parseInt(br.readLine());
		
		System.out.println("Enter Contract Amount: ");
		Double amount= Double.parseDouble(br.readLine());
		
		ContractEmployee contractEmp = new ContractEmployee(name, basicSalary, duration, amount);
		
		return contractEmp;	
	}
	public FullTimeEmployee getFullTimeEmployeeInfo() throws IOException{
		
		System.out.println("Enter allowence : ");
		double allowence = Double.parseDouble(br.readLine());
		
		System.out.println("Enter bonus:  ");
		double bonus = Double.parseDouble(br.readLine());
		
		FullTimeEmployee fulltimeEmp = new FullTimeEmployee(name,basicSalary, allowence, bonus);
		return fulltimeEmp;
		
		
	}
	public PartTimeEmployee getPartTimeEmployeeInfo() throws IOException{
		System.out.println("Enter Hours Worked :");
		int hoursWork =Integer.parseInt(br.readLine());
		System.out.println("Enter hourly Rate : ");
		double hourlyRate = Double.parseDouble(br.readLine());
		
		PartTimeEmployee parttimeEmp = new PartTimeEmployee(name, basicSalary, hoursWork, hourlyRate);
		return parttimeEmp;
		
		
		
	}

	

}

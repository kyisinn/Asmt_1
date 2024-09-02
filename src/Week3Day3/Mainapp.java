package Week3Day3;

import java.io.IOException;

public class Mainapp {

	public static void main(String[] args) throws IOException {
		
		EmployeeRegisterationService service = new EmployeeRegisterationService ();
		service.getEmoloyeesInfo();
		for (int i = 0;i <Employee.getLCount();i++) {
				service.employeeDataB[i].display();
			
		}

	
		//emp4.display();
		
		///System.out.println("Total Employee Count: "+Employee.getLCount());
		//System.out.println("Total fulltime Count: "+Employee.getLCount());
		//System.out.println("Total parttimeEmployee Count: "+Employee.getLCount());//static type called class
		//System.out.println("Total contract Count: "+Employee.getLCount());
		

	}

}

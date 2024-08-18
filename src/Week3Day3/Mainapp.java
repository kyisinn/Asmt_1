package Week3Day3;

public class Mainapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		Employee emp1= new PartTimeEmployee("John Doe", 101, 500000.0, 1, 70000.0);
		Employee emp2= new FullTimeEmployee("John Smith", 102, 0.0, 0.0, 12000.0);
		Employee emp3= new ContractEmployee("Mark Johnson", 103, 0.0, 1, 5000.0);
		////Employee emp4= new FullTimeEmployee("tt", 6611, 3000, 3, 100);
		//System.out.println(emp1);
		
		emp1.display();//non static 
		emp2.display();
		emp3.display();
		//emp4.display();
		
		///System.out.println("Total Employee Count: "+Employee.getLCount());
		//System.out.println("Total fulltime Count: "+Employee.getLCount());
		//System.out.println("Total parttimeEmployee Count: "+Employee.getLCount());//static type called class
		//System.out.println("Total contract Count: "+Employee.getLCount());
		

	}

}

package Week4Day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainApp {
	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		VehicleRegisterationService service = null;
		String flag;
		do {
			System.out.print("Enter Vehicle Type(Car/Truck/Motorcycle):");
			String type =br.readLine();
		if (type.equalsIgnoreCase("car")) {
			service= new CarRegisterationService();
			
			
		}else if (type.equalsIgnoreCase("cycle")) {
			service = new MotorcycleRegisterationService();
			
			
		}
		else if(type.equalsIgnoreCase("truck")) {
			service =new TruckRegisterationService();
			
		}
		service.create();
		
		System.out.println("Do u want to add another vehicle (yes/no) ? ");
		flag= br.readLine();
		
		}while(flag.equalsIgnoreCase("yes"));
		
		service.displayInfo();
		
//		Vehicle vehicle =new Vehicle("BmW", "2001");
//		vehicle.displayInfo();
//	

	}

}

package Week4Day3;

import java.io.IOException;

public class CarRegisterationService extends VehicleRegisterationService{

	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter door :");
		int door= Integer.parseInt(br.readLine());
		
		Vehicle car = new Car(this.getVehicle(),door);
		
		vehicleList[Vehicle.getCount()-1] = car;
	}

	
	

}

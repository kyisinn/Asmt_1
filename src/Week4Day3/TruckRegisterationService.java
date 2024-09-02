package Week4Day3;

import java.io.IOException;

public class TruckRegisterationService extends VehicleRegisterationService{
	@Override
	public void registerProcess() throws IOException {
		System.out.println("Enter Capacity :");
		int capacity = Integer.parseInt(br.readLine());
		Vehicle truck = new Truck(this.getVehicle(), capacity);
		this.setVehicle(truck);
		vehicleList[Vehicle.getCount()-1]= truck;
		
	}

	

}

package a3test;

import a3.CompletedRide;
import a3.CompletedRideImpl;
import a3.Driver;
import a3.DriverImpl;
import a3.Vehicle;
import a3.VehicleImpl;
import a3.Position;
import a3.PositionImpl;
import a3.RideRequest;
import a3.RideRequestImpl;



public class CompletedRideTest {

		public static void main(String[] args) {
			Position position = new PositionImpl(0,0);
			Vehicle vehicle = new VehicleImpl("ford", "mustang", "D88989", position);
			Driver driver = new DriverImpl("Stan", "King", 87, vehicle);
			Position clientPos = new PositionImpl(8,8);
			Position destination = new PositionImpl(4,4);
			RideRequest rr = new RideRequestImpl(clientPos, destination);
			CompletedRide completedRide = new CompletedRideImpl(rr, driver);
			
			
			System.out.println("RideTime: " + rr.getRideTime());
			System.out.println("Wait Time: " + completedRide.getWaitTime());
			System.out.println("TotalTime: " + completedRide.getTotalTime());
			System.out.println("Cost: " + completedRide.getCost());
			System.out.println("Price: " + completedRide.getPrice());
			System.out.println("Profit: " + completedRide.getProfit());
					
			
		}
}



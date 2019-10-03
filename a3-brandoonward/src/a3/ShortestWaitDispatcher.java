package a3;

public class ShortestWaitDispatcher implements Dispatcher {

	@Override
	public Driver chooseDriver(Driver[] availableDrivers, RideRequest request) {
		int index = 0;
		int shortest = availableDrivers[0].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
		for (int i =0; i<availableDrivers.length; i++) {
			
			if (shortest > availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition())) {
				shortest = availableDrivers[i].getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
				index = i;
			}
		}
		return availableDrivers[index];
	}

}

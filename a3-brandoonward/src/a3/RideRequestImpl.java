package a3;

public class RideRequestImpl implements RideRequest {

	private Position clientPosition;
	private Position destination;
	private boolean isComplete;
	CompletedRide cr;
	
	public RideRequestImpl(Position clientPosition, Position destination) {
		this.clientPosition = clientPosition;
		this.destination = destination;
		isComplete = false;
		
		if (clientPosition == null || destination == null)	{
			throw new RuntimeException("One or more values are null.");
		}
		
	}
	
	@Override
	public Position getClientPosition() {
		// TODO Auto-generated method stub
		return clientPosition;
	}

	@Override
	public Position getDestination() {
		// TODO Auto-generated method stub
		return destination;
	}

	@Override
	public boolean getIsComplete() {
		// TODO Auto-generated method stub
		return isComplete;
		
	}

	@Override
	public CompletedRide complete(Driver driver) {
		// TODO Auto-generated method stub

		//RideRequest rr = new RideRequestImpl(this.clientPosition, this.destination);
		
		if (getIsComplete() != true) {
			cr = new CompletedRideImpl(this, driver);
			
			Vehicle vehicle = cr.getDriver().getVehicle();
			vehicle.moveToPosition(clientPosition);
			vehicle.moveToPosition(destination);
			isComplete = true;
		}
		return cr;
		
		
		
	}

	@Override
	public int getRideTime() {
		Position position = getClientPosition();
		return position.getManhattanDistanceTo(getDestination());
	}

}

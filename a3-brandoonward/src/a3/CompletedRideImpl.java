package a3;

public class CompletedRideImpl implements CompletedRide {
	private RideRequest request;
	private Driver driver;
	private int waitTime;
	private int distanceTo;
	//private double cost;
	//private double price;
	
	public CompletedRideImpl(RideRequest request, Driver driver) {
		if (driver == null || request == null) {
			throw new RuntimeException("Either the driver or request is null.");
		}
		
		this.driver = driver;
		this.request = request;
		this.distanceTo = request.getRideTime();
		waitTime = driver.getVehicle().getPosition().getManhattanDistanceTo(request.getClientPosition());
		//cost = getCost();
		
		
	}
	
	@Override
	public RideRequest getRequest() {
		// TODO Auto-generated method stub
		return request;
	}

	@Override
	public Driver getDriver() {
		// TODO Auto-generated method stub
		return driver;
	}

	@Override
	public int getWaitTime() {
		// TODO Auto-generated method stub
		
		return waitTime;
	}

	@Override
	public int getTotalTime() {
		return (int) (distanceTo + waitTime);
	}

	@Override
	public double getCost() {
		return ((distanceTo * .5) + (waitTime * .1));
		
	}

	@Override
	public double getPrice() {
		
		if (waitTime < 25) {
			return 2.5 * request.getRideTime();
		} else if (waitTime >= 25 && waitTime <= 49) {
			return 2 * request.getRideTime();
		} else if (waitTime >= 50 && waitTime <= 99) {
			return request.getRideTime();
		} else if (waitTime >= 100) {
			return request.getRideTime() * .5;
		} else {
			throw new RuntimeException("Bad input.");
		}
		
		
	}

	@Override
	public double getProfit() {
		return getPrice() - getCost();
	}

}

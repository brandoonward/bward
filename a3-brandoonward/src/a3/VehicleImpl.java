package a3;

public class VehicleImpl implements Vehicle {

	private String make;
	private String model;
	private String plate;
	private int mileage = 0; 
	private Position position;
	
	public VehicleImpl(String make, String model, String plate, Position position) {
		this.make = make;
		this.model = model;
		this.plate = plate;
		this.position = position;
		
		if (make == null || model == null || plate == null || position == null) {
			throw new RuntimeException("One of the values is null.");
		}
	}
	
	@Override
	public String getMake() {
		// TODO Auto-generated method stub
		return make;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return model;
	}

	@Override
	public String getPlate() {
		// TODO Auto-generated method stub
		return plate;
	}

	@Override
	public int getMileage() {
		// TODO Auto-generated method stub
		return mileage;
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public void moveToPosition(Position p) {
		if (p == null) {
			throw new RuntimeException("Position is null");
		}
		mileage += position.getManhattanDistanceTo(p);
		position = p;
	}

}

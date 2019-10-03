package a3;

public class DriverImpl implements Driver {
	private String firstName;
	private String lastName;
	private Integer id;
	private Vehicle vehicle;
	
	public DriverImpl(String first, String last, int id, Vehicle vehicle) {
		this.firstName = first;
		this.lastName = last;
		this.id = id;
		this.vehicle = vehicle;
		
		if (firstName == null || lastName == null || vehicle == null) {
			throw new RuntimeException("One of the values is null.");
		}
		
		if (id < 0) {
			throw new RuntimeException("Id is negative.");
		}
	}
	
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}


	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public Vehicle getVehicle() {
		if (vehicle == null) {
			throw new RuntimeException("Vehicle is null.");
		}
		return vehicle;
	}

	@Override
	public void setVehicle(Vehicle v) {
		if (v == null) {
			throw new RuntimeException("Vehicle is null.");
		}
		vehicle = v;
	}

}

package a3;

public class PositionImpl implements Position {

	private int x;
	private int y;
	
	public PositionImpl(int x, int y) {
		this.x = x;
		this.y = y;
		
		/*if (x < 0 || x > 100 || y < 0 || y > 100) {
			throw new RuntimeException("Invalid position.");
		}*/
	}
	
	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	

}

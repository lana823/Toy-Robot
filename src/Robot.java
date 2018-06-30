// this is the toy robot simulator 


public class Robot {
	
	// this is four direction of robot facing
	public enum FACING {NORTH, SOUTH, EAST, WEST}
	
	private int x;

	private int y;
	
	private FACING facing;
	
	
	public void place (int x, int y, String facing ) {

		this.x = x;

		this.y = y;

		switch (Robot.FACING.valueOf(facing.toUpperCase())) {

		case NORTH :
			this.facing = FACING.EAST;
			break;
		
		case SOUTH :
			this.facing = FACING.WEST;
			break;
			
		case EAST :
			this.facing = FACING.SOUTH;
			break;
			
		case WEST :
			this.facing = FACING.NORTH;
			break;
			
		default :
			System.out.println("Please enter valid direction.");
			break;

		}

	}



}

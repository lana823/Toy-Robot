// this is the toy robot simulator 


public class Robot {
	
	// this is four direction of robot facing
	public enum FACING {NORTH, SOUTH, EAST, WEST}
	
	private int x;

	private int y;
	
	private FACING facing;
	
	
	public void PLACE (int x, int y, String facing ) {

		this.x = x;

		this.y = y;

		switch (Robot.FACING.valueOf(facing.toUpperCase())) {

		case NORTH :
			this.facing = FACING.NORTH;
			break;
		
		case SOUTH :
			this.facing = FACING.SOUTH;
			break;
			
		case EAST :
			this.facing = FACING.EAST;
			break;
			
		case WEST :
			this.facing = FACING.WEST;
			break;
			
		default :
			System.out.println("Please enter valid direction.");
			break;

		}
		
		

	}
	
	//turn right
	public void RIGHT () {
		switch (this.facing) {
		
		case NORTH:
			this.facing = FACING.EAST;
			break;
			
		case EAST:
			this.facing = FACING.SOUTH;
			break;
		
		case SOUTH:
			this.facing = FACING.WEST;
			break;
		
		case WEST:
			this.facing = FACING.NORTH;
			break;
			
		default :
			break;
			
		}
	}



}

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
	
	public void LEFT () {
		switch (this.facing) {
		
		case NORTH:
			this.facing = FACING.WEST;
			break;
			
		case WEST:
			this.facing = FACING.SOUTH;
			break;
		
		case SOUTH:
			this.facing = FACING.EAST;
			break;
		
		case EAST:
			this.facing = FACING.NORTH;
			break;
			
		default :
			break;
			
		}
	}
	
	//add report function
	public void REPORT () {

		String status = Integer.toString(this.x) + "," + Integer.toString(this.y) + "," + this.facing.toString();

		System.out.println(status);

		}
	
	public void MOVE () {
		switch (this.facing) {
		
		case NORTH:
			while (this.y < Border.NORTH_BORDER) {
				this.y = this.y + 1;
			}
			
			break;
			
		case WEST:
			while (this.x > Border.WEST_BORDER) {
				this.x = this.x - 1;
			}
			
			break;
		
		case SOUTH:
			while (this.y > Border.SOUTH_BORDER) {
				this.y = this.y - 1;
			}
			
			break;
		
		case EAST:
			while (this.x < Border.EAST_BORDER) {
				this.x = this.x + 1;
			}
			
			break;
			
		default :
			break;
			
		}
	}



}

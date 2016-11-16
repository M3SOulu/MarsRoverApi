package tdd.training.session1;

public class MarsRover {
	
	public static final Integer N = 1;
	public static final Integer E = 2;
	public static final Integer S = 3;
	public static final Integer W = 4;
	Integer x = 0;
	Integer y = 0;
	Integer facing = N;
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		for (int idx = 0; idx < command.length(); idx++) {
			executeCommand(command.charAt(idx));
		}
		
		return null;
	}
	

	private void executeCommand(Character command) {
		if (command.equals('L')) {
			turnLeft();
		} else if (command.equals('R')) {
			turnRight();
		} else if (command.equals('M')) {
			move();
		} else {
			throw new IllegalArgumentException(
					"Speak in Mars language, please!");
		}
	}
	public void move() {
		if (facing == N) {
			this.y++  ;
		} else if (facing == E) {
			this.x++  ;
		} else if (facing == S) {
			this.y--;
		} else if (facing == W) {
			this.x--;
		}
	}
	public void turnLeft() {
		facing = (facing - 1) < N ? W : facing - 1;
	}
	public void turnRight() {
		facing = (facing +  1) > W ? N : facing + 1;
	}
	
	public void setPosition(Integer x, Integer y, Integer facing) {
		this.x = x;
		this.y = y;
		this.facing = facing;
	}
}

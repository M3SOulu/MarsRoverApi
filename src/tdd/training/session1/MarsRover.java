package tdd.training.session1;

public class MarsRover {
	static int posX = 1;
	static int posY = 1;
	static char facing = 'O';
	
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
	}

	public String Test (String command) {
		executeCommand(command);
		String position = Integer.toString(posX) + Integer.toString(posY) + facing;
		return position;
	}


	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		for (int i = 0; i < command.length(); i++) {
			char action = command.charAt(i);
			
			if (facing == 'N') {
				switch (action) {
					case 'f':
						posY++;
					case 'b':
						posY--;
					case 'r':
						facing = 'E';
					case 'l':
						facing = 'O';	
				}
			}
			
			else if (facing == 'S') {
				switch (action) {
					case 'f':
						posY--;
					case 'b':
						posY++;
					case 'r':
						facing = 'O';
					case 'l':
						facing = 'E';	
				}
			}
			
			else if (facing == 'E') {
				switch (action) {
					case 'f':
						posX++;
					case 'b':
						posX--;
					case 'r':
						facing = 'S';
					case 'l':
						facing = 'N';	
				}
			}
			
			else if (facing == 'O') {
				switch (action) {
					case 'f':
						posX--;
					case 'b':
						posX++;
					case 'r':
						facing = 'N';
					case 'l':
						facing = 'S';	
				}
			}
		}
		
		return null;
	}
}

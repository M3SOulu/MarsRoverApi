package tdd.training.session1;

public class MarsRover {
	
	Rover A;

	public MarsRover(int x, int y, String obstacles) {
		/*
		 * x and y represent the size of the grid. Obstacles is a String
		 * formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no
		 * white spaces.
		 * 
		 * Example use: MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")
		 * //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		 */
	}

	public String executeCommand(String command) {
		/*
		 * The command string is composed of "f" (forward), "b" (backward), "l"
		 * (left) and "r" (right) Example: The rover is on a 100x100 grid at
		 * location (0, 0) and facing NORTH. The rover is given the commands
		 * "ffrff" and should end up at (2, 2) facing East.
		 * 
		 * The return string is in the format:
		 * ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)? Where x and y are
		 * the final coordinates, facing is the current direction the rover is
		 * pointing to (N,S,W,E). The return string should also contain a list
		 * of coordinates of the encountered obstacles. No white spaces.
		 */
		String percorso;
		
		for (int i = 0; i <= command.length(); i++) {
			int moment = 0;
			int moment1 = 0;
			
			switch (command.charAt(i)) {
			case 'f':
				moment = A.getPos_y() + 1;
				A.setPos_y(moment);
				break;

			case 'b':
				moment = A.getPos_y() - 1;
				A.setPos_y(moment);
				break;

			case 'l':
				moment = A.getPos_x();
				moment1 = A.getPos_y();
				
				A.setPos_x(moment);
				A.setPos_y(moment1);
				break;

			case 'r':
				moment = A.getPos_x();
				moment1 = A.getPos_y();
				
				A.setPos_x(moment1);
				A.setPos_y(moment);
				
				break;
			}

		}
		
		return null;
	}
}

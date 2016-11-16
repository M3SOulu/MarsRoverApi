package tdd.training.session1;

public class MarsRover {

	private Object planet[][];
	private Rover rover;

	public MarsRover(int x, int y, String obstacles) {

		/*
		 * x and y represent the size of the grid. Obstacles is a String
		 * formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no
		 * white spaces.
		 * 
		 * Example use: MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")
		 * //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		 */

		// Crea il pianeta
		planet = new Object[x+1][y+1];
		// Rimuovi dalla stringa tutti i caratteri che non sono numeri
		obstacles = obstacles.replaceAll("\\D+", "");
		// System.out.println(obstacles);

		// Inserisci ostacoli sul pianeta
		int i = 0;
		int contObstacle = 0;
		while (i < obstacles.length()) {

			int xOb = Character.getNumericValue(obstacles.charAt(i));
			i++;
			int yOb = Character.getNumericValue(obstacles.charAt(i));

			contObstacle++;
			Obstacle obstacle = new Obstacle(xOb, yOb, "Obstacle" + contObstacle);
			planet[xOb][yOb] = obstacle;
			// System.out.println(xOb+" "+yOb);
			i++;
		}

		// Crea il rover e mettilo nella posizione (0,0,N)

		rover = new Rover(0, 0, 'S');
		planet[0][0] = rover;

		// System.out.println(planet[2][1]);

	}

	// TODO RIMETTERE STRING COME VALORE DI RITORNO
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

		int i = 0;
		String obPosition = "";
		while (i < command.length()) {

			char actualCommand = command.charAt(i);
			char roverFacing = rover.getFacing();
			int xRover = rover.getXRover();
			int yRover = rover.getYRover();

			if (actualCommand == 'f') {
				
				if (roverFacing == 'N') {
					if ((planet.length-1) == yRover)
						yRover = -1;
					if (planet[xRover][yRover + 1] == null) {
						planet[xRover][rover.getYRover()] = null;
						planet[xRover][yRover + 1] = rover;
						rover.SetPosition(xRover, yRover + 1);
					} else {
						Obstacle obstacle = (Obstacle) planet[xRover][yRover + 1];
						obPosition += obstacle;
					}

				}
				
				else if (roverFacing == 'S') {
					if (yRover == 0)
						yRover = planet[0].length;
					if (planet[xRover][yRover - 1] == null) {
						planet[xRover][rover.getYRover()] = null;
						planet[xRover][yRover - 1] = rover;
						rover.SetPosition(xRover, yRover - 1);
					} else {
						Obstacle obstacle = (Obstacle) planet[xRover][yRover - 1];
						obPosition += obstacle;
					}

				}	
				
				else if (roverFacing == 'E') {
					if ((planet[0].length-1) == xRover)
						xRover = -1;
					if (planet[xRover + 1][yRover] == null) {
						planet[rover.getXRover()][yRover] = null;
						planet[xRover + 1][yRover] = rover;
						rover.SetPosition(xRover + 1, yRover);
					} else {
						Obstacle obstacle = (Obstacle) planet[xRover +1][yRover];
						obPosition += obstacle;
					}

				}
				
				else if (roverFacing == 'W') {
					if (xRover == 0)
						xRover = planet.length;
					if (planet[xRover - 1][yRover] == null) {
						planet[rover.getXRover()][yRover] = null;
						planet[xRover - 1][yRover] = rover;
						rover.SetPosition(xRover - 1, yRover);
					} else {
						Obstacle obstacle = (Obstacle) planet[xRover -1][yRover];
						obPosition += obstacle;
					}

				}
				
			}
			 System.out.println(rover.getXRover()+" "+rover.getYRover());
			i++;
		}

		return rover+obPosition;
	}

	public static void main(String[] args) {

		MarsRover rover = new MarsRover(3, 3, "(2,3)");
		String test = rover.executeCommand("");
		System.out.println(test);
		//Object array[][] = new Object[3][4];
		//System.out.println(array[0].length);
	}

}

package tdd.training.session1;

import java.util.ArrayList;

public class MarsRover {
	private Position rPos = new Position(0, 0);
	private String rDir = "N";
	private ArrayList<Position> obstacles = new ArrayList<Position>();

	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: (o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y) with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
	public MarsRover(int x, int y, String obstacles) throws MarsRoverException {
		rPos = new Position(0, 0);
		rDir = "N";
		if (!obstacles.isEmpty()){
			if (Utils.countOccurencesOf(obstacles, "(") != Utils.countOccurencesOf(obstacles, ")") ||
				Utils.countOccurencesOf(obstacles, "(") != Utils.countOccurencesOf(obstacles, ",")){
				throw new MarsRoverException();
			}
			System.out.println("ok-3" + obstacles);
			String _obstacles = obstacles.replace(")", "");
			System.out.println("ok-2");
			String[] values = _obstacles.split("(");
			System.out.println("ok-1");
			for (String value : values){
				String xPos = value.split(",")[0];
				String yPos = value.split(",")[1];
				System.out.println("ok0");
				if (!Utils.isInteger(xPos) || !Utils.isInteger(yPos)){
					throw new MarsRoverException();
				}
				System.out.println("ok1");
				Position obsPos = new Position(Integer.parseInt(xPos), Integer.parseInt(yPos));
				System.out.println("ok2");
				this.obstacles.add(obsPos);
			}
		}
		System.out.println(Utils.formatPosition(rPos.x, rPos.y, rDir));
		for (Position obstacle : this.obstacles){
			System.out.println(Utils.formatPosition(obstacle.x, obstacle.y));
		}
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		return null;
	}
}

package tdd.training.session1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class MarsRover {
	private Position rPos = new Position(0, 0);
	private String rDir = "N";
	private ArrayList<Position> obstacles = new ArrayList<Position>();
	private Set<Position> obstaclesFound = new HashSet<Position>();

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
				throw new MarsRoverException("Obstacles positions syntax error.");
			}
			String _obstacles = obstacles.replace("(", "");
			String[] values = _obstacles.split("\\)");
			for (String value : values){
				String xPos = value.split(",")[0];
				String yPos = value.split(",")[1];
				if (!Utils.isInteger(xPos) || !Utils.isInteger(yPos)){
					throw new MarsRoverException("Obstacles positions syntax error.");
				}
				Position obsPos = new Position(Integer.parseInt(xPos), Integer.parseInt(yPos));
				this.obstacles.add(obsPos);
			}
		}
	}

	/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
	 * Example: 
	 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
	 
	 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
	 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
	 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
	 */
	public String executeCommand(String command) throws MarsRoverException{
		char[] commands = command.toCharArray();
		for (char cmd : commands){
			Position obstacleFound = move(cmd);
			if (obstacleFound != null){
				obstaclesFound.add(obstacleFound);
			}
		}
		
		String pathResult = Utils.formatPosition(rPos.x, rPos.y, rDir);
		for (Position oPos : obstaclesFound){
			pathResult += Utils.formatPosition(oPos.x, oPos.y);
		}
		return pathResult;
	}
	
	//TODO grid size, return to other side when grid size limit exceded
	private Position move(char command) throws MarsRoverException{
		Position obstacle = null;
		//Utils.Direction moveDir = Utils.Direction.getByValue(command);
		Position nextPosition = rPos;
		switch (command){
		case Utils.FORWARD:
			nextPosition.moveForward(rDir);
			break;
		case Utils.BACKWARD:
			nextPosition.moveBackwards(rDir);
			break;
		case Utils.LEFT:
			rDir = Utils.cycleDirectionLeft(rDir);
			break;
		case Utils.RIGHT:
			rDir = Utils.cycleDirectionRight(rDir);
			break;
		default:
			throw new MarsRoverException("Unknown command: " + command);
		}
		if (obstacles.contains(nextPosition)){
			obstacle = nextPosition;
		}else{
			rPos = nextPosition;
		}
		return obstacle;
	}
	
	public String getPosition(){
		String str = Utils.formatPosition(rPos.x, rPos.y, rDir);
		return str;
	}
}

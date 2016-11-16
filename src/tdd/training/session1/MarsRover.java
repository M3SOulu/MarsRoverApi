package tdd.training.session1;

public class MarsRover {
	private String commandPattern = "[lrfb]+";
	private String obstaclesPattern = "([(]{1}[0-9]+[,]{1}[0-9]+[)]{1})+";
	private int xSize;
	private int ySize;
	private int xPos;
	private int yPos;
	private Direction direction;
	private int[][] planet;
	
	public MarsRover(int x, int y, String obstacles) throws MarsRoverException{
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
		if(verifyObstacles(obstacles)) throw new MarsRoverException();	
		
		xSize = x;
		ySize = y;
		xPos = 0;
		yPos = 0;
		planet = new int[x][y];	
		
		direction = Direction.NORTH;

	}
	
	public final void setObstacles(String obstacles) throws MarsRoverException{
		throw new MarsRoverException();
	}
	
	public int getCurrentX(){
		return xPos;
	}
	
	public int getCurrentY(){
		return yPos;
	}
	
	public Direction getDirection(){
		return direction;
	}
	
	public boolean verifyObstaclesRange(int xObstacle, int yObstacle){
		boolean verified = true;
		
		if(xObstacle<=0 || xObstacle>=xSize) verified = false;
		if(yObstacle<=0 || yObstacle>=xSize) verified = false;
		
		return verified;
	}
	
	public String executeCommand(String commands) throws MarsRoverException{
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		char[] commandList = commands.toCharArray();
		System.out.println(commands);
		System.out.println(commandList[0]);
		if(!verifyCommand(commands)) throw new MarsRoverException();
		
		for(int i=0; i<commandList.length; i++){
			switch(commandList[i]){
			case 'l':
				moveLeft();
				break;
			case 'r':
				moveRight();
				break;
			case 'f':
				moveForward();
				break;
			case 'b':
				moveBackward();
				break;
			}
		}
		String executedCommand = "("+xPos+","+yPos+","+direction.getValue()+")";
		System.out.println(executedCommand);
		return executedCommand;
	}
	
	public void moveForward(){
		switch(direction.getValue()){
		case 'N':
			if(yPos<ySize-1) yPos++;
			else yPos = 0;			
			break;
		case 'S':
			if(yPos>0) yPos--;
			else yPos = ySize-1;
			break;
		case 'E':
			if(xPos<xSize-1) xPos++;
			else xPos = 0;
			break;
		case 'W':
			if(xPos>0) xPos--;
			else xPos = xSize-1;
			break;
		}
	}

	public void moveBackward(){
		switch(direction.getValue()){
		case 'N':
			if(yPos>0) yPos--;
			else yPos = ySize-1;	
			break;
		case 'S':
			if(yPos<ySize-1) yPos++;
			else yPos = 0;
			break;
		case 'E':
			if(xPos>0) xPos--;
			else xPos = xSize-1;
			break;
		case 'W':
			if(xPos<xSize-1) xPos++;
			else xPos = 0;
			break;
		}
	}
	
	
	public void moveLeft(){
		
		switch(direction.getValue()){
		case 'N':
			direction = Direction.WEST;
			break;
		case 'S':
			direction = Direction.EAST;
			break;
		case 'E':
			direction = Direction.NORTH;
			break;
		case 'W':
			direction = Direction.SOUTH;
			break;
		}
	}
	
	public void moveRight(){		
		switch(direction.getValue()){
		case 'N':
			direction = Direction.EAST;
			break;
		case 'S':
			direction = Direction.WEST;
			break;
		case 'E':
			direction = Direction.SOUTH;
			break;
		case 'W':
			direction = Direction.NORTH;
			break;
		}
	}
	
	
	public boolean verifyObstacles(String obstacles){
		boolean verified = false;
		
		if(obstacles.matches(obstaclesPattern)) verified = true;
		
		return verified;
	}
	
	public boolean verifyCommand(String command){
		boolean verified = false;
		
		if(command.matches(commandPattern)) verified = true;
		
		return verified;
	}
}

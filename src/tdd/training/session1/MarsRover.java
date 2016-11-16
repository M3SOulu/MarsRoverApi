package tdd.training.session1;

public class MarsRover {
	private String commandPattern = "[lrfb]+";
	private String obstaclesPattern = "([(]{1}[0-9]+[,]{1}[0-9]+[)]{1})+";
	private int xSize;
	private int ySize;
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
		
		planet = new int[x][y];	

	}
	
	public final void setObstacles(String obstacles) throws MarsRoverException{
		String[] ostacoli = obstacles.split("(");
		
		for(String ostacolo : ostacoli){
			System.out.println(ostacolo);
			/*
			String[] temp = ostacolo.split(",");
			int xObstacle = Integer.parseInt(temp[0]);
			int yObstacle = Integer.parseInt(temp[1]);
			
			if(verifyObstaclesRange(xObstacle, yObstacle)) 
			
			planet[xObstacle][yObstacle] = -1;
			*/
			
		}
		throw new MarsRoverException();
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
		
		if(verifyCommand(commands)) throw new MarsRoverException();
		
		Direction direction = Direction.NORTH;
		int xPos = 0;
		int yPos = 0;
		char command;
		
		for(int i=0; i<commands.length(); i++){
			command = commands.charAt(i);
			
			switch(command){
			case 'l':
				moveLeft(direction)
				break;
			case 'r':
				break;
			case 'f':
				break;
			case 'b':
				break;
			}
		}
	
		return null;
	}
	
	public char moveLeft(Direction direction){
		char dir = direction.getValue();
		
		switch(direction){
		case Direction.NORTH:
			dir = 'W';
			break;
		case 'S':
			dir = 'E';
			break;
		case 'E':
			dir = 'N';
			break;
		case 'W':
			dir = 'S';
			break;
		}
		return dir;
	}
	
	public char moveRight(Direction direction){
		char dir = direction.getValue();
		
		switch(dir){
		case 'N':
			dir = 'E';
			break;
		case 'S':
			dir = 'W';
			break;
		case 'E':
			dir = 'S';
			break;
		case 'W':
			dir = 'N';
			break;
		}
		return dir;
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

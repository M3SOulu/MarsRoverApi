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

		
		planet[0][0] = 1;	
	}
	
	public final void setObstacles(String obstacles) throws MarsRoverException{
		String[] ostacoli = obstacles.split(")");
		
		for(String ostacolo : ostacoli){
			System.out.println(ostacolo);
			/*
			String[] temp = ostacolo.split(",");
			int xObstacle = Integer.parseInt(temp[0]);
			int yObstacle = Integer.parseInt(temp[1]);
			
			if(verifyObstaclesRange(xObstacle, yObstacle)) throw new MarsRoverException();
			
			planet[xObstacle][yObstacle] = -1;
			*/
		}
	}
	
	
	public boolean verifyObstaclesRange(int xObstacle, int yObstacle){
		boolean verified = true;
		
		if(xObstacle<=0 || xObstacle>=xSize) verified = false;
		if(yObstacle<=0 || yObstacle>=xSize) verified = false;
		
		return verified;
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

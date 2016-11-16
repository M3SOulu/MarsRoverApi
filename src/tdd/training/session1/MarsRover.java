package tdd.training.session1;

import java.util.ArrayList;
import java.util.Iterator;

public class MarsRover {
	
	private int width;
	private int height;
	
	private int x;
	private int y;
	
	
	private ArrayList<Obstacle> obs;
	
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		
		this.width=x;
		this.height=y;
		obs=makeObstacles(obstacles);
		
		this.x=0;
		this.y=0;

		
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
	
	/**
	 * create some obstacles in the map
	 * @param obstacles
	 * @return an array of obstacle or null
	 */
	public static ArrayList<Obstacle> makeObstacles(String obs){
		
		String[] obstaclesList= obs.split("[\\(\\)]");
		
		ArrayList<Obstacle> obstacles= new ArrayList<Obstacle>();
		
		for(int i=0;i<obstaclesList.length;i++){
			
			if(i%2==1){//nel vettore restituito dallo split gli oggetti in posizione dispari sono stringhe vuote
				
				obstacles.add(new Obstacle(obstaclesList[i]));
				
			}
		}
					
		return obstacles;
	}
	
	/**
	 * check for obstacle in a given coords
	 * @param x 
	 * @param y
	 * @return true if there is an obstacle or false otherwise
	 */
	public boolean checkObstacle(int x, int y){
		
		boolean result=false;
		
		Iterator<Obstacle> it= this.obs.iterator();
		
		while(it.hasNext()){
			
			Obstacle ob= it.next();
			
			if(ob.getX()==x && ob.getY()==y){
				
				result=true;
			}
		}
			
		return result;
	}
	
	public boolean isValidCommand(){
	
		boolean result=false;
		
		
		
		return result;
	}
	
	
}

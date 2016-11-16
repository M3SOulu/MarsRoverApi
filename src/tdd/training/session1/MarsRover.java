package tdd.training.session1;

import java.util.Arrays;

import javax.management.monitor.StringMonitor;


public class MarsRover {
	int planet[][];
	
	int x = 0;
	int y = 0;
	
	
	
	public MarsRover(int x, int y, String obstacles){
	
		this.x = x;
		this.y = y;
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		planet = new int[x][y];
		
		//positionObstacles(obstacles);
		
		

	}
	
	public String executeCommand(String command){
		
		char comand[] = command.toCharArray();
		Integer move[]={0};
		String result = "";
		
		for(int i = 0; i< comand.length; i++)
			move = commandMove(comand[i]);
		result = result.concat("(");
		result = result.concat(move[0].toString());
		result = result.concat(",");
		result = result.concat(move[1].toString());
		result = result.concat(")");
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		
		return null;
	}
	
	public void positionObstacles(String obstacles){
		
		
		
	}
	
	
	public Integer[] commandMove(char c){
		Integer[] cordFin = {0};
		if (c=='i')
			cordFin[0]=-1;
			if (cordFin[0]<0)
			cordFin[0]=this.x;
		if (c=='r')
			cordFin[0]=+1;
			if (cordFin[0]>this.x)
			cordFin[0]=0;	
		if (c=='f')
			cordFin[1]=+1;
			if (cordFin[1]>this.y)
			cordFin[1]=0;
		if (c=='b')
			cordFin[1]=-1;
			if (cordFin[1]<0)
			cordFin[1]=this.y;	
		
		return cordFin;
			
	}
}

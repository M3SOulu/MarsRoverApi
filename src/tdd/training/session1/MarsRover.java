package tdd.training.session1;

import java.util.Arrays;

import javax.management.monitor.StringMonitor;


public class MarsRover {
	int planet[];
	
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
		planet = new int[2];
		planet[0]=x;
		planet[1]=y;
		
		//positionObstacles(obstacles);
		
		

	}
	
	public String executeCommand(String command){
		
		char comand[] = command.toCharArray();
		Integer[] move={0,0};
		String result = "";
		
		for(int i = 0; i<comand.length; i++)
		{
			commandMove(comand[i], move);
			}
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
		
		
		return result;
	}
	
	public void positionObstacles(String obstacles){
		
		
		
	}
	
	
	public void commandMove(char c, Integer[] pos){
		
		if (c=='l')
			pos[0]=-1;
			if (pos[0]<0)
				pos[0]=this.x;
		if (c=='r')
			pos[0]=+1;
			if (pos[0]>this.x)
				pos[0]=0;	
		if (c=='f'){
			pos[1]=+1;}
			if (pos[1]>this.y)
			{pos[1]=0;}
		if (c=='b')
			pos[1]=-1;
			if (pos[1]<0)
				pos[1]=this.y;	
		
		
			
	}
}

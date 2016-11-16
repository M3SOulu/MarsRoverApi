
package tdd.training.session1;
import java.util.regex.*;
import java.util.ArrayList;

public class MarsRover {
	
	private int x;
	private int y;
	private String obstacles;
	private char facing;
	
	public ArrayList<Integer> extractingNumbers (String obstacles) {
		
		ArrayList<Integer> num = new ArrayList<Integer>();
		Pattern p = Pattern.compile(obstacles);
		Matcher m = p.matcher(obstacles);
		
		while(m.find()){
			num.add(Integer.parseInt(m.group()));
		}
		
		if(num.size()<=0){
			num.add(-1);
		}
		return num;
		
		
	}
	
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		this.x=x;
		this.y=y;
		this.obstacles=obstacles;
		
		int mappa[][];
		mappa= new int[this.x][this.y];
		ArrayList<Integer> numbers;
		numbers=extractingNumbers(obstacles);
		int i,j;
				

		for (i=0;i<x;i++){
			for (j=0;j<x;j++){
			mappa[i][j]=0;
			}
		}
		int size;
		size=numbers.size();
		
		for(i=0;i<size;i+=2){
			mappa[i][i+1]=1;
		}
		
	}
	
	public String executeCommand(String command){
		
		char face=this.facing;
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		int i;
		int len;
		len=command.length();
		face='N';
		int maps[][];
		maps= new int[this.x][this.y];
		int [] pos={0,0};
		for(i=0;i<len;i++){
			char letter=command.charAt(i);
			if(i==0){
				if((letter=='b')||(letter=='l')){
					pos[0]=0;
					pos[1]=0;
				break;
				}
			}
			if(face=='N'){
				if(letter=='f'){
					pos[1]=pos[1]+1;
				}
				if(letter=='b'){
					pos[1]=pos[1]-1;
					face='S';
				}
				if(letter=='l'){
					face='O';
				}
				if(letter=='r'){
					face='E';
				}
			}
			if(face=='S'){
				if(letter=='f'){
					pos[1]=pos[1]-1;
				}
				if(letter=='b'){
					pos[1]=pos[1]+1;
					face='N';
				}
				if(letter=='l'){
					face='E';
				}
				if(letter=='r'){
					face='O';
				}
			}
			if(face=='E'){
				if(letter=='f'){
					pos[0]=pos[0]+1;
				}
				if(letter=='b'){
					pos[0]=pos[0]-1;
					face='O';
				}
				if(letter=='l'){
					face='N';
				}
				if(letter=='r'){
					face='S';
				}
			}
			if(face=='O'){
				if(letter=='f'){
					pos[0]=pos[0]-1;
				}
				if(letter=='b'){
					pos[0]=pos[0]+1;
					face='E';
				}
				if(letter=='l'){
					face='S';
				}
				if(letter=='r'){
					face='N';
				}
			}
			
		}
		
		String position;
		String posx,posy;
		posx=String.valueOf(pos[0]).toString();
		posy=String.valueOf(pos[1]).toString();
		position='('+posx+','+posy+','+face+')';
		return position;
	}
}

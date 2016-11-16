package tdd.training.session1;

import tdd.training.session1.Rover;

public class MarsRover {
	
	static int x;
	static int y;
	String obstacles;
	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
		
	}
	
	MarsRover rover = new MarsRover(x,y,obstacles);
	Rover Car= new Rover();
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The rover is on a 100x100 grid at location (0, 0) and facing NORTH. The rover is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)?  
		 * Where x and y are the final coordinates, facing is the current direction the rover is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		for(int i=0; i<command.length(); i++){
			char a = command.charAt(i);
			if(a == 'f'){
				Forward();
			}
			if(a == 'b'){
				Backward();		
			}
			if(a == 'l'){
				Left();		
			}
			if(a == 'r'){
				Right();		
			}
		}

		return null;
	}
	

	public Rover Forward(){
		if(Car.y<=MarsRover.y && Car.facing=="N"){
			Car.y++;
		}else if(Car.facing=="S" || Car.facing=="E" || Car.facing=="W"){
			Car.facing="N";
		}
		return Car; //torna lo stato del veicolo dopo forward (x,y,facing)
	}
	public Rover Backward(){
		if(Car.y>0 && Car.facing=="S"){
			Car.y++;
		}else if(Car.facing=="N"|| Car.facing=="E" || Car.facing=="W"){
			Car.facing="S";
		}
		return Car; //torna lo stato del veicolo dopo backward (x,y,facing)
	}
	public Rover Left(){
		if(Car.facing=="N" || Car.facing=="S" || Car.facing=="E"){
			Car.facing="W";
		}else if(Car.x>0 && Car.facing=="W"){
			Car.x--;
		}
		return Car; //torna lo stato del veicolo dopo left (x,y,facing)
	}
	public Rover Right(){
		if(Car.facing=="N" || Car.facing=="S" || Car.facing=="W"){
			Car.facing="W";
		}else if(Car.x<MarsRover.x && Car.facing=="E"){
			Car.x++;
		}
		return Car; //torna lo stato del veicolo dopo right (x,y,facing)
	}
}


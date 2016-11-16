package tdd.training.session1;


import java.util.Arrays;
import java.util.List;

public class MarsRover {
	
	private static final int nObstacle = 10;
	private static final List<String> movement = Arrays.asList("f","b","r","l");
	private static final List<String> cardinalPosition = Arrays.asList("N","E","S","W");
	private static int gridX;
	private static int gridY;
	private int coordX;
	private int coordY;
	private int direction;
	private Obstacle[] obstacles = new Obstacle[nObstacle];
	
	public MarsRover(){
		coordX = 0;
		coordY = 0;
		direction = 0;
	}
	
	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(int coordX) {
		this.coordX = coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(int coordY) {
		this.coordY = coordY;
	}

	public String getRealDirection() {
		return cardinalPosition.get(direction);
	}


	public MarsRover(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no white spaces. 
	 *  
		Example use:
		MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		gridX = x;
		gridY = y;
		
		for(int i = 0; i < this.obstacles.length; i++){
			this.obstacles[i] = new Obstacle();
		}
		
		for(int j = 0; j < obstacles.length(); j++){
			int i = 0;
			if(obstacles.charAt(j) == ','){
				j++;
				this.obstacles[i].setCoordY(obstacles.charAt(j));
			}
			if(!(obstacles.charAt(j) == '?'||obstacles.charAt(j) == '('||obstacles.charAt(j) == ')')){
				
			}
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
		
		String whereIAm = "?(";
		
		for(int i = 0; i < command.length(); i++){
			if(command.charAt(i) == 'f'){
				if(this.getRealDirection() == "N"){
					coordY += 1;
				}else if(this.getRealDirection() == "E"){
					coordX += 1;
				}else if(this.getRealDirection() == "S"){
					coordY += -1;
				}else if(this.getRealDirection() == "W"){
					coordX += -1;
				}
			}else if(command.charAt(i) == 'b'){
				if(this.getRealDirection() == "N"){
					coordY += -1;
				}else if(this.getRealDirection() == "E"){
					coordX += -1;
				}else if(this.getRealDirection() == "S"){
					coordY += 1;
				}else if(this.getRealDirection() == "W"){
					coordX += 1;
				}
			}else if(command.charAt(i) == 'r'){
				if((direction > 3)){
					direction = direction - 3;
				}else{
					if(this.getRealDirection() == "N"){
						direction += 1;
					}else if(this.getRealDirection() == "E"){
						direction += 1;
					}else if(this.getRealDirection() == "S"){
						direction += 1;
					}else if(this.getRealDirection() == "W"){
						direction += 1;
					}
				}
			}else if(command.charAt(i) == 'l'){
				if((direction < 0)){
					direction = direction + 3;
				}else{
					if(this.getRealDirection() == "N"){
						direction += -1;
					}else if(this.getRealDirection() == "E"){
						direction += -1;
					}else if(this.getRealDirection() == "S"){
						direction += -1;
					}else if(this.getRealDirection() == "W"){
						direction += -1;
					}
				}
			}
		}
		whereIAm += coordX + "," + coordY + "," + this.getRealDirection() + ")";
		
		return null;
	}
}

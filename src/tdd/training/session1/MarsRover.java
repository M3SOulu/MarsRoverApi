package tdd.training.session1;

public class MarsRover {
	private int[][] grid;
	private char actualFace;
	private int actualPositionX;
	private int actualPositionY;
	private int maxX;
	private int maxY;
	private final static char N = 'N';
	private final static char S = 'S';
	private final static char E = 'E';
	private final static char W = 'W';

	public MarsRover(int x, int y, String obstacles) {
		/*
		 * x and y represent the size of the grid. Obstacles is a String
		 * formatted as follows: ?(o1_x,o1_y)(o2_x,o2_y)...(on_x,on_y)? with no
		 * white spaces.
		 * 
		 * Example use: MarsRover rover = new MarsRover(100,100,"?(5,5)(7,8)?")
		 * //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		 */

		grid = new int[x][y];
		actualPositionX = 0;
		actualPositionX = 0;
		grid[actualPositionX][actualPositionY] = 1;
		actualFace = N;
		maxX = x - 1;
		maxY = y - 1;
		if(obstacles != null){
		setObstacles(obstacles);
		}

	}

	public String executeCommand(String command) {

		/*
		 * The command string is composed of "f" (forward), "b" (backward), "l"
		 * (left) and "r" (right) Example: The rover is on a 100x100 grid at
		 * location (0, 0) and facing NORTH. The rover is given the commands
		 * "ffrff" and should end up at (2, 2) facing East.
		 * 
		 * The return string is in the format:
		 * ?(x,y,facing)(o1_x,o1_y)(o2_x,o2_y)?..(on_x,on_y)? Where x and y are
		 * the final coordinates, facing is the current direction the rover is
		 * pointing to (N,S,W,E). The return string should also contain a list
		 * of coordinates of the encountered obstacles. No white spaces.
		 */
		String obstacoles = "";
		char commandA[] = command.toCharArray();
		for (char c : commandA) {
			if (c == 'l') {
				if (actualFace == N) {
					actualFace = S;
				} else if (actualFace == S) {
					actualFace = N;
				} else if (actualFace == E) {
					actualFace = W;
				} else if (actualFace == W) {
					actualFace = E;
				}

			} else if (c == 'r') {
				if (actualFace == N) {
					actualFace = E;
				} else if (actualFace == E) {
					actualFace = S;
				} else if (actualFace == S) {
					actualFace = W;
				} else if (actualFace == W) {
					actualFace = N;
				}
			} else if (c == 'f') {
				
				if (actualFace == N) {
					if(!checkOstacoles(actualPositionX, 0)){
						
					}else if (actualPositionY + 1 > maxY && !checkOstacoles(actualPositionX, 0)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY = 0;
						grid[actualPositionX][actualPositionY] = -1;
					
					} else if(!checkOstacoles(actualPositionX, actualPositionY+1)){
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY++;
						grid[actualPositionX][actualPositionY] = -1;
					}
				} else if (actualFace == S ) {
					
					if (actualPositionY - 1 < 0 && !checkOstacoles(actualPositionX, maxY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY = maxY;
						grid[actualPositionX][actualPositionY] = -1;
					
					} else if(!checkOstacoles(actualPositionX, actualPositionY-1)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY--;
						grid[actualPositionX][actualPositionY] = -1;
					}
				} else if (actualFace == E) {
					if (actualPositionX + 1 > maxX && !checkOstacoles(0, actualPositionY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX = 0;
						grid[actualPositionX][actualPositionY] = -1;

					} else if(!checkOstacoles(actualPositionX + 1, actualPositionY)){
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX++;
						grid[actualPositionX][actualPositionY] = -1;
					}
				} else if (actualFace == W) {
					
					if (actualPositionX - 1 < 0 && !checkOstacoles(maxX, actualPositionY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX = maxX;
						grid[actualPositionX][actualPositionY] = -1;
					
					} else if(!checkOstacoles(actualPositionX - 1, actualPositionY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX--;
						grid[actualPositionX][actualPositionY] = -1;
					}
				}

			} else if (c == 'b') {
				if (actualFace == N) {
					if (actualPositionY - 1 < 0 && !checkOstacoles(actualPositionX, maxY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY = maxY;
						grid[actualPositionX][actualPositionY] = -1;
					} else if(!checkOstacoles(actualPositionX, actualPositionY-1)){
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY--;
						grid[actualPositionX][actualPositionY] = -1;
					}
				} else if (actualFace == S) {
					if (actualPositionY + 1 > maxY && !checkOstacoles(actualPositionX, 0)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY = 0;
						grid[actualPositionX][actualPositionY] = -1;
					} else if(!checkOstacoles(actualPositionX, actualPositionY +1)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionY++;
						grid[actualPositionX][actualPositionY] = -1;
					}

				} else if (actualFace == E) {
					if (actualPositionX -1 < 0 && !checkOstacoles(maxX, actualPositionY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX = maxX;
						grid[actualPositionX][actualPositionY] = -1;

					} else if(!checkOstacoles(actualPositionX -1, actualPositionY)){
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX--;
						grid[actualPositionX][actualPositionY] = -1;
					}
				} else if (actualFace == W) {
					if (actualPositionX + 1 > maxX && !checkOstacoles(0, actualPositionY)) {
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX = 0;
						grid[actualPositionX][actualPositionY] = -1;
					} else if(!checkOstacoles(actualPositionX +1 ,actualPositionY )){
						grid[actualPositionX][actualPositionY] = 0;
						actualPositionX++;
						grid[actualPositionX][actualPositionY] = -1;
					}
				}
			}
		}
//
		//		if(checkOstacoles(actualPositionX , 0)){
//			obstacoles = "(" + actualPositionX + "," + "0" + ")";
//		}else if(checkOstacoles(actualPositionX, (actualPositionY+1))){
//			obstacoles = "(" + actualPositionX + "," + (actualPositionY+1) + ")";
//		}else if(checkOstacoles(actualPositionX, maxY)){
//			obstacoles = "(" + actualPositionX + "," + maxY + ")";
//		}else if(checkOstacoles(actualPositionX, actualPositionY-1)){
//			obstacoles = "(" + actualPositionX + "," + (actualPositionY-1) + ")";
//		}else if(checkOstacoles(0, actualPositionY)){
//			obstacoles = "(" + 0 + "," + actualPositionY + ")";
//		}else if(checkOstacoles(actualPositionX+1, actualPositionY)){
//			obstacoles = "(" + (actualPositionX+1) + "," + actualPositionY + ")";
//		}else if(checkOstacoles(maxX, actualPositionY)){
//			obstacoles = "(" + maxX + "," + actualPositionY + ")";
//		}else if(checkOstacoles(actualPositionX-1, actualPositionY)){
//			obstacoles = "(" + (actualPositionX-1) + "," + actualPositionY + ")";
//		}
//		if(obstacoles.isEmpty()){
//			return "(" + actualPositionX + "," + actualPositionY + "," + actualFace + ")";
//		}else{
//			return "(" + actualPositionX + "," + actualPositionY + "," + actualFace + ")" + obstacoles;
//		}
		return "(" + actualPositionX + "," + actualPositionY + "," + actualFace + ")";
	}

	private void setObstacles(String obstacles) {

		char[] obstaclesA = obstacles.toCharArray();
		for (int i = 0; i < obstacles.length(); i++) {
			if (obstaclesA[i] == '(') {
				
				int x = Integer.valueOf(String.valueOf(obstaclesA[i + 1]));
				int y = Integer.valueOf(String.valueOf(obstaclesA[i + 3]));

				grid[x][y] = -1;

			}
		}

	}
	
	private boolean checkOstacoles(int x, int y){
		if(grid[x][y] == -1){
			return true;
		}else{
			return false;
		}
	}

	public int[][] getGrid() {
		return grid;

	}
}

package tdd.training.session1;

public class Position {
	int x = 0;
	int y = 0;
	
	public Position(){
		this(0, 0);
	}
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void moveForward(String dir){
		int distance = 1;
		if (dir.equals("N")){
			y += distance;
		}
		if (dir.equals("S")){
			y -= distance;
		}
		if (dir.equals("E")){
			x += distance;
		}
		if (dir.equals("W")){
			x -= distance;
		}
	}
	
	public void moveBackwards(String dir){
		int distance = -1;
		if (dir.equals("N")){
			y += distance;
		}
		if (dir.equals("S")){
			y -= distance;
		}
		if (dir.equals("E")){
			x += distance;
		}
		if (dir.equals("W")){
			x -= distance;
		}
	}
}

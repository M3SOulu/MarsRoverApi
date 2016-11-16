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
		if (dir.equals("N")){
			y += 1;
		}
		if (dir.equals("S")){
			y -= 1;
		}
		if (dir.equals("E")){
			x += 1;
		}
		if (dir.equals("W")){
			x -= 1;
		}
	}
}

package tdd.training.session1;

public class Rover {

	private int xRover;
	private int yRover;
	private char facing;
	
	public Rover(int xRover,int YRover,char facing){
		this.xRover=xRover;
		this.yRover=yRover;
		this.facing=facing;
	}
	
	public void SetPosition(int x, int y){
		xRover=x;
		yRover=y;
	}
}

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
	
	public char getFacing(){
		return facing;
	}
	public int getXRover(){
		return xRover;
	}
	public int getYRover(){
		return yRover;
	}
	
	@Override
	public String toString(){
		return "("+xRover+","+yRover+","+facing+")";
	}
	
	public void setFacing(char facing){
		this.facing=facing;
	}
	
}

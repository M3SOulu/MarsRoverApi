package tdd.training.session1;

public class Obstacle {

	private int x;
	private int y;
	
	private String name;
	
	Obstacle(int x, int y,String name){
		this.x=x;
		this.y=y;
		this.name=name;
	}
	
	@Override
	public String toString(){
		return name;
	}
	
	
}

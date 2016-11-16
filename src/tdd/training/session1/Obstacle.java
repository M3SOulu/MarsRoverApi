package tdd.training.session1;

public class Obstacle {

	private int x;
	private int y;
	
	private String name="Obstacle";
	
	Obstacle(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	@Override
	public String ToString(){
		return name;
	}
	
}

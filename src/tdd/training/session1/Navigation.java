package tdd.training.session1;

public class Navigation {
	private int x;
	private int y;
	private Obstacle ob;
	
	public Navigation(int x, int y, String obstacles){
		this.x = x;
		this.y = y;
		ob = new Obstacle(obstacles);
	}

}

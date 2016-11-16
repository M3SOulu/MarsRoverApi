package tdd.training.session1;

public class Obstacle extends Coordinates {

	public Obstacle(int x_coordinate, int y_coordinate) {
		super(x_coordinate, y_coordinate);
		
	}

	public String getObstacle(Obstacle ob){
		return this.getCoordinates().toString();
	}
	
	
}

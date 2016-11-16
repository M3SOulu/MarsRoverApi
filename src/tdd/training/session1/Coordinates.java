package tdd.training.session1;

public class Coordinates {

	public Coordinates(int x_coordinate, int y_coordinate) {
		
		this.x_coordinate = x_coordinate;
		this.y_coordinate = y_coordinate;
	}
	/**
	 * @return the x_coordinate
	 */
	public int getX_coordinate() {
		return x_coordinate;
	}
	/**
	 * @param x_coordinate the x_coordinate to set
	 */
	public void setX_coordinate(int x_coordinate) {
		this.x_coordinate = x_coordinate;
	}
	/**
	 * @return the y_coordinate
	 */
	public int getY_coordinate() {
		return y_coordinate;
	}
	/**
	 * @param y_coordinate the y_coordinate to set
	 */
	public void setY_coordinate(int y_coordinate) {
		this.y_coordinate = y_coordinate;
	}
	
	int x_coordinate;
	int y_coordinate;
	Coordinates coordinates;
	/**
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}
	public Coordinates getCoordinates(){
		return new Coordinates(getX_coordinate(), getY_coordinate());
	}
	public 	boolean moveForward() {
	coordinates.x_coordinate++;
	return true;
	}
	public boolean moveBackward() {
		coordinates.x_coordinate--;
		return true;
	}
	public void watchLeft() {
		
	}
	public void watchRight() {
		
	}

//	public Coordinates setCoordinates(int x, int y){
//		
//	}
}


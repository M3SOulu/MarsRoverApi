package tdd.training.session1;

public class Obstacle {
	
	private int coordX;
	private int coordY;
	
	public Obstacle(){
		coordX = -1;
		coordY = -1;
	}

	public int getCoordX() {
		return coordX;
	}

	public void setCoordX(Character coordX) {
		this.coordX = coordX.hashCode();
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(Character coordY) {
		this.coordY = coordY.hashCode();
	}
	
	

}

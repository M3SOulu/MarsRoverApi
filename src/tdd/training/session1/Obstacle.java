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

	public void setCoordX(char coordX) {
		this.coordX = (int)coordX;
	}

	public int getCoordY() {
		return coordY;
	}

	public void setCoordY(char coordY) {
		this.coordY = (int)coordY;
	}
	
	

}

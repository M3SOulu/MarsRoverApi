package tdd.training.session1;

public enum Direction {
	NORTH('N'),
	SOUTH('S'),
	WEST('W'),
	EAST('E');
	
	
	private char direction;
	
	private Direction(char direction){
		this.direction = direction;
	}
	
	public char getValue(){
		return direction;
	}
}

package tdd.training.session1;

public class Position {
	int x = 0;
	int y = 0;
	
	public Position(){
		this(0, 0);
	}
	
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString(){
		String str = "(" + x + "," + y + ")";
		return str;
	}
}

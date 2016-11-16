package tdd.training.session1;

/**
 *  obstacle of a planet
 */
  public class Obstacle {
 
	  private int x;
	  private int y;
	  
	  public Obstacle(int x, int y){
		  
		  this.x=x;
		  this.y=y;
				  
	  }
	  
	  @Override
	  public String toString(){
		  
		  return new String("("+x+","+y+")");
	  }
	  
}

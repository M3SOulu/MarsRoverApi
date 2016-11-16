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
	  
	  public Obstacle(String coords){
		  
		  coords=coords.replace("(", "");
		 this.x=Integer.parseInt(coords.split(",")[0]);
		 this.y=Integer.parseInt(coords.split(",")[1]);
	  }
	  
	  @Override
	  public String toString(){
		  	  
		  
		  return new String("("+x+","+y+")");
	  }
	  
	  @Override
	  public boolean equals(){
		  
		  
	  }
	  
}

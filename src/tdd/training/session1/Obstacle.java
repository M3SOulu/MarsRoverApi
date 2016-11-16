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
	  
	  public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
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
	  
	 
	  public boolean equals(Obstacle ob){
		  
		  boolean result=false;
		  
		  if(this.x==ob.getX() && this.y==ob.getY()){
			  
			  result=true;
		  }
		  
		  return result;
	  }
	  
}

package tdd.training.session1;

import java.util.ArrayList;

public class Navigation {
	private int x;
	private int y;
	private int currentX;
	private int currentY;
	private static ArrayList<Obstacle> obstacles;
	
	public Navigation(int x ,int y){
		this.x = x;
		this.y = y;
	}
	
	public Navigation(int x, int y, String obstaclesList){
		this.x = x;
		this.y = y;
		this.obstacles = new ArrayList<Obstacle>();
		generaOstacoli(obstaclesList);
	}

	static void generaOstacoli(String ob){
		String currentObstacle = "";
		int x = 0; 
		int y = 0;
		
		for (int i = 0; i < ob.length() ; i++){
			
			if(ob.charAt(i) != '?' && ob.charAt(i) != '('){
				
				if(ob.charAt(i) != ','){
					
					if(ob.charAt(i) == ')'){					
						y = Integer.parseInt(currentObstacle);
						obstacles.add(new Obstacle(x,y));					
						currentObstacle = "";
						x=0;
						y=0;
					}else{
						x =Integer.parseInt(currentObstacle);
						currentObstacle = "";
					}
					
				}
				else{
					currentObstacle += ob.charAt(i);
				}
			}
		}
	}
	
	public int getNumberOfObstacles(){
		return obstacles.size();
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

	public int getCurrentX() {
		return currentX;
	}

	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}

	public int getCurrentY() {
		return currentY;
	}

	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public String esitoNavigazione(String command) {
		
		for(char c : command.toCharArray()){
			
			
		}
		return null;
	}
	

}

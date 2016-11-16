package tdd.training.session1;

import java.util.ArrayList;

public class Navigation {
	private int x;
	private int y;
	private static ArrayList<Obstacle> obstacles;
	
	public Navigation(int x, int y, String obstacles){
		this.x = x;
		this.y = y;
		this.obstacles = new ArrayList<Obstacle>();
		generaOstacoli(obstacles);
	}

	static void generaOstacoli(String ob){
		String currentXObstacle = "";
		String currentYObstacle = "";
		
		for (int i = 0; i < ob.length() ; i++){
			
			if(ob.charAt(i) != '?' && ob.charAt(i) != '('){
				
				if(ob.charAt(i) == ')' && ob.charAt(i) != ','){
					obstacles.add(new Obstacle(Integer.parseInt(currentXObstacle),Integer.parseInt(currentYObstacle));					
					currentObstacle = "";
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
}

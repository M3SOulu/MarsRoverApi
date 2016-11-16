package tdd.training.session1;

import java.util.ArrayList;

public class Navigation {
	private int x;
	private int y;
	private static ArrayList<Obstacle> obstacles;
	
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
}

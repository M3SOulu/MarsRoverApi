package tdd.training.session1;

import java.util.ArrayList;

public class Navigation {
	private int x;
	private int y;
	private static ArrayList<Integer> obstacles;
	
	public Navigation(int x, int y, String obstacles){
		this.x = x;
		this.y = y;
		this.obstacles = new ArrayList<Integer>();
		generaOstacoli(obstacles);
	}

	static void generaOstacoli(String ob){
		Integer currentObstacle = 0;
		
		for (int i = 0; i < ob.length() ; i++){
			
			if(ob.charAt(i) != '?' && ob.charAt(i) != '(' && ob.charAt(i) != ','){
				
				if(ob.charAt(i) == ')'){
					System.out.println(currentObstacle);
					obstacles.add(currentObstacle);					
					currentObstacle = 0;
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

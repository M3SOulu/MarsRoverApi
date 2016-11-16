package tdd.training.session1;

import java.util.ArrayList;

public class Navigation {
	private int x;
	private int y;
	private static ArrayList<String> obstacles;
	
	public Navigation(int x, int y, String obstacles){
		this.x = x;
		this.y = y;
		generaOstacoli(obstacles);
	}

	static void generaOstacoli(String ob){
		String currentObstacle = "";
		
		for (int i = 0; i < ob.length() ; i++){
			if(ob.charAt(i) != '?' && ob.charAt(i) != '(' && ob.charAt(i) != ',')
				if(ob.charAt(i) == ')'){
					obstacles.add(currentObstacle);
					System.out.println("Ciao");
					currentObstacle = "";
				}
				else
					currentObstacle += ob.charAt(i);	
		}
	}
	
	public int getNumberOfObstacles(){
		return obstacles.size();
	}
}

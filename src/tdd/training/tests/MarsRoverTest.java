package tdd.training.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import tdd.training.session1.MarsRover;
import tdd.training.session1.Obstacle;

public class MarsRoverTest {
	
	private MarsRover rover;
	private String obstacles="(1,3)(4,8)";
	
	@Before
	public void setUp(){
		
		rover= new MarsRover(10,10, obstacles);
		
	}
	
	@Test
	public void ObstacleTest() {
		Obstacle ob1= new Obstacle(1,2);
		Obstacle ob2= new Obstacle("1,2");
		
		Assert.assertEquals(ob1.toString(),"(1,2)" );
		Assert.assertTrue(ob1.equals(ob2));
	}
	
	
	@Test
	public void testMakeObstacles() {
		
		ArrayList<Obstacle> obsList= MarsRover.makeObstacles(obstacles);
				
		Assert.assertTrue(obsList.get(0).equals(new Obstacle(1,3)));
		Assert.assertTrue(obsList.get(1).equals(new Obstacle(4,8)));
		
	}
	
	@Test
	public void testCheckObstacles() {
		
		ArrayList<Obstacle> obsList= MarsRover.makeObstacles(obstacles);
				
		Assert.assertTrue(rover.checkObstacle(1, 3));
		Assert.assertFalse(rover.checkObstacle(1,2));
		
	}
	
	@Test
	public void testIsValidCommand(){
		
		//right command
		String cmd="ffrlfb";	
		Assert.assertTrue(rover.isValidCommand(cmd));
		
		//one char wrong
		cmd+="k";
		Assert.assertFalse(rover.isValidCommand(cmd));
		
		//all command wrong
		cmd= new String("kkqkw1238");
		Assert.assertFalse(rover.isValidCommand(cmd));
	}
	
	@Test
	public void testChangeFace(){
		
		rover.changeFace('r');
		
		Assert.assertEquals(rover.getFace(),'E');
		
		rover.changeFace('r');
		rover.changeFace('r');
		rover.changeFace('r');
		
		Assert.assertEquals(rover.getFace(),'N');
		
	}
	
	@Test
	public void  testMove(){
		
		rover.setFace('N');
		rover.move('f');
		
		Assert.assertEquals(rover.getX(),0);
		Assert.assertEquals(rover.getY(),1);
		
		rover.move('f');
		Assert.assertEquals(rover.getX(),0);
		Assert.assertEquals(rover.getY(),2);
		
		rover.setFace('E');
		rover.move('f');
		Assert.assertEquals(rover.getX(),1);
		Assert.assertEquals(rover.getY(),2);
	}

}

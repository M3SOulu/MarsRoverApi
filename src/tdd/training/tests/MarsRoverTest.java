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
	
	@Before
	public void setUp(){
		//TODO
		
	}
	
	@Test
	public void ObstacleTest() {
		Obstacle ob1= new Obstacle(1,2);
		Obstacle ob2= new Obstacle("1,2");
		
		Assert.assertEquals(ob1.toString(),"(1,2)" );
		Assert.assertTrue(ob1.equals(ob2));
	}
	
	
	@Test
	public void TestMakeObstacles() {
		
		String obstacles="(1,3)(4,8)";
		ArrayList<Obstacle> obsList= MarsRover.makeObstacles(obstacles);
		
		
		Assert.assertEquals(obsList.get(0),new Obstacle(1,3));
		
	}

}

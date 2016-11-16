package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import tdd.training.session1.Obstacle;

public class MarsRoverTest {
	
	
	
	@Test
	public void ObstacleTest() {
		Obstacle ob1= new Obstacle(1,2);
		Obstacle ob2= new Obstacle("(1,2)");
		
		Assert.assertEquals(ob1.toString(),"(1,2)" );
		Assert.assertTrue(ob1.equals(ob2));
	}

}

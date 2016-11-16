package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.Direction;
import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {

	private MarsRover marsRover;
	
	@Before
	public void setUp() throws MarsRoverException{
		marsRover = new MarsRover(10, 10, "");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerifyObstacles(){
		assertTrue(marsRover.verifyObstacles("(0,0)"));
		assertTrue(marsRover.verifyObstacles("(0,0)(1,1)"));
		assertFalse(marsRover.verifyObstacles(""));
		assertFalse(marsRover.verifyObstacles("a"));
	}
	
	
	@Test
	public void testVerifyCommand(){	
		assertTrue(marsRover.verifyCommand("l"));
		assertTrue(marsRover.verifyCommand("r"));
		assertTrue(marsRover.verifyCommand("f"));
		assertTrue(marsRover.verifyCommand("b"));
		assertTrue(marsRover.verifyCommand("lrfb"));
		assertFalse(marsRover.verifyCommand(""));
		assertFalse(marsRover.verifyCommand("a"));
	}
	
	@Test
	public void testVerifyObstaclesRange(){
		assertTrue(marsRover.verifyObstaclesRange(1, 1));
		assertTrue(marsRover.verifyObstaclesRange(2, 1));
		assertTrue(marsRover.verifyObstaclesRange(1, 2));
		assertTrue(marsRover.verifyObstaclesRange(2, 2));
		assertTrue(marsRover.verifyObstaclesRange(9, 9));
		assertTrue(marsRover.verifyObstaclesRange(8, 9));
		assertTrue(marsRover.verifyObstaclesRange(9, 8));
		assertTrue(marsRover.verifyObstaclesRange(8, 8));
		
		assertFalse(marsRover.verifyObstaclesRange(0, 0));
		assertFalse(marsRover.verifyObstaclesRange(0, 1));
		assertFalse(marsRover.verifyObstaclesRange(1, 0));
		assertFalse(marsRover.verifyObstaclesRange(10, 10));
		assertFalse(marsRover.verifyObstaclesRange(10, 9));
		assertFalse(marsRover.verifyObstaclesRange(9, 10));
	}
	
	@Test(expected = MarsRoverException.class)
	public void testSetObstacles_ThrowException() throws MarsRoverException{
		marsRover.setObstacles("(10,10)");
	}
	
	@Test
	public void testMoveRight(){	
		marsRover.moveRight();	
		assertEquals(Direction.EAST, marsRover.getDirection());
		marsRover.moveRight();	
		assertEquals(Direction.SOUTH, marsRover.getDirection());
		marsRover.moveRight();	
		assertEquals(Direction.WEST, marsRover.getDirection());
		marsRover.moveRight();	
		assertEquals(Direction.NORTH, marsRover.getDirection());

	}
	
	@Test
	public void testMoveLeft(){	
		marsRover.moveLeft();
		assertEquals(Direction.WEST, marsRover.getDirection());
		marsRover.moveLeft();
		assertEquals(Direction.SOUTH, marsRover.getDirection());
		marsRover.moveLeft();
		assertEquals(Direction.EAST, marsRover.getDirection());
		marsRover.moveLeft();
		assertEquals(Direction.NORTH, marsRover.getDirection());
	}
	
	@Test
	public void testMoveForwardFromStart(){
		marsRover.moveForward();
		assertEquals(0, marsRover.getCurrentX());
		assertEquals(1, marsRover.getCurrentY());
	}
	
	@Test
	public void testMoveForwardRight(){
		marsRover.moveRight();	
		marsRover.moveForward();
		assertEquals(1, marsRover.getCurrentX());
		assertEquals(0, marsRover.getCurrentY());
	}
	
	@Test
	public void testMoveForwardLeft(){
		marsRover.moveLeft();	
		marsRover.moveForward();
		assertEquals(9, marsRover.getCurrentX());
		assertEquals(0, marsRover.getCurrentY());
	}
}

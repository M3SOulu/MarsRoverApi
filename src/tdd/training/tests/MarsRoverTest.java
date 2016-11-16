package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {

	private MarsRover marsRover;
	
	@Before
	public void setUp() throws MarsRoverException{
		marsRover = new MarsRover(3, 3, "");
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
	
}

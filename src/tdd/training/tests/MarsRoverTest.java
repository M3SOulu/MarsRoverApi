package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	private MarsRover marsRover;
	
	@Before
	public void setUp(){
		marsRover = new MarsRover(3, 3, "");
	}
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testVerifyCommand(){
		assertFalse(marsRover.verifyCommand(""));
		
		assertTrue(marsRover.verifyCommand("l"));
		assertTrue(marsRover.verifyCommand("r"));
		assertTrue(marsRover.verifyCommand("f"));
		assertTrue(marsRover.verifyCommand("b"));
		assertTrue(marsRover.verifyCommand("lrfb"));
	}
	
}

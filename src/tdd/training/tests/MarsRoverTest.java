package tdd.training.tests;

import static org.junit.Assert.*;

import java.util.regex.PatternSyntaxException;

import tdd.training.session1.*;
//import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {
	
	/*@Before
	public void setUp() throws MarsRoverException {
		
	}*/
	
	@Test(expected = MarsRoverException.class)
	public void testMarsRoverWrongClassCreation() throws MarsRoverException {
		MarsRover rover = new MarsRover(50, 50, "(10,10)(");
	}
	
	@Test
	public void testMarsRoverCorrectClassCreation() throws MarsRoverException {
		MarsRover rover = new MarsRover(50, 50, "(10,10)(5,5)");
	}
	
	@Test
	public void testMarsRoverMoveNoObstacle() throws MarsRoverException {
		MarsRover rover = new MarsRover(50, 50, "(10,10)(5,5)");
		String result = rover.executeCommand("fff");
		assertEquals("(0,3,N)", result);
	}
	
	@Test
	public void testMarsRoverMoveFindObstacle() throws MarsRoverException {
		MarsRover rover = new MarsRover(50, 50, "(10,10)(5,5)");
		String result = rover.executeCommand("fffffrfffff");
		assertEquals("(5,5,N)(5,5)", result);
	}

}

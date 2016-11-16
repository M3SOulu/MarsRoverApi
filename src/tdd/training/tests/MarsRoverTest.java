package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {

	
	MarsRover rover;
	
	@Before
	public void initialize(){
		MarsRover rover = new MarsRover(3, 3, "(2,2)");
	}
	
	
	@Test
	public void testExecuteCommand() throws MarsRoverException {
		rover.setRoverFacing('W');
		String test = rover.executeCommand("ffff");
		assertEquals(test,"(0,0,W)");
		
	}

}

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
		MarsRover rover = new MarsRover(3, 3, "(0,2)");
		rover.setRoverFacing('W');
		String test = rover.executeCommand("ffff");
		assertTrue(test.equals("(0,0,W)"));
		
		
		rover.setRoverFacing('N');
		test = rover.executeCommand("ff");
		assertTrue(test.equals("(0,1,N)(0,2)"));
		
		rover.setRoverFacing('E');
		test = rover.executeCommand("fff");
		assertTrue(test.equals("(2,0,E)"));
		
	}

}

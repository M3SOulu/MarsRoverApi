package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {

	MarsRover marsRover = new MarsRover(3,3,"");
	
	@Test(expected = MarsRoverException.class)
	public void executeCommand() throws MarsRoverException{
		assertEquals("(1,2,E)",marsRover.executeCommand("ffrf"));
		assertEquals("(1,2,E)",marsRover.executeCommand(""));
		//assertEquals("(1,1,E)",marsRover.executeCommand("frf"));
	}

	
}

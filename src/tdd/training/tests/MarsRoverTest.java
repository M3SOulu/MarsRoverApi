package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	MarsRover marsRover = new MarsRover(3,3,"");
	
	@Test
	public void executeCommand() {
		assertEquals("(1,2,E)",marsRover.executeCommand("ffrf"));
		//assertEquals("(1,1,E)",marsRover.executeCommand("frf"));
	}

	
}

package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	MarsRover marsRover = new MarsRover(5,5,"");
	
	@Test
	public void test() {
		assertEquals("(0,2,E)",marsRover.executeCommand("ffrfff"));
	}

	
}

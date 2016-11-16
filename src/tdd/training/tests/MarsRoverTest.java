package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	@Test
	public void test() {
		MarsRover mars = new MarsRover(3,3,"(1.0)(2.0)");
		assertEquals("(1,2)", mars.executeCommand("ffr"));
		
	}

}

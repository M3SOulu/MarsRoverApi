package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	private static final Integer N = 1;

	@Test
	public void test() {
		
		MarsRover rover = new MarsRover(0, 0, "");
		rover.setPosition(0, 0, N);
		rover.turnRight();
		rover.move();
		rover.toString();
		
		
		
	}

}

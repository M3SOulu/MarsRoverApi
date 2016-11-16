package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	@Test
	public void test() {
		MarsRover mrs = new MarsRover(5,5,"?(0,1)?");
		assertEquals(-1, mrs.getGrid()[0][1]);
	}

}

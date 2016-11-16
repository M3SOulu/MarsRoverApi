package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;

public class MarsRoverTest {

	@BeforeClass
	public void initialize(){
		MarsRover rover = new MarsRover(3, 3, "(2,2)");
	}
	
	
	@Test
	public void test() {
		fail("Not yet implemented");
	}

}

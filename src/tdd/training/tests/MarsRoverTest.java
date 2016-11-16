package tdd.training.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;
import tdd.training.session1.Rover;

public class MarsRoverTest {

	MarsRover rover;
	Rover d;
	
	@Before
	public void dichiaro(){
		rover = new MarsRover(100,100,"(33,40)");
		d = new Rover();
	}
	
	@Test
	public void test() throws MarsRoverException {
		Assert.assertEquals("(0,1)(0,2)(0,2)", rover.executeCommand("ffrr"));
		Assert.assertNotEquals("(0,1)(0,2)(0,2)", rover.executeCommand("f"));
	}
	
	@Test
	public void testRover() {
		Assert.assertEquals(0, d.getPos_x());
		Assert.assertNotEquals(1, d.getPos_x());
	}
	
	@After
	public void cancello(){
		rover = null;
		d = null;
	}

}

package tdd.training.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {

	MarsRover rover;
	
	@Before
	public void dichiaro(){
		rover = new MarsRover(100,100,"(3,0)");
	}
	
	@Test
	public void test() throws MarsRoverException {
		Assert.assertEquals("(0,1)(0,2)(0,2)", rover.executeCommand("ffrr"));
		Assert.assertNotEquals("(0,1)(0,2)(0,2)", rover.executeCommand("f"));
	}
	
	@After
	public void cancello(){
		rover = null;
	}

}

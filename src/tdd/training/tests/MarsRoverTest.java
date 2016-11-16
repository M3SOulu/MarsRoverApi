package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import tdd.training.session1.MarsRover;
import tdd.training.session1.MarsRoverException;

public class MarsRoverTest {
//Act
	MarsRover marsRover = new MarsRover(3,3,"");
	
	@Test
	public void executeCommand(){
		assertEquals("(1,2,E)",marsRover.executeCommand("ffqf"));
	}
	
}

package tdd.training.tests;

import static org.junit.Assert.*;

import java.util.regex.PatternSyntaxException;

import tdd.training.session1.*;
//import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {
	
	/*@Before
	public void setUp() throws MarsRoverException {
		
	}*/
	
	@Test(expected = MarsRoverException.class)
	public void testMarsRoverWrongClassCreation() throws MarsRoverException {
		MarsRover rover = new MarsRover(50, 50, "(10,10)(");
	}
	
	@Test
	public void testMarsRoverCorrectClassCreation() throws MarsRoverException {
		MarsRover rover = new MarsRover(50, 50, "(10,10)(5,5)");
		
	}

}

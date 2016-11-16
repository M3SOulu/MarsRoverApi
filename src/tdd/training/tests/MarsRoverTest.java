package tdd.training.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import tdd.training.session1.MarsRover;


public class MarsRoverTest {	
	@Test
	public void test1() {

		//Arrange
		MarsRover mars = new MarsRover();
		testRover.Test("ffrf");

		//Act
		String score = testRover.Test();
		
		//Assert
		assertEquals("12E", score);
}

}

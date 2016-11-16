package tdd.training.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import tdd.training.session1.*;


public class MarsRoverTest {	
	@Test
	public void test1() {

		//Arrange
		MarsRover mars = new MarsRover();
		mars.executeCommand("ffrf");
		
		//Assert
		assertEquals("12E", position);
}

}

package tdd.training.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import tdd.training.session1.*;


public class MarsRoverTest {	
	@Test
	public void test1() {

		//Arrange
		MarsRover mars = new MarsRover(0, 0, null);

		//Act
		String score = mars.Test("ffrff");
		
		//Assert
		assertEquals("22E", score);
	}

}

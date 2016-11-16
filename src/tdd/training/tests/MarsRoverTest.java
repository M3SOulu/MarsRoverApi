package tdd.training.tests;

import static org.junit.Assert.*;

import org.junit.Test;

public class MarsRoverTest {	
	@Test
	public void test1() {
		//Arrange
		MarsRover test = new MarsRover();

		//Act
		String score = test.Test();
		
		//Assert
		assertEquals("love" + "love", score);
}

}
